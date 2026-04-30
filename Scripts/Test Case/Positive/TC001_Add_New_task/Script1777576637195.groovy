import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// 1. Start Application
Mobile.startApplication('C:\\Users\\renal\\Downloads\\Todo_2.0_APKPure.apk', true)

// 2. Navigasi Awal
Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.TextView - Skip (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.ImageButton (3)'), 0)

// 3. Input Task Details
Mobile.setText(findTestObject('Object Repository/Recorder/android.widget.EditText - Enter task title (2)'), taskTitle, 0)

Mobile.setText(findTestObject('Object Repository/Recorder/android.widget.EditText - Enter your task (3)'), task, 0)

// 4. Set Date & Time
Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.EditText - Set Date (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorder/android.view.View - 1'), 0)

Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.Button - OK (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.EditText - Set Time (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.Button - OK (5)'), 0)

// Klik Dropdown Kategori
Mobile.tap(findTestObject('android.widget.TextView - Banking'), 0)

// --- BAGIAN UTAMA: SWITCH CASE UNTUK PEMILIHAN ---
String kategoriTarget = kategoriTarget // Pastikan variabel ini memiliki nilai string

switch (kategoriTarget) {
    case 'Banking':
        Mobile.tap(findTestObject('android.widget.CheckedTextView - Banking'), 5)

        println('Case 1: Memilih Banking')

        break
    case 'Personal':
        Mobile.tap(findTestObject('android.widget.CheckedTextView - Personal'), 5)

        println('Case 2: Memilih Personal')

        break
    default:
        println("Kategori '$kategoriTarget' tidak ada di daftar cepat. Menjalankan pengecekan If-Else...")

        boolean isExist = Mobile.verifyElementVisible(findTestObject('Object Repository/Recorder/android.widget.CheckedTextView - Sendiri'), 
            5, FailureHandling.OPTIONAL)

        if (isExist) {
            Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.CheckedTextView - Sendiri'), 0)

            println('Hasil IF: Objek ditemukan, langsung di-tap.') // Setelah ditambah, buka kembali dropdown dan pilih
        } else {
            println('Hasil ELSE: Objek tidak ditemukan. Menambah kategori baru...')

            Mobile.tap(findTestObject('android.widget.CheckedTextView - Banking'), 0)

            Mobile.tap(findTestObject('Recorder/android.widget.tambahcategory'), 0)

            Mobile.setText(findTestObject('Recorder/android.widget.EditText - Enter category (1)'), kategoriTarget, 0)

            Mobile.tap(findTestObject('Recorder/android.widget.Button - ADD'), 0)

            Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.TextView - Banking (2)'), 5)

            Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.CheckedTextView - Sendiri'), 5)
        }
        
        break
}

// 5. Simpan Task
Mobile.tap(findTestObject('Object Repository/Recorder/android.widget.TextView (2)'), 0)

// --- VERIFIKASI AKHIR DINAMIS MENGGUNAKAN SWITCH CASE ---
println('Memulai verifikasi akhir untuk kategori: ' + kategoriTarget)

switch (kategoriTarget) {
    case 'Banking':
        Mobile.verifyElementVisible(findTestObject('Recorder/android.widget.TextView - BankingLagi'), 0)

        break
    case 'Personal':
        Mobile.verifyElementVisible(findTestObject('android.widget.TextView - Personal'), 0)

        break
    case 'Sendiri':
        Mobile.verifyElementVisible(findTestObject('Recorder/android.widget.TextView - Sendiri'), 0)

        break
    // Jika kategori custom lainnya, verifikasi menggunakan objek generic atau lewati
    default:
        println('Verifikasi default untuk kategori custom: ' + kategoriTarget)

        Mobile.verifyElementVisible(findTestObject('Object Repository/Recorder/android.widget.TextView - ' + kategoriTarget), 
            5, FailureHandling.OPTIONAL)

        break
}

Mobile.closeApplication()


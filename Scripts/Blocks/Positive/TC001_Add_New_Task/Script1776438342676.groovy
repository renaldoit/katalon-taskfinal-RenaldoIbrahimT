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

Mobile.startApplication('C:\\Users\\renal\\Downloads\\Todo_2.0_APKPure.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter task title'), 'Alarm Bangun Tidur', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your task'), 'Berhasil Bangun Jam 4', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View - 17'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Banking'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Personal'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView - Berhasil Bangun Jam 4'), 'Berhasil Bangun Jam 4')

Mobile.closeApplication()


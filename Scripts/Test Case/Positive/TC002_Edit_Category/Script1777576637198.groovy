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

Mobile.tapAndHold(findTestObject('Object Repository/android.widget.TextView - Skip (1)'), 2, 60)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Category'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Personal'), 'Pribadi', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - UPDATE'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Dashboard'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter task title (1)'), 'Alarm Baru', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your task (2)'), 'Baru', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Set Date (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View - 30'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Set Time (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (3)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Pribadi'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView - Pribadi'), 'Pribadi')

Mobile.closeApplication()


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

Mobile.tapAndHold(findTestObject('Object Repository/android.widget.TextView - Skip (2)'), 2, 60)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter task title (2)'), 'Delete Task', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your task (3)'), 'Delete Task', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.EditText - Set Date (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View - 30 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Banking (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.CheckedTextView - Personal (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Delete'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - DELETE'), 0)

Mobile.waitForElementNotPresent(findTestObject('android.widget.TextView - Pribadi'), 0)

Mobile.closeApplication()


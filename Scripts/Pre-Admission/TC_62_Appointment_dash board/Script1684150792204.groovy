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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/Pre-admission Tab'),
	'Pre admission tab')

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_62_Appointment_dash board/Appointment dashboard option'), "Appointment dashboard option")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_61_Verified_Follow-uo_Dash board/Fromdate'), "01/01/2023" , "fromdate")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_61_Verified_Follow-uo_Dash board/todate') , "05/15/2023" , "todate")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_61_Verified_Follow-uo_Dash board/Search button'), "Search")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_62_Appointment_dash board/Appointment dashboard header'), "Appointment dashboard header")

WebUI.delay(2)

WebUI.refresh()
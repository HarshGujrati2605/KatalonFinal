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

WebUI.callTestCase(findTestCase('Pre-Admission/TC_01_Validate the login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Admissions Tab'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Admissions Tab'),
	'Admissions tab')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_54_Validate_Application_Search_Filter/Applications'), 
    'Application tab')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_54_Validate_Application_Search_Filter/Application Tab'), "Application tab")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Search button'), 'search button')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_54_Validate_Application_Search_Filter/Search results header') , "Search results header")

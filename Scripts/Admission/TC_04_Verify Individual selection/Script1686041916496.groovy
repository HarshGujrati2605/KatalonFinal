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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_02_Verify_Not Configured combination/Not Configured combinations'),
	'Not configured checkbox')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Search button'), 'Search button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Row Selection'), 'Second row from data')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_02_Verify_Not Configured combination/Configure Combination button'),
	'Configure combination')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_02_Verify_Not Configured combination/Assesment stage dropdown'),
	'Assesment process')

CustomKeywords.'CommonActions.selectDropdownOptionCustom'(findTestObject('Object Repository/Admission/TC_02_Verify_Not Configured combination/List of dropdown'),
	GlobalVariable.AssesmentProcessNameWithStage)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_04_Verify Individual selection/Individual selection'), "Individual selection radio button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Save button'), "Save button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Record added alert'), "Assesment name added / updated alert")



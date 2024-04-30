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

WebUI.mouseOver(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/Pre-admission Tab'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/Pre-admission Tab'),
	'Pre admission tab')

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_25_Verified_Managge target_Search_Functionality/click on manage target'),"Manage target tab")

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_25_Verified_Managge target_Search_Functionality/intake year dropdown'), 6)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_25_Verified_Managge target_Search_Functionality/Search Button'), "Search button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_29_Verified_Lead_Target/Lead target'),  "Lead target")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_29_Verified_Lead_Target/Lead target input'), "100" , "Lead target input field")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_25_Verified_Managge target_Search_Functionality/ListOfGradesHeader'), "List of Grades")
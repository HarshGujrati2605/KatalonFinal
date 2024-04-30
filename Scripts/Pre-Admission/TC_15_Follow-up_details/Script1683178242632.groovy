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

WebUI.scrollToElement(findTestObject('Object Repository/preadmission/TC_11_Edit_Student_Details/Lead deatils header'),
	30)

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_15_Follow-up_details/Follow up details tab'), "follow up details")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_15_Follow-up_details/Activity type dropdown'), "Open")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_15_Follow-up_details/Reason for followup dropdown'), "Book a School Tour")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_15_Follow-up_details/Followup status'),"Open")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_15_Follow-up_details/Stage dropdown'),"Contacted")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_15_Follow-up_details/Save button follow up details'), "Save button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Success edit message'), "Success alert")
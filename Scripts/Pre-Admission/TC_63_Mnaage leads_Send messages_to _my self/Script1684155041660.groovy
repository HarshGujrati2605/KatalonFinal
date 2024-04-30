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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Manage lead tab') , 'Manage lead tab')


WebUI.focus(findTestObject('Object Repository/preadmission/TC_08_search_Leads/Search lead button'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_08_search_Leads/Search lead button'), "Search")

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Checkmark for lead created'), "Selecting lead")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_63_Mnaage leads_Send messages_to _my self/Send message button'),"Send message button")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_63_Mnaage leads_Send messages_to _my self/Message ID'), "SMS")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_63_Mnaage leads_Send messages_to _my self/Subject line'), "Test subject" , "Subject line")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_63_Mnaage leads_Send messages_to _my self/Submit button'), "Submit button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_63_Mnaage leads_Send messages_to _my self/Message sent successful alert') , "Alert message after message sent")


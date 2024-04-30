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

WebUI.focus(findTestObject('Object Repository/preadmission/TC_08_search_Leads/Search lead button'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_08_search_Leads/Search lead button'), "Search")

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Checkmark for lead created'), "Selecting lead")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Edit Lead'), "Edit lead button")

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Country Lead details'), 1)

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Country Region') , 1)

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/City Lead details'), 1)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Comment lead details'), "test comment using automation" , "Comment field")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Save Lead details'), "Save button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_10_Edit_Lead_Details/Success edit message'), "Success alert after editing lead details")

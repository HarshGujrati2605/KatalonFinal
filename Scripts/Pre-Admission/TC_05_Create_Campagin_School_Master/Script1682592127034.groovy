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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/Campaign school master tab'), 
    'School master tab')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/Add school button'), 
    'Add button')

WebUI.delay(4)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/School Code'), 
    CustomKeywords.'CommonActions.randomSchoolCodeGenerator'(), 'School code field')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/School name'), 
    CustomKeywords.'CommonActions.randomSchoolNameGenerator'(), 'School name field')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_06_Edit_School _Campaign_Master/Save Button campaign master'), 
    'Save button')

WebUI.delay(1)

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/School creation success message'), 
    'Success message after school creation')

//WebUI.delay(2)
//
//WebUI.scrollToElement(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/Total records'), 30)
//CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_05_Create_Campaign_School_Master/Total records'), 
//    'Total records')


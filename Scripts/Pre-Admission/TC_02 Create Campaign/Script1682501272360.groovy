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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/ManageCampaignOption'), 
    'Manage Capaign Option')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/AddCampaignButton'), 
    'Campaign Add button')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/CampaignName'), 
    CustomKeywords.'CommonActions.randomStringCodeGenerator'(4), 'Campaign name field')

WebUI.sendKeys(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/CampaignName'), Keys.chord())

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/FromDatePickerCreateCampaign'), 
    'From date picker')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/TodayButtonFromDate'), 
    'Today date button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/ToDatePickerCreateCampaign'), 
    'To date picker')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/TodayButtonToDate'), 
    'Today date button')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/BudgetAmountField'), 
    '25000', 'Budget amout')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonField'), 
    'test', 'Contact person field')

 WebUI.delay(1)
 
 WebUI.sendKeys(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonField'), Keys.chord(Keys.DOWN))
 
 WebUI.sendKeys(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonField'), Keys.chord(Keys.ENTER))

 
//
//CustomKeywords.'CommonActions.elementClick'(findTestObject('preadmission/TC_02 Create Campaign/ConatctPersonDropdownption'), 
//    'Contact person first dropdown option')



CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/CommentField'), 
    'test comment using automation', 'Comment field')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/MediaNameDropdownIcon'), 
    'Media name dropdown icon')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/SelectAllOptionMediaNameDropdown'), 
    'Select all')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/DismissMediaNameDropdown'), 
    'Dropdown dismissed')

CustomKeywords.'CommonActions.elementClick'(findTestObject('preadmission/TC_02 Create Campaign/AddBrandButton'), 'Add campain button')

//CustomKeywords.'CommonActions.elementClick'(findTestObject('preadmission/TC_02 Create Campaign/BrandCampusFirstOptionCheckMark'),
//    'Brand capmus check mark first option')
WebUI.focus(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/ClinkEnterContactPersonFirstData'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('preadmission/TC_02 Create Campaign/ClinkEnterContactPersonFirstData'), 
    'Click to enter')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonFieldAfterClicktoenter'), 
    GlobalVariable.ContactPersonCampaign, 'contact person')

WebUI.delay(1)
//
//WebUI.sendKeys(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonFieldAfterClicktoenter'), Keys.chord(Keys.DOWN))
//
//WebUI.sendKeys(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonFieldAfterClicktoenter'), Keys.chord(Keys.TAB))

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('preadmission/TC_02 Create Campaign/ContactPersonFieldAfterClicktoenter'), 2)

WebUI.click(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/Nextbutton'))

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('preadmission/TC_02 Create Campaign/BrandCampuscheckmark'), 
    'Brand Option first checkmark')

WebUI.delay(4)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/SubmitButton'), 
    'Submit button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/SaveCampaignButton'), 
    'Save button')

WebUI.delay(1)


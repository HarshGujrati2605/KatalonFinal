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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Add Leads') , "Add leads button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/LeadSalutationDropdown'), "Lead Salutation dropdown")

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/LeadSalutationDropdown'), 2)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/EnquiryFirtsname'), CustomKeywords.'CommonActions.randomPersonNameGenerator'() , "First name enquiry" )

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/EnquiryEmailID'), CustomKeywords.'CommonActions.randomEmailGenerator'() , "Enquiry email" )

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Mobile number'), "8989898989" , "Mobile number")

//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/EnquiryDateSelector'), "Enuiry DOB selector")
//
//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/EnquiryDOB'), "Enquiry dob")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/EnquiryModeDropdownArrow'), "Source of enquiry")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Select All Dropdown option'),"Select all")


CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/SourceOfEnquiryDropdown'), 2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Add student button'), "Add student button")

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Student salutation dropdown') , 2)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Student name'), CustomKeywords.'CommonActions.randomPersonNameGenerator'() , "Student name"  )

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Program Dropdown arrow'), "Program dropdown")

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Student program option'), "Program option")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Student DOB'), "05/01/2023" , "DOB Student")

WebUI.delay(2)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Mobile Number field student'), "8989898989" , "Student mobile number")

//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Student dob selector') , "DOB Selector")
//
//WebUI.delay(2)

//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Pre-Admision/TC_08_Create_Lead/Student DOB'), "Student dob")

//WebUI.focus(findTestObject('Object Repository/Pre-Admision/TC_08_Create_Lead/Student DOB'))
//
//WebUI.click(findTestObject('Object Repository/Pre-Admision/TC_08_Create_Lead/Student DOB'))





CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Save button student') , "Save student button")

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Save Button enquiry'), "Save button enuiry")

WebUI.delay(1)

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_09_Create_Lead/Save lead success alert'), "Success alert after saving lead lead")


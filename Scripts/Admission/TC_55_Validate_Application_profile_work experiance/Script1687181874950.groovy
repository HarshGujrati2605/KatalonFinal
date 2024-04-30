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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Search button'), 'search button')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_54_Validate_Application_Search_Filter/Search results header') , "Search results header")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Row Selection') , "First row is selected")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Edit Buttton') , "Edit button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_55_Validate_Application_profile_work experiance/History tab') , "History")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_55_Validate_Application_profile_work experiance/Work experience option'), "Work experience")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Nested Tab Add button'),"Add button experience")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_55_Validate_Application_profile_work experiance/Employer text field'), "Test employee" , "Employer text field")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_55_Validate_Application_profile_work experiance/department text field') , "Test departnment" , "Department text field")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_55_Validate_Application_profile_work experiance/Joining date'),"Joining date")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Today button calendar'), "Today button calendar")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Submit Button Floating Window'), "Save experience")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/CommonObjects/Successful alert') , "Saved work experience")
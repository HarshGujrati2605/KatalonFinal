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

CustomKeywords.'CommonActions.elementClick'(findTestObject('preadmission/TC_02 Create Campaign/Pre-admission Tab'), 'Pre admission tab')

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Manage target by staff'), 
    'Manage target by staff')

WebUI.delay(2)

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Intake year staff'), 
    6)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Search'), 
    'Search button')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Presentation Targets header'), 
    'Presentation target header')


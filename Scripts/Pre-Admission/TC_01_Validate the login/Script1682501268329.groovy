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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/preadmission/TC_01/Page_Academia/Admin_tab'))

CustomKeywords.'CommonActions.clickOnElementAndTypeText'( findTestObject('Object Repository/preadmission/TC_01/Page_Academia/input_Username  Email_email'),GlobalVariable.Username , "Username textfield" )

CustomKeywords.'CommonActions.clickOnElementAndTypeText'( findTestObject('Object Repository/preadmission/TC_01/Page_Academia/input_Password_password'),GlobalVariable.Password , "Password textfield" )

CustomKeywords.'CommonActions.elementClick'( findTestObject('Object Repository/preadmission/TC_01/Page_Academia/input_Forgot password_signin'), "Sign in button")

WebUI.delay(30);

CustomKeywords.'CommonActions.elementPresent'( findTestObject('Object Repository/preadmission/TC_01/Page_Academia/label_Administrator'), "Adminstartor portal header")

CustomKeywords.'CommonActions.verifyExactElementText'(findTestObject('Object Repository/preadmission/TC_01/Page_Academia/label_Administrator'),GlobalVariable.AdminPortalHeaderText, "Adminstartor portal header" )
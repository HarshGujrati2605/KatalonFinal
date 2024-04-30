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

CustomKeywords.'CommonActions.selectLastRow'(findTestObject('Object Repository/Admission/TC_34_Validate the Applicant Portal Setup Edit/List of Applicant setup'))
WebUI.delay(4)
CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Edit Buttton'),'Edit button')

WebUI.delay(4)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Row Selection two'),"second row")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_34_Validate the Applicant Portal Setup Edit/click to enter application status'),'Application status')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_34_Validate the Applicant Portal Setup Edit/click on arrow'),'arrow')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_34_Validate the Applicant Portal Setup Edit/select tab'),'applied')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Save button'),'save nutton')


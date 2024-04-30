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

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Minimum seat limit label'), "seat limit header")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Seat limit'), "1" , "Seat limit")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Maximum seat') , "500" , "Max seat limit")

CustomKeywords.'CommonActions.elementClick'( findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Start date') , "Form Start date ")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Today Start date'), "Today")

CustomKeywords.'CommonActions.elementClick'( findTestObject('Object Repository/Admission/TC_07_Verify seat limit/End date') , "Form end date")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Today End date'), "Today end date")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_07_Verify seat limit/Save button'), "Save button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Record added alert'), "Assesment name added / updated alert")

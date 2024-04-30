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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_13_Edit_Admission_Details/List of admissions'), "Admission details row")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_13_Edit_Admission_Details/Edit Admission details'), "Edit button")

WebUI.sendKeys(findTestObject('Object Repository/preadmission/TC_12_Add_admission_details/Brand campus dropdown'), Keys.chord(Keys.CONTROL , 'a'))

WebUI.sendKeys(findTestObject('Object Repository/preadmission/TC_12_Add_admission_details/Brand campus dropdown'), Keys.chord(Keys.DELETE))

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_12_Add_admission_details/Brand campus dropdown'), "Lonehill")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_12_Add_admission_details/Grade code dropdown') , "dba grade")

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_12_Add_admission_details/Save admission details button'), "Save button")



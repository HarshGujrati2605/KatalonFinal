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

WebUI.callTestCase(findTestCase('Pre-Admission/TC_01_Validate the login'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.mouseOver(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades and Subjects'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades and Subjects'),
	'Grades and subjects')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades tab'),
	'Grades Tab')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Search button'),
	'search button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_05_Verified_Delete_program/ROW selection'),'select first row')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_05_Verified_Delete_program/Delete button'),'delete button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_05_Verified_Delete_program/Yes Button'),'yes confirm button')
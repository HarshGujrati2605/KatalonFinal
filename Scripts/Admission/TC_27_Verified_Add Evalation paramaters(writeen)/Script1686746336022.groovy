import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

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

WebUI.mouseOver(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Admissions Tab'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Admissions Tab'),
	'Admissions tab')

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Assesment process'),
	'Assesment process')
CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Add button'), 'Add button')

GlobalVariable.AssesmentProcessNameWithStage = CustomKeywords.'CommonActions.randomNameGenerator'()

System.out.println(GlobalVariable.AssesmentProcessNameWithStage)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Assesement process name'),
	GlobalVariable.AssesmentProcessNameWithStage, 'Asssement name field')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Assesment process dropdown'),
	'Assesment process dropdown')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Admission option'),
	'Admission option')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Save button'), 'Save button')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Record added alert'), "Assesment name added alert")

CustomKeywords.'CommonActions.selectLastRow'(findTestObject('Object Repository/Admission/TC_20_Verified_Edit_selection process/List of Assesment'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Edit Buttton'), "Edit last row")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Nested Tab Add button'), 'Add button')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Stage ID dropdown'), "Assessment Stage" , "Stage Dropdowm")

WebUI.sendKeys(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Stage ID dropdown'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Expected Number of days stage') , "Number of days")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Submit Button Floating Window'), "Submit button")

WebUI.delay(3)

CustomKeywords.'CommonActions.elementClick'( findTestObject('Object Repository/Admission/CommonObjects/Nested Tab rows'), "first row")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/More Actions Button') , "More action button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Configure stage'), "Configure stage")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Configure Add button'), 'Add button')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Evalution Parameter'), "Written" , "Evalution Parameter")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Maximum Marks field') , "100", "Maximum marks")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Admission/TC_37_Pre-requisites Assesment process creation with Stage/Weightage field') , "75" , "Weightage")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/CommonObjects/Floating window save button'), 'Save button')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Admission/TC_01_ Pre-requisites for Admission/Record added alert'), "Assesment name added / updated alert")


 CustomKeywords.'CommonActions.elementClick'( findTestObject('Object Repository/Admission/CommonObjects/Save button nested'), "Save button")










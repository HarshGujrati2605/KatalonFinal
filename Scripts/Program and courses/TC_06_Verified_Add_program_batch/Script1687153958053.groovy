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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades and Subjects'),
	'Grades and subjects')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades tab'),
	'Grades Tab')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Search button'),
	'search button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/ROW selection'),'select first row')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Program batch'),'Program batch button')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Add button'),'add button')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Name'),'ALMTech 2023','program batch filed')

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/intake year'),6)

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/SeatCapacity'), '200','seat capcity filed')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/StartDate'),'Start date')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/Common objects/CommonObjects/Today button calendar'),'Today')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/TillDate'),'till date')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Min Period'),"6", 'minperiod filed')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Maxperiod'),"12",'Maxperiod fieled')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Comments'),'alm test','additional comment')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Program Min Credit'),"2",'program min credit')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Program Max credits'),"4",'Program max credit')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/program min courses'),'2', 'min course')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/program maz courses'), "4" ,'max course')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/prgramMin compulsary course'), "1",'Min compulsary courses')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/programMax compulsary courses'),"2",'Max compulsary courses')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/programMin optional courses'),"1",'min optional course')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/prgramMax optional courses'),"2",'max optiona;courses')


CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/CGPA'),"5",'mincgpa')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_06_Verified_Add_program_batch/Calender'),1)


CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/Common objects/CommonObjects/Save button'),'save button')


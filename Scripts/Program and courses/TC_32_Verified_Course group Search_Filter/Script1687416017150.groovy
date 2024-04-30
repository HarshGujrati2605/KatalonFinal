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

WebUI.mouseOver(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades and Subjects'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_01_Verified_program_serach_filter/Grades and Subjects'),
	'Grades and Subjects')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_32_Verified_Course group Search_Filter/Course group'),'course group Tab')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_32_Verified_Course group Search_Filter/Search button'),'search button')

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/Program and courses/TC_32_Verified_Course group Search_Filter/Header'),'course group harader details')
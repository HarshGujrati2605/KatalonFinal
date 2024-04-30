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

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_81_Set_default_prioirty/Manage school tab'), "Manage school tab")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_06_Edit_School _Campaign_Master/Created school campaign'), 
    'School campaign from list')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_07_Delete_School_master/Delete Button Campaign'), 
    'delete school campaign')

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_07_Delete_School_master/No button') , "No option")

WebUI.refresh()

//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_07_Delete_School_master/Yes button'), 
//    'Yes button')
//
//WebUI.delay(1)
//
//CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_07_Delete_School_master/Delete alert message'), 
//    'Delete aalert messaged')


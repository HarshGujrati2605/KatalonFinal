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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_81_Set_default_prioirty/School list second row'), "School list second row data")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_82_Copy_Mapping/Copy Mapping Button'), "Copy Mapping")

CustomKeywords.'CommonActions.selectionOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_82_Copy_Mapping/Brand campus dropdown') ,GlobalVariable.BrandCampusMapping )

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_82_Copy_Mapping/Intake year win'), 6)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_82_Copy_Mapping/Save NVP button') , "Save nvp button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_81_Set_default_prioirty/yes button') , "Yes button")

WebUI.delay(2)

//CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_81_Set_default_prioirty/School priority alert message'), "Priority message")
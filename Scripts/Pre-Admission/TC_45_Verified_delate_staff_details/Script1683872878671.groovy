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

//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Staff details filter'), "Staff details filter")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Add staff button'), "Add button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_45_Verified_delate_staff_details/Delete button staff'), "Delete button staff")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_45_Verified_delate_staff_details/Yes button'), "yes button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_45_Verified_delate_staff_details/Delete message'), "Delete message")


WebUI.delay(4)

WebUI.refresh()
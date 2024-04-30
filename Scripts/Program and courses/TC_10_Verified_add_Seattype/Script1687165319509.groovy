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


CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_10_Verified_add_Seattype/More details'),'click more link')

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Program and courses/TC_10_Verified_add_Seattype/Add button'),'add button')

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/Program and courses/TC_10_Verified_add_Seattype/Add seat type'),'seatType','seatType dropdown')

WebUI.sendKeys(findTestObject(findTestObject('Object Repository/Program and courses/TC_10_Verified_add_Seattype/Add seat type'), Keys.chord(Keys.ENTER))

CustomKeywords.'CommonActions.clickOnElementAndTypeText(findTestObject('Object Repository/Program and courses/TC_10_Verified_add_Seattype/Seat capacity'),
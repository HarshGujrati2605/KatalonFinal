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

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/offer letter checkbox'), "Offer letter checkbox")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/Offerletter start date'), "Admission start date")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/Today Button start'), "Today button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/Offer letter expiry date'), "Last date of admission")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/Today button end date'), "Today button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/Max days to accept offer') , "Max days to accept offer")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/Admission/TC_13_Verify with offer letter applicable/Max days to accept offer') , "Max days to accept offer")



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

WebUI.mouseOver(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/Pre-admission Tab'))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_02 Create Campaign/Pre-admission Tab'),
	'Pre admission tab')

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Manage target by staff'),
	'Manage target by staff')


WebUI.delay(2)

CustomKeywords.'CommonActions.selectOptionFromDropdown'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Intake year staff'), 6)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Search'), "Search button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_37_Verified_Manage target_by_staff_Search functionality_by_Presentation/Presentation Targets header'), "Presentation target header")

//CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Staff details filter'), "Staff details filter")

WebUI.delay(2)

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Add staff button'), "Add button")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Add button staff details') , "Add button staff details")

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Click to enter column') , "Click on enter")


CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Sales staff input field'), GlobalVariable.SalesStaff , "Sales staff")

WebUI.sendKeys(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Sales staff input field'), Keys.chord(Keys.ENTER))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Sales presentation column') , "Sales presentation")

CustomKeywords.'CommonActions.clickOnElementAndTypeText'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Sales staff traget number'), "100" , "Sales target number")

WebUI.sendKeys(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Sales staff traget number'), Keys.chord(Keys.ENTER))

CustomKeywords.'CommonActions.elementClick'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Save button'), "Save button")

CustomKeywords.'CommonActions.elementPresent'(findTestObject('Object Repository/preadmission/TC_44_Verified_Add_staff_details/Staff details saving alert'), "Save alert staff details")













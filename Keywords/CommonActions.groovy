import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

import static org.junit.Assert.assertEquals

import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.util.KeywordUtil
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class CommonActions {

	@Keyword
	def elementClick(TestObject to , String nameofelement) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking on " + nameofelement)
			highlightElementred(to, nameofelement)
			element.click()
			KeywordUtil.markPassed(nameofelement + " clicked once")
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Failed to click on "+ nameofelement)
			highlightElementred(to, nameofelement)
		}
	}


	@Keyword
	def elementPresent(TestObject to , String name) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Validating element present or not")
			WebUI.waitForElementPresent(to, 30)
			if(element.displayed) {
				KeywordUtil.markPassed("Element clicked once")
				WebUI.comment(name +" is present")
				highlightElementGreen(to, name)
			}
			else {
				WebUI.scrollToElement(element, 30)
				KeywordUtil.markPassed("Element clicked once")
				WebUI.comment(name +" is present")
				highlightElementGreen(to, name)
			}
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Element not present or visible")
		}
	}


	@Keyword
	def scrolltillElementAndClick(TestObject to , String name) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("scrolling and clicking once the" + name +"  is displayed")
			if(element.displayed) {
				highlightElementGreen(to, name)
				WebUI.delay(2)
				element.click()
				KeywordUtil.markPassed(name +"scrolled and clicked")
			}
			else {
				WebUI.scrollToElement(element, 30)
				highlightElementGreen(to, name)
				WebUI.delay(2)
				element.click()
				KeywordUtil.markPassed(name +"scrolled and clicked")
			}
		}
		catch (Exception e) {
			KeywordUtil.markFailed(name + " not present or visible")
		}
	}


	@Keyword
	def verifyExactElementText(TestObject to , String expectedtext , String nameofelement) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			if(element.displayed) {
				String actualtext = element.getText()
				assertEquals(expectedtext, actualtext)
				KeywordUtil.markPassed(nameofelement +"text is verified")
				highlightElementGreen(to, nameofelement)
			}
			else {
				WebUI.scrollToElement(element, 30)
				String actualtext = element.getText()
				assertEquals(expectedtext, actualtext)
				KeywordUtil.markPassed(nameofelement +"text is verified")
				highlightElementGreen(to, nameofelement)
			}
		}
		catch (Exception e) {
			KeywordUtil.markFailed(nameofelement + " not present or visible")
		}
	}

	@Keyword
	public static void highlightElementGreen(TestObject to , String nameofelement) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to, 30);
			if(element.displayed)	{
				WebUI.executeJavaScript("arguments[0].setAttribute('style', 'border: 2px solid green;');", Arrays.asList(
						element))
				WebUI.delay(1)
			}
			else {
				WebUI.scrollToElement(element, 30)
				WebUI.executeJavaScript("arguments[0].setAttribute('style', 'border: 3px solid green;');", Arrays.asList(
						element))
				WebUI.delay(1)
			}

		} catch (Exception e) {
			KeywordUtil.markFailed(nameofelement + " not present or visible")

		}
	}


	@Keyword
	public static void highlightElementred(TestObject to , String nameofelement) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to, 30);
			if(element.displayed)	{
				WebUI.executeJavaScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", Arrays.asList(
						element))
				WebUI.delay(1)
			}
			else {
				WebUI.scrollToElement(element, 30)
				WebUI.executeJavaScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", Arrays.asList(
						element))
				WebUI.delay(1)
			}

		} catch (Exception e) {
			KeywordUtil.markFailed(nameofelement + " not present or visible")

		}
	}

	@Keyword
	public static void clickOnElementAndTypeText(TestObject to ,String Value, String nameofelement) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to, 30);
			if(element.displayed)	{
				highlightElementred(to, nameofelement)
				element.click()
				WebUI.delay(1)
				WebUI.sendKeys(to, Keys.chord(Keys.CONTROL , 'a'))
				WebUI.sendKeys(to, Keys.chord(Keys.DELETE))
				WebUI.delay(1)
				element.sendKeys(Value)
				highlightElementGreen(to, nameofelement)
				KeywordUtil.logInfo("Sent " + Value + "to the " + nameofelement)
			}
			else {
				WebUI.scrollToElement(element, 30)
				highlightElementred(to, nameofelement)
				element.click()
				WebUI.delay(1)
				WebUI.sendKeys(to, Keys.chord(Keys.CONTROL , 'a'))
				WebUI.sendKeys(to, Keys.chord(Keys.DELETE))
				WebUI.delay(1)
				element.sendKeys(Value)
				highlightElementGreen(to, nameofelement)
				KeywordUtil.logInfo("Sent " + Value + "to the " + nameofelement)
			}

		} catch (Exception e) {
			KeywordUtil.markFailed(nameofelement + " not present or visible")

		}
	}

	@Keyword
	public static String schoolCodeGenrator() {
		def chars = "abc0123456789"
		def school = "SCH"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<4; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return school+sb.toString();
	}


	@Keyword
	public static String randomStringCode(int length) {
		String chars = "abc0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "SCH"+sb.toString();

	}

	@Keyword
	public static String randomSchoolName() {
		String chars = "0123456789ABCDEFGHabcdefgh"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<4; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Serosoft public school Indore Automation "+sb.toString();

	}

	@Keyword
	public static String randomStringCodeGenerator(int length) {
		String chars = "abcdefgh0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<length; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "AUtomation test"+sb.toString();

	}

	@Keyword
	public static String randomSchoolCodeGenerator() {
		String chars = "abcdefgh0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<4; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "SCHCODE "+sb.toString();

	}


	@Keyword
	public static String randomSchoolNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "SCHNAME Automation "+sb.toString();
	}


	@Keyword
	public static String randomPersonNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automation name"+sb.toString();

	}


	@Keyword
	public static String randomEmailGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automationtest@"+sb.toString()+ ".com";

	}


	@Keyword
	public static void selectOptionFromDropdown(TestObject to , int optionnumber) {
		WebUI.delay(2)
		WebUI.click(to)
		WebUI.delay(1)
		for (int i=1 ; i<optionnumber; i++) {
			WebUI.sendKeys(to, Keys.chord(Keys.DOWN))
		}
		WebUI.sendKeys(to, Keys.chord(Keys.TAB))
	}


	@Keyword
	public static void selectionOptionFromDropdown(TestObject to , String optionname) {
		WebUI.sendKeys(to, Keys.chord(Keys.CONTROL , 'a'))
		WebUI.sendKeys(to, Keys.chord(Keys.DELETE))
		WebUI.sendKeys(to, optionname)
		WebUI.delay(1)
		WebUI.sendKeys(to, Keys.chord(Keys.ENTER))
		WebUI.delay(2)
		WebUI.sendKeys(to, Keys.chord(Keys.TAB))
	}


	@Keyword
	public static String randomNameGenerator() {
		String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<6; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}
		return "Automation"+sb.toString();

	}


	@Keyword
	public static void selectDropdownOptionCustom(TestObject to , String optionname) {
		List<WebElement> pending = WebUI.findWebElements(to ,30 )
		for(WebElement ele : pending) {
			System.out.println(ele.getText())
			if(ele.getText().equals(optionname)) {
				WebUI.executeJavaScript("arguments[0].scrollIntoView(true);", Arrays.asList(ele))
				WebUI.delay(2)
				ele.click()
				break
			}

		}

	}

	@Keyword
	public static void selectLastRow(TestObject to) {
		List<WebElement> pending = WebUI.findWebElements(to ,30 )
		int size = pending.size()
		WebUI.delay(2)
		pending[size-1].click()
	}

	@Keyword
	public static void selectFirstRow(TestObject to) {
		List<WebElement> pending = WebUI.findWebElements(to ,30 )
		int size = pending.size()
		WebUI.delay(2)
		pending[1].click()
	}


}

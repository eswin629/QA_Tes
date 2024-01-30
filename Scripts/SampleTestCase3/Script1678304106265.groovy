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

//open browser
WebUI.openBrowser("http://lifecharger.org/")
//click
WebUI.click(findTestObject('Object Repository/testcase3/Page_Welcome lifecharger.org - BlueHost.com/a_Web Hosting - courtesy of www.bluehost.com'))
//set text
not_run: WebUI.setText(findTestObject('Object Repository/testcase3/Page_Welcome lifecharger.org - BlueHost.com/a_10 Best Smartphones'),"smartphone")
//verify element
not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/testcase3/Page_Welcome lifecharger.org - BlueHost.com/iframe_Web Hosting - courtesy of www.bluehost.com_ad_frame'),4)
//close browser
WebUI.closeBrowser()
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

WebUI.openBrowser('')

WebUI.navigateToUrl('opensource-demo.orangehrmlive.com')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_OrangeHRM/button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Add'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_OrangeHRM/input_firstname'), 'kaniel')

WebUI.setText(findTestObject('Page_OrangeHRM/input_middlename'), 'kaniel')

WebUI.setText(findTestObject('Page_OrangeHRM/input_lastname'), 'outis')

WebUI.uploadFile(findTestObject('Page_OrangeHRM/upload photo'), 'C:\\Users\\sapdi\\OneDrive\\Desktop\\Home.jpg')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_PIM'))

WebUI.setText(findTestObject('Page_OrangeHRM/employeeName'), 'kaniel')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Search'))

WebUI.delay(5)


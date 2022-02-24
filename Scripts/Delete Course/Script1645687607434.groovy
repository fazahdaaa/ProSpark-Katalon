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

WebUI.callTestCase(findTestCase('Login Trainer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Trainer Home/menuTraining'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Trainer Home/subMenuCourse'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_ProSpark  Courses/txtSearchCourse'), 'Test Automation')

WebUI.sendKeys(findTestObject('Page_ProSpark  Courses/txtSearchCourse'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_ProSpark  Courses/btnAssign - List'))

WebUI.click(findTestObject('btnUser - Tab'))

WebUI.click(findTestObject('Page_ProSpark  test/txtSearchUser - Remove'))

WebUI.setText(findTestObject('Page_ProSpark  test/txtSearchUser - Remove'), 'ihsan ')

WebUI.click(findTestObject('Page_ProSpark  test/cbxHeader - Remove'))

WebUI.click(findTestObject('Page_ProSpark  test/btnRemoveSelectedUser'))

WebUI.click(findTestObject('Page_ProSpark  Trainer Home/menuTraining'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Trainer Home/subMenuCourse'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_ProSpark  Courses/txtSearchCourse'), 'Test Automation')

WebUI.sendKeys(findTestObject('Page_ProSpark  Courses/txtSearchCourse'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_ProSpark  Courses/btnDeleteCourse - List'))

WebUI.click(findTestObject('Page_ProSpark  Courses/btnYes - Delete'))


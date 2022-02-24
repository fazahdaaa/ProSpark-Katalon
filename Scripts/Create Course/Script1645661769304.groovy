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

WebUI.click(findTestObject('Page_ProSpark  Trainer Home/menuTraining'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Trainer Home/subMenuCourse'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Courses/btnAddCourse'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_ProSpark  Create Course/txtCourseName'), 'Test Automation')

WebUI.click(findTestObject('Page_ProSpark  Create Course/ddlCategory'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/optAccounting - ddlCategory'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_ProSpark  Create Course/txtDescription'), 'This is Automation Test Using Katalon')

WebUI.click(findTestObject('Page_ProSpark  Create Course/txtStartDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnToday - Start Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/txEndDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnNextMonth'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnEndDate - time'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnEndDate - Time 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnEndDate - Time 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_ProSpark  Create Course/txtFailedAttempts'), '2')

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnSaveCourseDetail'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnOK'), FailureHandling.STOP_ON_FAILURE)


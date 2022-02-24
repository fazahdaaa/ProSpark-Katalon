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

WebUI.setText(findTestObject('Page_ProSpark  Courses/txtSearchCourse'), 'Test Automation')

WebUI.sendKeys(findTestObject('Page_ProSpark  Courses/txtSearchCourse'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Page_ProSpark  Courses/btnListCourse - 1'))

WebUI.click(findTestObject('Object Repository/test/a_Edit Course'))

WebUI.click(findTestObject('Object Repository/test/button_Add Section'))

WebUI.setText(findTestObject('Page_ProSpark  Create Course/txtSectionName'), 'Number 1')

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnSaveSection'))

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnOK - Create Section'))

WebUI.click(findTestObject('test/button_Add Item'))

WebUI.setText(findTestObject('Page_ProSpark  Create Course/txtSectionItem'), 'Number 1 - test')

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_Article                             _8a5c10'), 'video', 
    true)

WebUI.setText(findTestObject('Object Repository/test/input_Elements path_form-control video-content'), 'https://www.youtube.com')

//WebUI.click(findTestObject('test/input_Note Only youtube, vimeo and soundcloud can accept link_file1'), FailureHandling.STOP_ON_FAILURE)
//WebUI.uploadFile(findTestObject('test/input_Note Only youtube, vimeo and soundcloud can accept link_file1'), 'C:\\Users\\User\\Downloads\\gettyimages-1045983738-1')
//CustomKeywords.'customPackage.customFileUpload.uploadFile'(findTestObject('test/input_Note Only youtube, vimeo and soundcloud can accept link_file1'), 'C:\\Users\\User\\Downloads\\gettyimages-1045983738-1')
WebUI.click(findTestObject('Page_ProSpark  Create Course/btnSaveItem'))

WebUI.click(findTestObject('Page_ProSpark  Create Course/btnOK - Saved Item'))


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

//WebUI.callTestCase(findTestCase('Login Trainer'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Create Course'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://cleancode-stg.prospark.co/login')
//WebUI.setText(findTestObject('Object Repository/test/input_Login to your Account_username'), 'ihsantrainer')
//WebUI.setText(findTestObject('Object Repository/test/input_Login to your Account_password'), 'P@ssword123')
//WebUI.click(findTestObject('Object Repository/test/button_Sign In'))
WebUI.openBrowser('')

WebUI.navigateToUrl('https://cleancode-stg.prospark.co/login')

WebUI.setText(findTestObject('Object Repository/test/input_Login to your Account_username (2) (1)'), 'ihsantrainer')

WebUI.setText(findTestObject('Object Repository/test/input_Login to your Account_password (2) (1)'), 'P@ssword123')

WebUI.click(findTestObject('Object Repository/test/button_Sign In (2) (1)'))

WebUI.click(findTestObject('Object Repository/test/a_Add Course (1)'))

WebUI.setText(findTestObject('Object Repository/test/input__name (1)'), 'afsdsafasd')

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_-- Select Category --               _6be796 (1)'), 
    '5', true)

WebUI.setText(findTestObject('Object Repository/test/textarea_Description_description (1)'), 'asfddfadf')

WebUI.click(findTestObject('Object Repository/test/input_From_start_date (1)'))

WebUI.click(findTestObject('Object Repository/test/th_Today (1)'))

WebUI.click(findTestObject('Object Repository/test/input_To_end_date (1)'))

WebUI.click(findTestObject('Object Repository/test/th_Today (1)'))

WebUI.setText(findTestObject('Object Repository/test/input__number_of_failed_attempts (1)'), '2')

WebUI.click(findTestObject('Object Repository/test/button_Save                                _5032c7 (1)'))

WebUI.click(findTestObject('Object Repository/test/button_OK (2) (1)'))

WebUI.click(findTestObject('Object Repository/test/a_Courses (3) (1)'))

WebUI.click(findTestObject('Object Repository/test/a_afsdsafasd (1)'))

WebUI.click(findTestObject('Object Repository/test/a_Edit Course (2) (1)'))

WebUI.click(findTestObject('Object Repository/test/button_Add Section (1) (1)'))

WebUI.setText(findTestObject('Object Repository/test/input_Course Content_section-name-input (1) (1)'), 'afsdfsaf')

WebUI.click(findTestObject('Object Repository/test/button_Save (1) (1)'))

WebUI.click(findTestObject('Object Repository/test/button_OK (3) (1)'))

WebUI.click(findTestObject('Object Repository/test/button_Add Item (2) (1)'))

WebUI.setText(findTestObject('Object Repository/test/input_Section Item_course-item0name (2) (1)'), 'fsdfsda')

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_Article                             _8a5c10 (2) (1)'), 
    'file', true)

WebUI.click(findTestObject('Object Repository/test/div_Save (2) (1)'))

WebUI.click(findTestObject('Object Repository/test/button_OK (3) (1)'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cleancode-stg.prospark.co/login')

WebUI.setText(findTestObject('Object Repository/test/input_Login to your Account_username (3)'), 'ihsantrainer')

WebUI.setText(findTestObject('Object Repository/test/input_Login to your Account_password (3)'), 'P@ssword123')

WebUI.click(findTestObject('Object Repository/test/button_Sign In (3)'))

WebUI.click(findTestObject('Object Repository/test/div_Welcome,                    Ihsan Yesua_e30593 (3)'))

WebUI.click(findTestObject('Object Repository/test/i_Home_las la-briefcase m-menu__link-icon'))

WebUI.click(findTestObject('Object Repository/test/a_Courses (4)'))

WebUI.click(findTestObject('Object Repository/test/a_Test Automation (2)'))

WebUI.click(findTestObject('Object Repository/test/a_Edit Course (3)'))

WebUI.click(findTestObject('Object Repository/test/button_Add Section (2)'))

WebUI.setText(findTestObject('Object Repository/test/input_Course Content_section-name-input (2)'), 'afassa')

WebUI.click(findTestObject('Object Repository/test/button_Add Item (3)'))

WebUI.setText(findTestObject('Object Repository/test/input_Section Item_course-item0name (3)'), 'sfsdafsd')

WebUI.selectOptionByValue(findTestObject('Object Repository/test/select_Article                             _8a5c10 (3)'), 
    'video', true)

WebUI.setText(findTestObject('Object Repository/test/input_Elements path_form-control video-content'), 'dasfasdafafsdaa')

WebUI.click(findTestObject('Object Repository/test/div_Save (3)'))

WebUI.click(findTestObject('Object Repository/test/div_Save (3)'))

WebUI.click(findTestObject('Object Repository/test/div_Section Item                           _7b3bcc'))

WebUI.setText(findTestObject('Object Repository/test/input_Elements path_form-control video-content'), 'https://www.youtube.com')

WebUI.click(findTestObject('Object Repository/test/div_Save (3)'))

WebUI.click(findTestObject('Object Repository/test/button_OK (4)'))


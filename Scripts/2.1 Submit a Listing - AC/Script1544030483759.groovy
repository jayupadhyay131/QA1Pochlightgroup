import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://porchlightdev.getventive.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/i_Use your PorchLight email an'))

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Sign in - Google Accounts/input_getventive.com_identifie'), 
    'ventivedev')

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Sign in - Google Accounts/span_Next'))

WebUI.setEncryptedText(findTestObject('2.1 Submit a Listing - AC/Page_Sign in - Google Accounts/input_Too many failed attempts'), 
    'yvHVlg+we4ZtOw5V4UJZaA==')

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Sign in - Google Accounts/span_Next (1)'))

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Sign in - Google Accounts/span_Allow'))

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/a_Open Houses'))

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/a_Schedule'))

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/a_Add Listing'))

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_REColorado MLS_recolorad'), 
    '123456')

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_mls_listing_id'), 
    '12345')

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_address'), 'Automated QA AC Listing 1')

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_City'), 'Boise')

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_zip'), '83702')

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_sub_area'), 'Ada County')

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_active_mls_date'), 
    '12/05/2018')

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/td_5'))

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_IRES MLS_price'), '$500,000')

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/div_IRES MLS_bootstrap-tagsinp'))

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input'), 'jay.upadhyay@porchlightgroup.com')

WebUI.click(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/a_Create'))

WebUI.delay(10)

WebUI.setText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/input_Add Listing_searchlistin'), 
    'automated')

WebUI.verifyElementText(findTestObject('2.1 Submit a Listing - AC/Page_Connect 2  PorchLight Real Est/div_Automated QA AC Listing 1'), 
    'Automated QA AC Listing 1 Boise, CO 83702')

WebUI.delay(10)

WebUI.closeBrowser()

WebUI.acceptAlert()


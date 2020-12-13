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
//import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8282/confia/exte/')

WebUI.click(findTestObject('TA/a_Firmas Externas'))

WebUI.click(findTestObject('TA/a_Solicitud de Alta'))

WebUI.click(findTestObject('TA/span_Agregar Titular Acreditado'))

WebUI.click(findTestObject('TA/label_Seleccionar'))

WebUI.setText(findTestObject('TA/input_concat(id(, , vtacreditadofrmTitulari_ecef35'), 'ministerio de economia')

WebUI.click(findTestObject('TA/li_MINISTERIO DE ECONOMIA Y FINANZAS PUBLICAS'))

WebUI.delay(40)

WebUI.setText(findTestObject('TA/input_Nro.Doc._vtacreditadofrmTitularj_idt459'), pa_nro_doc)

WebUI.click(findTestObject('TA/span_Seleccionar..._ui-icon ui-icon-triangl_d1b480'))

WebUI.click(findTestObject('TA/li_DIRECTORA'))

WebUI.click(findTestObject('TA/span_Guardar'))

WebUI.click(findTestObject('TA/span_Eliminar_ui-button-icon-left ui-icon u_08c5b4'))

WebUI.click(findTestObject('TA/span_Agregrar Firma Acreditadass INICIADO'))

WebUI.click(findTestObject('TA/span_Seleccionar..._ui-icon ui-icon-triangl_d1b480_1'))

WebUI.click(findTestObject('TA/li_CUENTA CORRIENTE FISCAL'))

WebUI.delay(5)

WebUI.setText(findTestObject('TA/input_Denominacin_vtacreditadoj_idt656'), pa_deno)

WebUI.setText(findTestObject('TA/input_Hoja de Ruta_vtacreditadoj_idt658'), pa_hr)

WebUI.setText(findTestObject('TA/input_Fecha Solicitud_vtacreditadocal_input'), pa_fecha_hr)

WebUI.setText(findTestObject('TA/input_Nombre MAE_vtacreditadoj_idt661'), 'OSCAR')

WebUI.click(findTestObject('TA/span_Firma Digital_ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'))

WebUI.setText(findTestObject('TA/input_Desde_vtacreditadoj_idt673_input'), pa_desde)

WebUI.setText(findTestObject('TA/input_Hasta_vtacreditadoj_idt675_input'), pa_hasta)

WebUI.click(findTestObject('TA/span_Seleccionar..._ui-icon ui-icon-triangle-1-s ui-c'))

WebUI.click(findTestObject('TA/li_VIGENTE'))

WebUI.click(findTestObject('TA/span_Guardar1'))

WebUI.click(findTestObject('TA/span_Siguiente'))

WebUI.click(findTestObject('TA/span_Agregar Cuenta Corriente'))

WebUI.click(findTestObject('TA/span_Estado_ui-chkbox-icon ui-icon ui-icon-_f2a717'))

WebUI.click(findTestObject('TA/span_Guardar2'))

WebUI.delay(10)

WebUI.click(findTestObject('TA/span_Agregar Documento Adjunto'))

WebUI.delay(5)

WebUI.setText(findTestObject('TA/input_Nro Documento_frmDocumentosj_idt892'), pa_nro)

WebUI.click(findTestObject('TA/span_Seleccionar..._ui-icon ui-icon-triangl_d1b480_1_2'))

WebUI.click(findTestObject('TA/li_COPIA SIMPLE DOCUMENTO DE IDENTIDAD'))

WebUI.setText(findTestObject('TA/textarea_Detalle_frmDocumentosj_idt897'), pa_detalle)

WebUI.click(findTestObject('TA/span_Guardar3'))

WebUI.delay(5)

WebUI.click(findTestObject('TA/span_Finalizar el Registro de Acreditacin'))

WebUI.delay(5)

WebUI.closeBrowser()


package pe.unjfsc.daw.view;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pe.unjfsc.daw.entity.CEConfigContext;
import pe.unjfsc.daw.entity.CEFile;
import pe.unjfsc.daw.entity.CEMatriculadoFIISI;
import pe.unjfsc.daw.logical.CLCargarXML;
import pe.unjfsc.daw.logical.CLJsonReader;

public class CVConvertir {
	
	private static final Logger LOG = LoggerFactory.getLogger(CVConvertir.class);
	
	public static void main(String[] args) throws Exception {
		LOG.info("[EVL] Iniciando :");
		
		AnnotationConfigApplicationContext oCntx = new AnnotationConfigApplicationContext();
				
		LOG.info("[EVL] Mostrando la instancia de la anotación : " + oCntx);
				
		LOG.info("[EVL] Registrar la anotación : ");
		oCntx.register(CEConfigContext.class);
		oCntx.refresh();
		
		CEFile oCEFile=(CEFile) oCntx.getBean("oCEFile");
		
		LOG.info("[EVL] Before Object CEFile : " + oCEFile.toString());
		oCEFile.setROOT("root");
		oCEFile.setPATH("src/main/resources/fuente/input/matriculados_fiisi.json");
		
		LOG.info("[EVL] After Object CEFile : " + oCEFile.toString());
		
		
		CLJsonReader oCLJReader= oCntx.getBean("oCLJsonReader",CLJsonReader.class);
		ArrayList<CEMatriculadoFIISI> matriculados=oCLJReader.leerJSON(oCEFile);
		
		//Cargar los datos del JSON a XML a traves de una lista de objetos de tipo CEMatriculadoFIISI
		CLCargarXML oCargar=oCntx.getBean("oCLCargarXML",CLCargarXML.class);
		oCargar.cargarData(matriculados);
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}

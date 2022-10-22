package pe.unjfsc.daw.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pe.unjfsc.daw.logical.CLCargarXML;
import pe.unjfsc.daw.logical.CLJsonReader;

@Configuration
public class CEConfigContext {
	
	@Bean
	public CEMatriculadoFIISI oCEMatriculadoFIISI() {return new CEMatriculadoFIISI();}
	
	@Bean
	public CLJsonReader oCLJsonReader() {
	return new CLJsonReader();
	}
	@Bean
	public CLCargarXML oCLCargarXML() {
	return new CLCargarXML();
	}
	
	@Bean
	public CEFile oCEFile() {
		return new CEFile();
	}
}
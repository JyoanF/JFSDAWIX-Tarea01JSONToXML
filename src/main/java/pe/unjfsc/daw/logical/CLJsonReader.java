package pe.unjfsc.daw.logical;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.entity.CEFile;
import pe.unjfsc.daw.entity.CEMatriculadoFIISI;

public class CLJsonReader {
private static final Logger LOG = LoggerFactory.getLogger(CLJsonReader.class);
	
	public ArrayList<CEMatriculadoFIISI> leerJSON(CEFile poCEFile) throws Exception {
		
		LOG.info("[DAW] Objeto file: {}", poCEFile);
		Path path= Paths.get(poCEFile.getPATH());
		String stringJson = Files.readAllLines(path).stream()
			     .collect(Collectors.joining(System.lineSeparator()));
		JSONObject json = new JSONObject(stringJson);
		JSONArray arr=json.getJSONArray("matriculados");
		
		CEMatriculadoFIISI oMatriculado;
		ArrayList<CEMatriculadoFIISI> matriculados=new ArrayList();
		for(int i=0; i<arr.length();i++) {
			oMatriculado=new CEMatriculadoFIISI();
			oMatriculado.setFACULTAD(arr.getJSONObject(i).getString("FACULTAD"));
			oMatriculado.setAPELLIDOS_Y_NOMBRES(arr.getJSONObject(i).getString("APELLIDOS_Y_NOMBRES"));
			oMatriculado.setCORREO_INSTITUCIONAL(arr.getJSONObject(i).getString("CORREO_INSTITUCIONAL"));
			oMatriculado.setEDAD(arr.getJSONObject(i).getInt("EDAD"));
			oMatriculado.setCURSO_A_CARGO(arr.getJSONObject(i).getString("CURSO_A_CARGO"));
			oMatriculado.setCICLO(arr.getJSONObject(i).getInt("CICLO"));
			oMatriculado.setDISTRITO_PROCEDENCIA(arr.getJSONObject(i).getString("DISTRITO_PROCEDENCIA"));
			oMatriculado.setMODALIDAD_INGRESO(arr.getJSONObject(i).getString("MODALIDAD_INGRESO"));
			LOG.info("DAW Item read: {}",oMatriculado);
			matriculados.add(oMatriculado);
		}
		LOG.info("DAW Size of ArrayList after add: {}",matriculados.size());
		return matriculados;
	}
}

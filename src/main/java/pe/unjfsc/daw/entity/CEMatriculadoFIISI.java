package pe.unjfsc.daw.entity;

public class CEMatriculadoFIISI {
	private String FACULTAD;
	private String APELLIDOS_Y_NOMBRES;
	private String CORREO_INSTITUCIONAL;
	private int CICLO;
	private String DISTRITO_PROCEDENCIA;
	private int EDAD;
	private String CURSO_A_CARGO;
	private String MODALIDAD_INGRESO;
	public String getFACULTAD() {
		return FACULTAD;
	}
	public String getAPELLIDOS_Y_NOMBRES() {
		return APELLIDOS_Y_NOMBRES;
	}
	public String getCORREO_INSTITUCIONAL() {
		return CORREO_INSTITUCIONAL;
	}
	public int getCICLO() {
		return CICLO;
	}
	public String getDISTRITO_PROCEDENCIA() {
		return DISTRITO_PROCEDENCIA;
	}
	public int getEDAD() {
		return EDAD;
	}
	public String getCURSO_A_CARGO() {
		return CURSO_A_CARGO;
	}
	public String getMODALIDAD_INGRESO() {
		return MODALIDAD_INGRESO;
	}
	public void setFACULTAD(String fACULTAD) {
		FACULTAD = fACULTAD;
	}
	public void setAPELLIDOS_Y_NOMBRES(String aPELLIDOS_Y_NOMBRES) {
		APELLIDOS_Y_NOMBRES = aPELLIDOS_Y_NOMBRES;
	}
	public void setCORREO_INSTITUCIONAL(String cORREO_INSTITUCIONAL) {
		CORREO_INSTITUCIONAL = cORREO_INSTITUCIONAL;
	}
	public void setCICLO(int cICLO) {
		CICLO = cICLO;
	}
	public void setDISTRITO_PROCEDENCIA(String dISTRITO_PROCEDENCIA) {
		DISTRITO_PROCEDENCIA = dISTRITO_PROCEDENCIA;
	}
	public void setEDAD(int eDAD) {
		EDAD = eDAD;
	}
	public void setCURSO_A_CARGO(String cURSO_A_CARGO) {
		CURSO_A_CARGO = cURSO_A_CARGO;
	}
	public void setMODALIDAD_INGRESO(String mODALIDAD_INGRESO) {
		MODALIDAD_INGRESO = mODALIDAD_INGRESO;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEMatriculadoFIISI [FACULTAD=");
		builder.append(FACULTAD);
		builder.append(", APELLIDOS_Y_NOMBRES=");
		builder.append(APELLIDOS_Y_NOMBRES);
		builder.append(", CORREO_INSTITUCIONAL=");
		builder.append(CORREO_INSTITUCIONAL);
		builder.append(", CICLO=");
		builder.append(CICLO);
		builder.append(", DISTRITO_PROCEDENCIA=");
		builder.append(DISTRITO_PROCEDENCIA);
		builder.append(", EDAD=");
		builder.append(EDAD);
		builder.append(", CURSO_A_CARGO=");
		builder.append(CURSO_A_CARGO);
		builder.append(", MODALIDAD_INGRESO=");
		builder.append(MODALIDAD_INGRESO);
		builder.append("]");
		return builder.toString();
	}
}

package pe.unjfsc.daw.entity;

public class CEFile {
	private String ROOT;
	private String PATH;
	public String getROOT() {
		return ROOT;
	}
	public String getPATH() {
		return PATH;
	}
	public void setROOT(String rOOT) {
		ROOT = rOOT;
	}
	public void setPATH(String pATH) {
		PATH = pATH;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEFile [ROOT=");
		builder.append(ROOT);
		builder.append(", PATH=");
		builder.append(PATH);
		builder.append("]");
		return builder.toString();
	}
	
}

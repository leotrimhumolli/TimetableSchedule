public class GrupetStudentave {
private int ID_grupi;
private String EMRI_grupi;
private int NR_studentave;
private Ligjerata[] LIGJERATA;
private String DEPARTAMENTI;
private int VITI;
public GrupetStudentave(int id, String emri, int nr){
	ID_grupi=id;
	EMRI_grupi=emri;
	NR_studentave=nr;
}
public void addLigjeraten(Ligjerata[] ligjerata){
}
public int getIdGrupit(){
	return ID_grupi;
}
public String getEmriGrupit(){
	return EMRI_grupi;
}
public int getNumrinEStudentave(){
	return NR_studentave;
}
public int getViti(){
	return VITI;
}
public String getDepartamentin(){
	return DEPARTAMENTI;
}
public boolean krahasoIdGrupet(GrupetStudentave p){
	return ID_grupi==p.getIdGrupit();
}
}


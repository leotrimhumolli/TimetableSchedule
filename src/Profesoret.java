public class Profesoret {
private int ID_profesori;
private String EMRI_profesori;
private Ligjerata[] LIGJERATA;
public Profesoret(int id, String emri){
	ID_profesori=id;
	EMRI_profesori=emri;
	}
	public void addLigjeraten(Ligjerata[] ligjerata){
		LIGJERATA=ligjerata;
	}
	public int getIDProfesorit(){
		return ID_profesori;
	}
    public String getEmriProfesorit(){
    	return EMRI_profesori;
    }
    public Ligjerata[] getLigjeraten(){
    	return LIGJERATA;
    }
    public boolean krahasoIDProfesoret(Profesoret p){
    	return ID_profesori==p.getIDProfesorit();
    }
}

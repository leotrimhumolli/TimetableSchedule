import java.util.ArrayList;

public class Sallat {
	
private int ID_salla;
private String EMRI_salla;
private boolean LAB;
private int NR_uleseve;
private static int SALLA_tjeter;

public ArrayList<ArrayList<Ora>> ORARI=new ArrayList<ArrayList<Ora>>();

public Sallat(int id,String emri,boolean lab,int nr){
	ID_salla=id;
	EMRI_salla=emri;
	LAB=lab;
	NR_uleseve=nr;
	
	for (int i=0;i<5;i++)
	{
		ORARI.add(new ArrayList<Ora>());
		for (int j=0;j<8;j++)
			ORARI.get(i).add(new Ora(i, 8+j));
	}
}
public int getIdSalles(){
	return ID_salla;
}
public String getEmriSalles(){
	return EMRI_salla;
}
public boolean eshteLab(){
	return LAB;
}
public int getNrUleseve(){
	return NR_uleseve;
}
public static void restartIds(){
	SALLA_tjeter=0;
}
}

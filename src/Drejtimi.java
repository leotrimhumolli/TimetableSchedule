import java.util.*;

public class Drejtimi {
	private String DREJTIMI;
	private int VITI;
	private HashMap<Integer, GrupetStudentave> GRUPI;
	private HashMap<Integer, Lenda> LENDA;
	private HashMap<Integer, Ligjerata> LIGJERATA;

	public Drejtimi(String d, int v) {
		this.DREJTIMI = d;
		this.VITI = v;

		GRUPI = new HashMap<Integer, GrupetStudentave>();
		LENDA = new HashMap<Integer, Lenda>();
		LIGJERATA = new HashMap<Integer, Ligjerata>();
	}

	public String merrDrejtimin() {
		return this.DREJTIMI;
	}

	public String merrVitin() {
		return " viti " + VITI;
	}
	public Ligjerata merrLigjeraten(int i) {
		return this.LIGJERATA.get(i);
	}
	public Iterator<Ligjerata> iteruesLigjeratave() {
		return LIGJERATA.values().iterator();
	}

	public void shtoGrupin(Integer key, GrupetStudentave grupi) {
		GRUPI.put(key, grupi);
	}

	public void shtoLenden(Integer key, Lenda lenda) {
		LENDA.put(key, lenda);
	}

	public void shtoLigjeraten(Integer key, Ligjerata ligjerata) {
		LIGJERATA.put(key, ligjerata);
	}

	public GrupetStudentave getGrupin(int key) {
		return GRUPI.get(key);
	}

	public Lenda getLenden(int key) {
		return LENDA.get(key);
	}

	public int Nrligjeratave() {
		return LIGJERATA.size();
	}

}
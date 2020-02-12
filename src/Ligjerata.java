public class Ligjerata {
	private Profesoret PROFESOR;
	private Lenda LENDA;
	private GrupetStudentave GRUPET_studentave;
	private int NR_uleseve;
	private boolean kerkohet_LAB;
	private String DEPARTAMENTI;
	private int VITI;
	private String L_U;
	private int KOHEZGJATJA;

	private static int totali = 0;

	private int salla, dita, ora;
	public Ligjerata(Profesoret profesor, Lenda lenda, GrupetStudentave grupet,
			boolean kerkohetlab, String drejtimi, int viti, String l_u,
			int kohezgjatja) {
		PROFESOR = profesor;
		LENDA = lenda;
		GRUPET_studentave = grupet;
		kerkohet_LAB = kerkohetlab;
		DEPARTAMENTI = drejtimi;
		VITI = viti;
		L_U = l_u;
		KOHEZGJATJA = kohezgjatja;

		// gjenerimi
		int s = 100;
		int d = 0;
		int o = 1;
		do {
			salla = (int) (Math.random() * Databaza.NrSallave()) + 100;
			dita = (int) (Math.random() * 5);
			ora = (int) (Math.random() * Databaza.getSallen(salla).ORARI.get(dita).size());
		} while (Databaza.getSallen(salla).ORARI.get(dita).get(ora).getE_Zene() == true
				// Perderisa ora mesimore eshte e zene ne diten dhe oren e gjeneruar
				|| Konflikte.Orari(Databaza.getSallen(salla).ORARI.get(dita)
						.get(ora), this));
		//Perderisa KA perplasje ndermjet ores paraprake te gjeneruar, me oret e tjera te orareve per secilen salle

		Databaza.getSallen(salla).ORARI.get(dita).get(ora).setLigjerata(this);

		int k = KOHEZGJATJA;
		while (k >= 60
				&& ora + 1 < Databaza.getSallen(salla).ORARI.get(dita).size()) {
			Databaza.getSallen(salla).ORARI.get(dita).remove(ora + 1);
			k -= 60;
		}


	}

	public String toString() {
		String profesor = (PROFESOR != null) ? PROFESOR.getEmriProfesorit() : "";
		String lenda = (LENDA != null) ? LENDA.getEmriLendes() : "";
		String sallaLigjerates = (Databaza.getSallen(salla) != null) ? Databaza.getSallen(salla).getEmriSalles() : "";
		String koha = new Ora(dita, ora).toString();
		return "Profesori: " + profesor + "\nLenda: "+
			lenda + "\nSalla: " + sallaLigjerates + "\nKoha:" + koha;
	}

	public boolean profesorOverLaps(Ligjerata p) {
		return PROFESOR == p.getProfesor();
	}

	public Profesoret getProfesor() {
		return PROFESOR;
	}

	public Lenda getLenda() {
		return LENDA;
	}

	public void ndryshoSallen(int idSalla) {
		salla = idSalla;
	}
	public void ndryshoOren(int ora) {
		this.ora = ora;
	}
	public void ndryshoDiten(int dita) {
		this.dita = dita;
	}
	public Ora getOra() {
		return new Ora(dita, ora);
	}
	public Sallat getSalla() {
		return Databaza.getSallen(salla);
	}
	public GrupetStudentave getGrupet() {
		return GRUPET_studentave;
	}

	public int getNrUleseve() {
		return NR_uleseve;
	}

	public boolean kerkohetLab() {
		return kerkohet_LAB;
	}

	public int getKohezgjatja() {
		return KOHEZGJATJA;
	}

	public int getViti() {
		return VITI;
	}

	public String getDepartamentin() {
		return DEPARTAMENTI;
	}
}
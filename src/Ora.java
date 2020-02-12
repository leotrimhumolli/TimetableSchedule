public class Ora 
{
	private int DITA;
	private int ORA;
	private boolean E_ZENE;
	private Ligjerata LIGJERATA;
	
	public Ora(int DITA, int ORA)
	{
		this.DITA=DITA;
		this.ORA=ORA;
		E_ZENE=false;
	}

	public String toString() {
		String[] ditet = {"E Hene", "E Marte", "E Merkure", "E Enjte", "E Premte"};
		return ditet[DITA] + " ora " + ORA;
	}

	public void setLigjerata(Ligjerata LIGJERATA)
	{
		this.LIGJERATA=LIGJERATA;
		E_ZENE=true;
	}

	public int getOra()
	{
		return ORA;
	}
	
	public int getDita()
	{
		return DITA;
	}
	
	public Ligjerata getLigjerata()
	{
		return LIGJERATA;
	}
	
	public boolean getE_Zene()
	{
		return E_ZENE;
	}
}

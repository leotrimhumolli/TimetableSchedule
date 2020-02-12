public class Konflikte
{
	public static boolean Orari(Ora ora1, Ligjerata ligjerata)
	{
		for (int i=0;i<Databaza.NrSallave();i++) // Ne secilen salle
		{
			Integer sallaId=i+100;		// Regjistro id e salles. Vlera 100 si vlere fikse fillestare e ID-ve te sallave sipas marreveshjes me klasen 'Databaza'
			int DITA=ora1.getDita();	// Regjistro diten nga 'ora1' ne variablen ndihmese
			for (int k=0;k<Databaza.getSallen(sallaId).ORARI.get(DITA).size();k++)	// Ne secilen ore mesimore te dites perkatese
			{
				Ora ora2=Databaza.getSallen(sallaId).ORARI.get(DITA).get(k);		// Regjistro oren mesimore paraprake ne variablen ndihmese 'ora2'
				if (ora2.getE_Zene() && ora2.getOra()==ora1.getOra())				// Krahaso nese ora paraprake (ora2) eshte e zene dhe i takon te njejtes ore ditore te 'ora1'
					if (ligjerata.getProfesor().krahasoIDProfesoret(ora2.getLigjerata().getProfesor())	// Krahaso nese eshte i njejti profesor ne dy oret ('ora1' dhe 'ora2')
						|| (ligjerata.getGrupet()!=null && ora2.getLigjerata().getGrupet()!=null && ligjerata.getGrupet().krahasoIdGrupet(ora2.getLigjerata().getGrupet())))		// Krahaso nese eshte ndonjeri nga grupet ndodhet ne dy oret
						return true;	// Nese vlejne keto kushte atehere kemi perplasje ndermjet dy oreve 'ora1' dhe 'ora2'
			}
		}
		
		// Perndryshe nese nuk ka perplasje...
		return false;
	}
}
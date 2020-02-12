import java.util.*;

public class Databaza {
	static HashMap<Integer, Profesoret> PROFESORI;
	static HashMap<Integer, Sallat> SALLA;
	static HashMap<Integer, Drejtimi> DREJTIMI;

	public static void teDhenat() {
		PROFESORI = new HashMap<Integer, Profesoret>();
		DREJTIMI = new HashMap<Integer, Drejtimi>();
		SALLA = new HashMap<Integer, Sallat>();
	

		PROFESORI.put(1, new Profesoret(1, "Dr.sc. Qamil Haxhibeqiri"));
		PROFESORI.put(2, new Profesoret(2, "Dr.sc. Faton Berisha"));
		PROFESORI.put(3, new Profesoret(3, "Dr.sc. Naim Braha"));
		PROFESORI.put(4, new Profesoret(4, "Dr.sc. Ermir Rogova"));
		PROFESORI.put(5, new Profesoret(5, "Dr.sc. Faton Merovci"));
		PROFESORI.put(6, new Profesoret(6, "Dr.sc. Minir Efendia"));
		PROFESORI.put(7, new Profesoret(7, "Dr.sc. Ilmi Hoxha"));
		PROFESORI.put(8, new Profesoret(8, "Dr.sc. Bujar Fejzullahu"));
		PROFESORI.put(9, new Profesoret(9, "Dr.sc. Shaip Bytyçi"));
		PROFESORI.put(10, new Profesoret(10, "Dr.sc. Menderes Gashi"));
		PROFESORI.put(11, new Profesoret(11, "Dr.sc. Muhib Lohaj"));
		PROFESORI.put(12, new Profesoret(12, "Dr.sc. Rexhep Gjergji"));
		PROFESORI.put(13, new Profesoret(13, "Dr.sc. Eda Vula"));
		PROFESORI.put(14, new Profesoret(14, "Dr.sc. Fahri Marevci"));
		PROFESORI.put(15, new Profesoret(15, "Dr.sc. Nagip Skenderi"));
		PROFESORI.put(16, new Profesoret(16, "Dr.sc. Flutura Çitaku"));
		PROFESORI.put(17, new Profesoret(17, "Dr.sc. Halil Kulaj"));
		PROFESORI.put(18, new Profesoret(18, "Mr.sc. Ramadan Limani"));
		PROFESORI.put(19, new Profesoret(19, "Mr.sc. Armend Shabani"));
		PROFESORI.put(20, new Profesoret(20, "Mr.sc. Edmond Aliaga"));
		PROFESORI.put(21, new Profesoret(21, "Mr.sc. Eliot Bytyçi"));
		PROFESORI.put(22, new Profesoret(22, "Mr.sc. Aferdita Misini"));
		PROFESORI.put(23, new Profesoret(23, "Mr.sc. Xhemajl Ahmeti"));
		PROFESORI.put(24, new Profesoret(24, "Mr.sc. Elver Bajrami"));
		PROFESORI.put(25, new Profesoret(25, "Mr.sc. Kajtaz Bllaca"));
		PROFESORI.put(26, new Profesoret(26, "Mr.sc. Mirlinda Raci"));
		PROFESORI.put(27, new Profesoret(27, "Mr.sc. Artan Berisha"));
		PROFESORI.put(28, new Profesoret(28, "Mr.sc. Tomor Pupovci"));
		PROFESORI.put(29, new Profesoret(29, "Mr.sc. Ridvan Bunjaku"));
		PROFESORI.put(30, new Profesoret(30, "Mr.sc. Dodë Daka"));
		PROFESORI.put(31, new Profesoret(31, "Mr.sc. Fesal Baxhaku"));
		PROFESORI.put(32, new Profesoret(32, "Mr.sc. Selman Jagxhiu"));
		PROFESORI.put(33, new Profesoret(33, "Mr.sc. Besa Sadikaj"));
		PROFESORI.put(34, new Profesoret(34, "Mr.sc. Mimoza Poloshka"));
		PROFESORI.put(35, new Profesoret(35, "Mr.sc. Shkumbin Makolli"));
		PROFESORI.put(36, new Profesoret(36, "Mr.sc. Melinda Mula"));
		PROFESORI.put(37, new Profesoret(37, "Mr.sc. Behar Baxhaku"));
		PROFESORI.put(38, new Profesoret(38, "Dr.sc. Manush Mustafa"));
		PROFESORI.put(39, new Profesoret(39, "Mr.sc. Hazim Misini"));
		PROFESORI.put(40, new Profesoret(40, "Mr.sc. Adelina Bekteshi"));
		PROFESORI.put(41, new Profesoret(41, "Mr.sc. Artan Alidema"));
		PROFESORI.put(42, new Profesoret(42, "Mr.sc. Yllka Ahmeti"));
		PROFESORI.put(43, new Profesoret(43, "Mr.sc. Leonora Sopaj"));
		PROFESORI.put(44, new Profesoret(44, "Mr.sc. Albulena Alidema"));
		
		
		DREJTIMI.put(700, new Drejtimi("Shkence Kompjuterike", 1));
		DREJTIMI.put(701, new Drejtimi("Shkence Kompjuterike", 2));
		DREJTIMI.put(702, new Drejtimi("Shkence Kompjuterike", 3));
		DREJTIMI.put(703, new Drejtimi("Matematike e Pergjithshme", 1));
		DREJTIMI.put(704, new Drejtimi("Matematike e Pergjithshme", 2));
		DREJTIMI.put(705, new Drejtimi("Matematike e Pergjithshme", 3));
		DREJTIMI.put(706, new Drejtimi("Matematike e Pergjithshme", 4));
		DREJTIMI.put(707, new Drejtimi("Matematike Financiare", 1));
		DREJTIMI.put(708, new Drejtimi("Matematike Financiare", 2));
		DREJTIMI.put(709, new Drejtimi("Matematike Financiare", 3));

		DREJTIMI.get(700).shtoGrupin(900,
				new GrupetStudentave(900, "Te gjithe", 120));
		DREJTIMI.get(700).shtoGrupin(901, new GrupetStudentave(901, "I", 40));
		DREJTIMI.get(700).shtoGrupin(902, new GrupetStudentave(902, "II", 40));
		DREJTIMI.get(700).shtoGrupin(903, new GrupetStudentave(903, "III", 40));
		DREJTIMI.get(701).shtoGrupin(904,
				new GrupetStudentave(904, "te gjithe", 80));
		DREJTIMI.get(701).shtoGrupin(905, new GrupetStudentave(905, "I", 40));
		DREJTIMI.get(701).shtoGrupin(906, new GrupetStudentave(906, "II", 40));
		DREJTIMI.get(701).shtoGrupin(907, new GrupetStudentave(907, "III", 0));
		DREJTIMI.get(702).shtoGrupin(908,
				new GrupetStudentave(908, "te gjthe", 50));
		DREJTIMI.get(702).shtoGrupin(909, new GrupetStudentave(909, "I", 30));
		DREJTIMI.get(702).shtoGrupin(910, new GrupetStudentave(910, "II", 30));
		DREJTIMI.get(702).shtoGrupin(911, new GrupetStudentave(911, "III", 00));
		DREJTIMI.get(703).shtoGrupin(912,
				new GrupetStudentave(912, "te gjithe", 120));
		DREJTIMI.get(703).shtoGrupin(913, new GrupetStudentave(913, "I", 40));
		DREJTIMI.get(703).shtoGrupin(914, new GrupetStudentave(914, "II", 40));
		DREJTIMI.get(703).shtoGrupin(915, new GrupetStudentave(915, "III", 40));
		DREJTIMI.get(704).shtoGrupin(916,
				new GrupetStudentave(916, "te gjithe", 80));
		DREJTIMI.get(704).shtoGrupin(917, new GrupetStudentave(917, "I", 40));
		DREJTIMI.get(704).shtoGrupin(918, new GrupetStudentave(918, "II", 40));
		DREJTIMI.get(704).shtoGrupin(919, new GrupetStudentave(919, "III", 0));
		DREJTIMI.get(705).shtoGrupin(920,
				new GrupetStudentave(920, "te gjthe", 50));
		DREJTIMI.get(705).shtoGrupin(921, new GrupetStudentave(921, "I", 25));
		DREJTIMI.get(705).shtoGrupin(922, new GrupetStudentave(922, "II", 25));
		DREJTIMI.get(705).shtoGrupin(923, new GrupetStudentave(923, "III", 0));
		DREJTIMI.get(706).shtoGrupin(924,
				new GrupetStudentave(924, "te gjthe", 30));
		DREJTIMI.get(706).shtoGrupin(925, new GrupetStudentave(925, "I", 30));
		DREJTIMI.get(706).shtoGrupin(926, new GrupetStudentave(926, "II", 0));
		DREJTIMI.get(706).shtoGrupin(927, new GrupetStudentave(927, "III", 0));
		DREJTIMI.get(707).shtoGrupin(928,
				new GrupetStudentave(928, "te gjthe", 120));
		DREJTIMI.get(707).shtoGrupin(929, new GrupetStudentave(929, "I", 40));
		DREJTIMI.get(707).shtoGrupin(930, new GrupetStudentave(930, "II", 40));
		DREJTIMI.get(707).shtoGrupin(931, new GrupetStudentave(931, "III", 40));
		DREJTIMI.get(708).shtoGrupin(932,
				new GrupetStudentave(932, "te gjithe", 80));
		DREJTIMI.get(708).shtoGrupin(933, new GrupetStudentave(933, "I", 40));
		DREJTIMI.get(708).shtoGrupin(934, new GrupetStudentave(934, "II", 40));
		DREJTIMI.get(708).shtoGrupin(935, new GrupetStudentave(935, "III", 00));
		DREJTIMI.get(709).shtoGrupin(936,
				new GrupetStudentave(936, "te gjthe", 50));
		DREJTIMI.get(709).shtoGrupin(937, new GrupetStudentave(937, "I", 25));
		DREJTIMI.get(709).shtoGrupin(938, new GrupetStudentave(938, "II", 25));
		DREJTIMI.get(709).shtoGrupin(939, new GrupetStudentave(939, "III", 30));

		SALLA.put(100, new Sallat(100, "153", false, 100));
		SALLA.put(101, new Sallat(101, "112", false, 50));
		SALLA.put(102, new Sallat(102, "113", false, 50));
		SALLA.put(103, new Sallat(103, "114", false, 50));
		SALLA.put(104, new Sallat(104, "Lab M", true, 50));
		SALLA.put(105, new Sallat(105, "Lab B", true, 40));
		SALLA.put(106, new Sallat(106, "Lab V", true, 20));

				//Shkenca kompjuterike
		DREJTIMI.get(700).shtoLenden(500,new Lenda(500, "Matematike Elementare"));
		DREJTIMI.get(700).shtoLenden(501, new Lenda(501, "Matematike Diskrete"));
		DREJTIMI.get(700).shtoLenden(502,new Lenda(502, "Programimi dhe Algoritmet"));
		DREJTIMI.get(700).shtoLenden(503,new Lenda(503, "Hyrje ne Shkencat Kompjuterike"));
		DREJTIMI.get(700).shtoLenden(504,new Lenda(504, "Gjuhe Angleze I"));
		DREJTIMI.get(701).shtoLenden(505, new Lenda(505, "Analiza Matematike"));
		DREJTIMI.get(701).shtoLenden(506,new Lenda(506, "Analize numerike I"));
		DREJTIMI.get(701).shtoLenden(507, new Lenda(507, "Bazat e te Dhenave"));
		DREJTIMI.get(701).shtoLenden(508, new Lenda(508, "Arkitektura e kompjuterit dhe sistemet operative"));
		DREJTIMI.get(701).shtoLenden(509, new Lenda(509, "Siguria e te dhenave"));
		DREJTIMI.get(701).shtoLenden(510,new Lenda(510, "Aplikacione Kompjuterike II"));
		DREJTIMI.get(702).shtoLenden(511,new Lenda(511, "Statistike"));
		DREJTIMI.get(702).shtoLenden(512,new Lenda(512, "Programimi ne WWW"));
		DREJTIMI.get(702).shtoLenden(513,new Lenda(513, "Analize e Algoritmeve"));
		DREJTIMI.get(702).shtoLenden(514,new Lenda(514, "Zhvillimi i lojerave"));
		DREJTIMI.get(702).shtoLenden(515,new Lenda(515, "Kontabilitet"));
		DREJTIMI.get(702).shtoLenden(516,new Lenda(516, "Analize e te dhenave"));
				//Matematike e pergjithshme
		DREJTIMI.get(703).shtoLenden(517,new Lenda(517, "Matematike Elementare"));
		DREJTIMI.get(703).shtoLenden(518,new Lenda(518, "Analize Matematike I"));
		DREJTIMI.get(703).shtoLenden(519,new Lenda(519, "Matematike Diskrete"));
		DREJTIMI.get(703).shtoLenden(520, new Lenda(520, "Gjeometri Analitike"));
		DREJTIMI.get(703).shtoLenden(521,new Lenda(521, "Gjuhe Angleze I"));
		DREJTIMI.get(704).shtoLenden(522,new Lenda(522, "Analiza Matematike II"));
		DREJTIMI.get(704).shtoLenden(523,new Lenda(523, "Gjeometri Elementare"));
		DREJTIMI.get(704).shtoLenden(524, new Lenda(524, "Algjebra Elementare"));
		DREJTIMI.get(704).shtoLenden(525,new Lenda(525, "Analize Numerike"));
		DREJTIMI.get(704).shtoLenden(526,new Lenda(526, "Hyrje ne matematike financiare"));
		DREJTIMI.get(704).shtoLenden(527, new Lenda(527, "Hyrje ne shkencat kompjuterike"));
		DREJTIMI.get(705).shtoLenden(528,new Lenda(528, "Analize Numerike I"));
		DREJTIMI.get(705).shtoLenden(529, new Lenda(529, "Algjebra e pergjithshme"));
		DREJTIMI.get(705).shtoLenden(530, new Lenda(530, "Hapesirat Vektoriale I"));
		DREJTIMI.get(705).shtoLenden(531, new Lenda(531, "Analize Reale"));
		DREJTIMI.get(705).shtoLenden(532,new Lenda(532, "Programimi matematike"));
		DREJTIMI.get(705).shtoLenden(533,new Lenda(533, "Bazat e te dhenave "));
		DREJTIMI.get(706).shtoLenden(534,new Lenda(534, "Ekuacionet Diferenciale I"));
		DREJTIMI.get(706).shtoLenden(535, new Lenda(535, "Metode matematike"));
		DREJTIMI.get(706).shtoLenden(536, new Lenda(536, "Gjeometri diferenciale"));
		DREJTIMI.get(706).shtoLenden(537,new Lenda(537, "Elemente te analizes funksionale"));
		DREJTIMI.get(706).shtoLenden(538,new Lenda(538, "Analiza e te dhenave"));
				//Matematika Financiare
		DREJTIMI.get(707).shtoLenden(539, new Lenda(539, "Analize I"));
		DREJTIMI.get(707).shtoLenden(540, new Lenda(540, "Algjebra II"));
		DREJTIMI.get(707).shtoLenden(541, new Lenda(541, "Matematike Diskrete "));
		DREJTIMI.get(707).shtoLenden(542, new Lenda(542, "Proceset Stokastike"));
		DREJTIMI.get(707).shtoLenden(543, new Lenda(543, "Praktikum i kompjuterit"));
		DREJTIMI.get(708).shtoLenden(544, new Lenda(544, "Analize III"));
		DREJTIMI.get(708).shtoLenden(545,new Lenda(545, "Teori e Gjases I"));
		DREJTIMI.get(708).shtoLenden(546, new Lenda(546, "Programim I"));
		DREJTIMI.get(708).shtoLenden(547, new Lenda(547, "Metoda Numerike I"));
		DREJTIMI.get(708).shtoLenden(548,new Lenda(548, "Makroekonomi"));
		DREJTIMI.get(708).shtoLenden(549, new Lenda(549, "Bazat e Menaxhmentit"));
		DREJTIMI.get(708).shtoLenden(550,new Lenda(550, "Baza e te dhenave"));
		DREJTIMI.get(709).shtoLenden(551,new Lenda(551, "Statistike"));
		DREJTIMI.get(709).shtoLenden(552,new Lenda(552, "Praktikum Financiar"));
		DREJTIMI.get(709).shtoLenden(553,new Lenda(553, "Gjuhe Shqipe"));
		DREJTIMI.get(709).shtoLenden(554, new Lenda(554, "Menaxhmenti financiar"));
		DREJTIMI.get(709).shtoLenden(555, new Lenda(555, "Programimi ne WEB"));
		DREJTIMI.get(709).shtoLenden(556,new Lenda(556, "Biznesi Elektronik"));

		 		//Shkenca Kompjuterike I
			//Matematika Elementare
		DREJTIMI.get(700).shtoLigjeraten(
				200,
				new Ligjerata(getProfesorin(18), DREJTIMI.get(700)
						.getLenden(500), DREJTIMI.get(700).getGrupin(900),
						false, "Shkenca Kompjuterike", 1, "L", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				201,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(700).getLenden(
						500), DREJTIMI.get(700).getGrupin(901), false,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				202,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(700).getLenden(
						501), DREJTIMI.get(700).getGrupin(902), false,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				203,new Ligjerata(getProfesorin(19), DREJTIMI.get(700).getLenden(
						501), DREJTIMI.get(700).getGrupin(903), false,
						"Shkenca Kompjueterike", 1, "U", 90));
			// Matematika Diskrete
		DREJTIMI.get(700).shtoLigjeraten(
				204,
				new Ligjerata(getProfesorin(1), DREJTIMI.get(700)
						.getLenden(501), DREJTIMI.get(700).getGrupin(900),
						false, "Shkenca Kompjuterike", 1, "L", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				205,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(700)
						.getLenden(501), DREJTIMI.get(700).getGrupin(901),
						false, "Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				206,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(700).getLenden(
						501), DREJTIMI.get(700).getGrupin(902), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				207,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(700).getLenden(
						501), DREJTIMI.get(700).getGrupin(903), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		//Programimi Dhe Algoritmet
		DREJTIMI.get(700).shtoLigjeraten(
				208,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(700)
						.getLenden(502), DREJTIMI.get(700).getGrupin(900),
						false, "Shkenca Kompjuterike", 1, "L", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				209,
				new Ligjerata(getProfesorin(21), DREJTIMI.get(700).getLenden(
						502), DREJTIMI.get(700).getGrupin(901), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				210,
				new Ligjerata(getProfesorin(21), DREJTIMI.get(700).getLenden(
						502), DREJTIMI.get(700).getGrupin(902), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				211,
				new Ligjerata(getProfesorin(21), DREJTIMI.get(700).getLenden(
						502), DREJTIMI.get(700).getGrupin(903), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		//Hyrje ne Shkencat Kompjuterike
		DREJTIMI.get(700).shtoLigjeraten(
				212,
				new Ligjerata(getProfesorin(24), DREJTIMI.get(700).getLenden(
						503), DREJTIMI.get(700).getGrupin(900), true,
						"Shkenca Kompjuterike", 1, "L", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				213,
				new Ligjerata(getProfesorin(22), DREJTIMI.get(700).getLenden(
						503), DREJTIMI.get(700).getGrupin(901), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				214,
				new Ligjerata(getProfesorin(22), DREJTIMI.get(700).getLenden(
						503), DREJTIMI.get(700).getGrupin(902), true,
						"Shkenca Kompjuterike", 1, "U", 90));
		DREJTIMI.get(700).shtoLigjeraten(
				215,
				new Ligjerata(getProfesorin(22), DREJTIMI.get(700).getLenden(
						503), DREJTIMI.get(700).getGrupin(903), false,
						"SHkenca Kompjuterike", 1, "U", 90));
		//Gjuhe Angleze I
		DREJTIMI.get(700).shtoLigjeraten(
				216,
				new Ligjerata(getProfesorin(23), DREJTIMI.get(700)
						.getLenden(504), DREJTIMI.get(700).getGrupin(900),
						false, "Shkenca Kompjuterike", 1, "L", 90));
		
				//Shkenca Kompjuterike II
		//analiza matematike
		DREJTIMI.get(701).shtoLigjeraten(
				217,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(701).getLenden(
						505), DREJTIMI.get(701).getGrupin(904), false,
						"Shkenca Kompjuterike", 2, "L", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				218,
				new Ligjerata(getProfesorin(25), DREJTIMI.get(701).getLenden(
						505), DREJTIMI.get(701).getGrupin(905), false,
						"Shkenca Kompjuterike", 2, "U", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				219,
				new Ligjerata(getProfesorin(25), DREJTIMI.get(701)
						.getLenden(505), DREJTIMI.get(701).getGrupin(906),
						false, "Shkenca Kompjuterike", 2, "U", 90));
		//Analize numerike I
		DREJTIMI.get(701).shtoLigjeraten(
				220,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(701).getLenden(
						506), DREJTIMI.get(701).getGrupin(904), false,
						"Shkenca Kompjuterike", 2, "L", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				221,
				new Ligjerata(getProfesorin(26), DREJTIMI.get(701)
						.getLenden(506), DREJTIMI.get(701).getGrupin(905),
						true, "Shkenca Kompjuterike", 2, "U", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				222,
				new Ligjerata(getProfesorin(26), DREJTIMI.get(701)
						.getLenden(506), DREJTIMI.get(701).getGrupin(906),
						true, "Shkenca Kompjuterike", 2, "U", 90));
		//Baza e te dhenave
		DREJTIMI.get(701).shtoLigjeraten(
				223,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(701).getLenden(
						507), DREJTIMI.get(701).getGrupin(904), true,
						"Shkenca Kompjuterike", 2, "L", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				224,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(701).getLenden(
						507), DREJTIMI.get(701).getGrupin(905), true,
						"Shkenca Kompjuterike", 2, "U", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				225,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(701).getLenden(
						507), DREJTIMI.get(701).getGrupin(906), true,
						"Shkenca Kompjuterike", 2, "U", 90));
		//Arkitektura e Kompjuterit dhe sistemet operative
		DREJTIMI.get(701).shtoLigjeraten(
				226,
				new Ligjerata(getProfesorin(4), DREJTIMI.get(701).getLenden(
						508), DREJTIMI.get(701).getGrupin(904), false,
						"Shkenca Kompjuterike", 2, "L", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				227,
				new Ligjerata(getProfesorin(21), DREJTIMI.get(701).getLenden(
						508), DREJTIMI.get(701).getGrupin(905), true,
						"Shkenca Kompjuterike", 2, "U", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				228,
				new Ligjerata(getProfesorin(21), DREJTIMI.get(701).getLenden(
						508), DREJTIMI.get(701).getGrupin(906), true,
						"Shkenca Kompjuterike", 2, "U", 90));
		//Siguria e te dhenave
		DREJTIMI.get(701).shtoLigjeraten(
				229,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(701).getLenden(
						509), DREJTIMI.get(701).getGrupin(904), true,
						"Shkenca Kompjuterike", 2, "L", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				230,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(701).getLenden(
						509), DREJTIMI.get(701).getGrupin(905), false,
						"Shkenca Kompjuterike", 2, "U", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				231,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(701).getLenden(
						509), DREJTIMI.get(701).getGrupin(906), false,
						"Shkenca Kompjuterike", 2, "U", 90));
		// Aplikacione Kompjuterike II
		DREJTIMI.get(701).shtoLigjeraten(
				232,
				new Ligjerata(getProfesorin(29), DREJTIMI.get(701).getLenden(
						510), DREJTIMI.get(701).getGrupin(904), true,
						"Shkenca Kompjuterike", 2, "L", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				233,
				new Ligjerata(getProfesorin(29), DREJTIMI.get(701).getLenden(
						510), DREJTIMI.get(701).getGrupin(905), true,
						"Shkenca Kompjuterike", 2, "U", 90));
		DREJTIMI.get(701).shtoLigjeraten(
				234,
				new Ligjerata(getProfesorin(29), DREJTIMI.get(701).getLenden(
						510), DREJTIMI.get(701).getGrupin(906), true,
						"Shkenca Kompjuterike", 2, "U", 90));
		//Shkenca Kompjuterike III
		//Statistike
		DREJTIMI.get(702).shtoLigjeraten(
				235,
				new Ligjerata(getProfesorin(30), DREJTIMI.get(702).getLenden(
						511), DREJTIMI.get(702).getGrupin(908), false,
						"Shkenca Kopjuterike", 3, "L", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				236,
				new Ligjerata(getProfesorin(30), DREJTIMI.get(702).getLenden(
						511), DREJTIMI.get(702).getGrupin(909), false,
						"Shkenca Kompjuterike", 3, "U", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				237,
				new Ligjerata(getProfesorin(30), DREJTIMI.get(702).getLenden(
						511), DREJTIMI.get(702).getGrupin(910),
						false, "Shkenca Kompjuterike", 3, "U", 90));
		//Programimi ne WEB
		DREJTIMI.get(702).shtoLigjeraten(
				238,
				new Ligjerata(getProfesorin(4), DREJTIMI.get(702).getLenden(
						512), DREJTIMI.get(702).getGrupin(908), true,
						"Shkenca Kompjuterike", 3, "L", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				239,
				new Ligjerata(getProfesorin(31), DREJTIMI.get(702).getLenden(
						512), DREJTIMI.get(702).getGrupin(909), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				240,
				new Ligjerata(getProfesorin(31), DREJTIMI.get(702).getLenden(
						512), DREJTIMI.get(702).getGrupin(910), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		//Analize e algoritmeve
		DREJTIMI.get(702).shtoLigjeraten(
				241,
				new Ligjerata(getProfesorin(18), DREJTIMI.get(702).getLenden(
						513), DREJTIMI.get(702).getGrupin(908), false,
						"Shkenca Kompjuterike", 3, "L", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				242,
				new Ligjerata(getProfesorin(24), DREJTIMI.get(702).getLenden(
						513), DREJTIMI.get(702).getGrupin(909), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				243,
				new Ligjerata(getProfesorin(24), DREJTIMI.get(702).getLenden(
						513), DREJTIMI.get(702).getGrupin(910), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		//Zhvillimi i lojerave
		DREJTIMI.get(702).shtoLigjeraten(
				244,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(702).getLenden(
						514), DREJTIMI.get(702).getGrupin(908), true,
						"Shkenca Kompjuterike", 3, "L", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				245,
				new Ligjerata(getProfesorin(32), DREJTIMI.get(702).getLenden(
						514), DREJTIMI.get(702).getGrupin(909), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				246,
				new Ligjerata(getProfesorin(32), DREJTIMI.get(702).getLenden(
						514), DREJTIMI.get(702).getGrupin(910), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		//Kontabilitet
		DREJTIMI.get(702).shtoLigjeraten(
				247,
				new Ligjerata(getProfesorin(9), DREJTIMI.get(702).getLenden(
						515), DREJTIMI.get(702).getGrupin(908), false,
						"Shkenca Kompjuterike", 3, "L", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				248,
				new Ligjerata(getProfesorin(33), DREJTIMI.get(702).getLenden(
						515), DREJTIMI.get(702).getGrupin(909), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				249,
				new Ligjerata(getProfesorin(32), DREJTIMI.get(702).getLenden(
						515), DREJTIMI.get(702).getGrupin(910), true,
						"Shkenca Kompjuterike", 3, "U", 90));
		//Analize e te dhenave
		DREJTIMI.get(702).shtoLigjeraten(
				250,
				new Ligjerata(getProfesorin(5), DREJTIMI.get(702).getLenden(
						516), DREJTIMI.get(702).getGrupin(908), false,
						"Shkenca Kompjuterike", 3, "L", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				251,
				new Ligjerata(getProfesorin(5), DREJTIMI.get(702).getLenden(
						516), DREJTIMI.get(702).getGrupin(909), false,
						"Shkenca Kompjuterike", 3, "U", 90));
		DREJTIMI.get(702).shtoLigjeraten(
				252,
				new Ligjerata(getProfesorin(5), DREJTIMI.get(702).getLenden(
						516), DREJTIMI.get(702).getGrupin(910), false,
						"Shkenca Kompjuterike", 3, "U", 90));
		//Matematike e Pergjithshme I
		//Matematike Elementare
		DREJTIMI.get(703).shtoLigjeraten(
				253,
				new Ligjerata(getProfesorin(18), DREJTIMI.get(703).getLenden(
						517), DREJTIMI.get(703).getGrupin(912), false,
						"Matematike e pergjithshme", 1, "L", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				254,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(703).getLenden(
						517), DREJTIMI.get(703).getGrupin(913), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				255,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(703).getLenden(
						517), DREJTIMI.get(703).getGrupin(914), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				256,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(703).getLenden(
						517), DREJTIMI.get(703).getGrupin(915), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		//Analize Matematike I
		DREJTIMI.get(703).shtoLigjeraten(
				257,
				new Ligjerata(getProfesorin(6), DREJTIMI.get(703).getLenden(
						518), DREJTIMI.get(703).getGrupin(912), false,
						"Matematike e Pergjithshme", 1, "L", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				258,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(703).getLenden(
						518), DREJTIMI.get(703).getGrupin(913), false,
						"Matematika e Pergjitshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				259,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(703).getLenden(
						518), DREJTIMI.get(703).getGrupin(914), false,
						"Matematika e Pergjitshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				260,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(703).getLenden(
						518), DREJTIMI.get(703).getGrupin(915), false,
						"Matematika e Pergjitshme", 1, "U", 90));
		//Matematike Diskrete
		DREJTIMI.get(703).shtoLigjeraten(
				261,
				new Ligjerata(getProfesorin(8), DREJTIMI.get(703).getLenden(
						519), DREJTIMI.get(703).getGrupin(912),false,
						"Matematike e Pergjithshme", 1, "L", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				262,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(703).getLenden(
						519), DREJTIMI.get(703).getGrupin(913), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				263,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(703).getLenden(
						519), DREJTIMI.get(703).getGrupin(914), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				264,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(703).getLenden(
						519), DREJTIMI.get(703).getGrupin(915), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		//Gjeomtri Analitike
		DREJTIMI.get(703).shtoLigjeraten(
				265,
				new Ligjerata(getProfesorin(1), DREJTIMI.get(703).getLenden(
						520), DREJTIMI.get(703).getGrupin(912), false,
						"Matematike e Pergjithshme", 1, "L", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				266,
				new Ligjerata(getProfesorin(34), DREJTIMI.get(703).getLenden(
						520), DREJTIMI.get(703).getGrupin(914), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				267,
				new Ligjerata(getProfesorin(34), DREJTIMI.get(703).getLenden(
						520), DREJTIMI.get(703).getGrupin(915), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		DREJTIMI.get(703).shtoLigjeraten(
				268,
				new Ligjerata(getProfesorin(34), DREJTIMI.get(703).getLenden(
						520), DREJTIMI.get(703).getGrupin(916), false,
						"Matematike e Pergjithshme", 1, "U", 90));
		//Gjuhe Angleze I
		DREJTIMI.get(703).shtoLigjeraten(
				269,
				new Ligjerata(getProfesorin(23), DREJTIMI.get(703).getLenden(
						521), DREJTIMI.get(703).getGrupin(912), false,
						"Matematike e Pergjithshme", 1, "L", 90));
		//Matematike e Pergjithshme II
		//Analiza Matematike II
		DREJTIMI.get(704).shtoLigjeraten(
				270,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(704).getLenden(
						522), DREJTIMI.get(704).getGrupin(916),
						false, "Matematike e Pergjithshme", 2, "L", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				271,
				new Ligjerata(getProfesorin(14), DREJTIMI.get(704).getLenden(
						522), DREJTIMI.get(704).getGrupin(917), false,
						"Matematike e Pergjithshme", 2, "U", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				272,
				new Ligjerata(getProfesorin(14), DREJTIMI.get(704).getLenden(
						522), DREJTIMI.get(704).getGrupin(918), false,
						"Matematike e Pergjithshme", 2, "U", 90));
		//Gjeometri Elementare
		DREJTIMI.get(704).shtoLigjeraten(
				273,
				new Ligjerata(getProfesorin(10), DREJTIMI.get(704).getLenden(
						523), DREJTIMI.get(704).getGrupin(916),
						false, "Matematike e Pergjithshme", 2, "L", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				274,
				new Ligjerata(getProfesorin(35), DREJTIMI.get(704).getLenden(
						523), DREJTIMI.get(704).getGrupin(917), false,
						"Matematike e Pergjithshme", 2, "U", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				275,
				new Ligjerata(getProfesorin(35), DREJTIMI.get(704).getLenden(
						523), DREJTIMI.get(704).getGrupin(918), false,
						"Matematike e Pergjithshme", 2, "U", 90));
		//Algjebra Lineare
		DREJTIMI.get(704).shtoLigjeraten(
				276,
				new Ligjerata(getProfesorin(11), DREJTIMI.get(704).getLenden(
						524), DREJTIMI.get(704).getGrupin(916),
						false, "Matematike e Pergjithshme", 2, "L", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				277,
				new Ligjerata(getProfesorin(36), DREJTIMI.get(704).getLenden(
						524), DREJTIMI.get(704).getGrupin(917),
						false, "Matematike e Pergjithshme", 2, "U", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				278,
				new Ligjerata(getProfesorin(36), DREJTIMI.get(704).getLenden(
						524), DREJTIMI.get(704).getGrupin(918),
						false, "Matematike e Pergjithshme", 2, "U", 90));
		//Analize Numerike
		DREJTIMI.get(704).shtoLigjeraten(
				279,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(704).getLenden(
						524), DREJTIMI.get(704).getGrupin(916),
						false, "Matematike e Pergjithshme", 2, "L", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				280,
				new Ligjerata(getProfesorin(26), DREJTIMI.get(704).getLenden(
						524), DREJTIMI.get(704).getGrupin(917), true,
						"Matematike e Pergjithshme", 2, "U", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				281,
				new Ligjerata(getProfesorin(26), DREJTIMI.get(704).getLenden(
						524), DREJTIMI.get(704).getGrupin(918), true,
						"Matematike e Pergjithshme", 2, "U", 90));
		//Hyrje ne Matematike Financiare
		DREJTIMI.get(704).shtoLigjeraten(
				282,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(704).getLenden(
						526), DREJTIMI.get(704).getGrupin(916), true,
						"Matematike e Pergjithshme", 2, "L", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				283,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(704).getLenden(
						526), DREJTIMI.get(704).getGrupin(917), true,
						"Matematike e Pergjithshme", 2, "U", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				284,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(704).getLenden(
						526), DREJTIMI.get(704).getGrupin(918), true,
						"Matematike e Pergjithshme", 2, "U", 90));
		//Hyrje ne shkencat kompjuterike
		DREJTIMI.get(704).shtoLigjeraten(
				285,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(704).getLenden(
						527), DREJTIMI.get(704).getGrupin(916), false,
						"Matematike e Pergjithshme", 2, "L", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				286,
				new Ligjerata(getProfesorin(28), DREJTIMI.get(704).getLenden(
						526), DREJTIMI.get(704).getGrupin(917), true,
						"Matematike e Pergjithshme", 2, "U", 90));
		DREJTIMI.get(704).shtoLigjeraten(
				287,
				new Ligjerata(getProfesorin(28), DREJTIMI.get(704).getLenden(
						526), DREJTIMI.get(704).getGrupin(918), true,
						"Matematike e Pergjithshme", 2, "U", 90));
		//Matematike e Pergjithshme III
		//Analize Numerike I
		DREJTIMI.get(705).shtoLigjeraten(
				288,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(705).getLenden(
						528), DREJTIMI.get(705).getGrupin(920),
						false, "Matematike e Pergjithshme", 3, "L", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				289,
				new Ligjerata(getProfesorin(29), DREJTIMI.get(705).getLenden(
						528), DREJTIMI.get(705).getGrupin(921), true,
						"Matematike e Pergjithshme", 3, "U", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				290,
				new Ligjerata(getProfesorin(29), DREJTIMI.get(705).getLenden(
						528), DREJTIMI.get(705).getGrupin(922), true,
						"Matematike e Pergjithshme", 3, "U", 90));
		//Algjebra e Pergjithshme
		DREJTIMI.get(705).shtoLigjeraten(
				291,
				new Ligjerata(getProfesorin(12), DREJTIMI.get(705).getLenden(
						529), DREJTIMI.get(705).getGrupin(920),
						false, "Matematike e Pergjithshme", 3, "L", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				292,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(705).getLenden(
						529), DREJTIMI.get(705).getGrupin(921),
						false, "Matematike e Pergjithshme", 3, "U", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				293,
				new Ligjerata(getProfesorin(19), DREJTIMI.get(705).getLenden(
						529), DREJTIMI.get(705).getGrupin(922), false,
						"Matematike e Pergjithshme", 3, "U", 90));
		//Hapesirat Vektoriale
		DREJTIMI.get(705).shtoLigjeraten(
				294,
				new Ligjerata(getProfesorin(11), DREJTIMI.get(705).getLenden(
						530), DREJTIMI.get(705).getGrupin(920), false,
						"Matematike e Pergjithshme", 3, "L", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				295,
				new Ligjerata(getProfesorin(36), DREJTIMI.get(705).getLenden(
						530), DREJTIMI.get(705).getGrupin(921),
						true, "Matematike e Pergjithshme", 3, "U", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				296,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(705).getLenden(
						530), DREJTIMI.get(705).getGrupin(922),
						false, "Matematike e Pergjithshme", 3, "U", 90));
		//Analize Reale
		DREJTIMI.get(705).shtoLigjeraten(
				297,
				new Ligjerata(getProfesorin(8), DREJTIMI.get(705).getLenden(
						531), DREJTIMI.get(705).getGrupin(920), false,
						"Matematike e Pergjithshme", 3, "L", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				298,
				new Ligjerata(getProfesorin(38), DREJTIMI.get(705).getLenden(
						531), DREJTIMI.get(705).getGrupin(921),
						false, "Matematike e Pergjithshme", 3, "U", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				299,
				new Ligjerata(getProfesorin(38), DREJTIMI.get(705).getLenden(
						531), DREJTIMI.get(705).getGrupin(922),
						false, "Matematike e Pergjithshme", 3, "U", 90));
		//Programimi Matematik
		DREJTIMI.get(705).shtoLigjeraten(
				300,
				new Ligjerata(getProfesorin(10), DREJTIMI.get(705).getLenden(
						532), DREJTIMI.get(705).getGrupin(920), false,
						"Matematike e Pergjithshme", 3, "L", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				301,
				new Ligjerata(getProfesorin(39), DREJTIMI.get(705).getLenden(
						532), DREJTIMI.get(705).getGrupin(921),
						true, "Matematike e Pergjithshme", 3, "U", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				302,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(705).getLenden(
						532), DREJTIMI.get(705).getGrupin(922),
						true, "Matematike e Pergjithshme", 3, "U", 90));
		//Baza e te dhenave
		DREJTIMI.get(705).shtoLigjeraten(
				303,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(705).getLenden(
						533), DREJTIMI.get(705).getGrupin(920), true,
						"Matematike e Pergjithshme", 3, "L", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				304,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(705).getLenden(
						533), DREJTIMI.get(705).getGrupin(921),
						true, "Matematike e Pergjithshme", 3, "U", 90));
		DREJTIMI.get(705).shtoLigjeraten(
				305,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(705).getLenden(
						533), DREJTIMI.get(705).getGrupin(922),
						true, "Matematike e Pergjithshme", 3, "U", 90));
		//Matematike e Pergjithshme IV
		//Ekuacionet Diferenciale
		DREJTIMI.get(706).shtoLigjeraten(
				306,
				new Ligjerata(getProfesorin(11), DREJTIMI.get(706).getLenden(
						534), DREJTIMI.get(706).getGrupin(924), false,
						"Matematike e Pergjithshme", 4, "L", 90));
		DREJTIMI.get(706).shtoLigjeraten(
				307,
				new Ligjerata(getProfesorin(20), DREJTIMI.get(706).getLenden(
						534), DREJTIMI.get(706).getGrupin(924),
						false, "Matematike e Pergjithshme", 4, "U", 90));
		//Metode Matematike
		DREJTIMI.get(706).shtoLigjeraten(
				308,
				new Ligjerata(getProfesorin(13), DREJTIMI.get(706).getLenden(
						535), DREJTIMI.get(706).getGrupin(924),
						false, "Matematike e Pergjithshme", 4, "L", 90));
		DREJTIMI.get(706).shtoLigjeraten(
				309,
				new Ligjerata(getProfesorin(13), DREJTIMI.get(706).getLenden(
						535), DREJTIMI.get(706).getGrupin(924),
						false, "Matematike e Pergjithshme", 4, "U", 90));
		//Gjeometri Diferenciale
		DREJTIMI.get(706).shtoLigjeraten(
				310,
				new Ligjerata(getProfesorin(18), DREJTIMI.get(706).getLenden(
						536), DREJTIMI.get(706).getGrupin(924), false,
						"Matematike e Pergjithshme", 4, "L", 90));
		DREJTIMI.get(706).shtoLigjeraten(
				311,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(706).getLenden(
						536), DREJTIMI.get(706).getGrupin(924),
						false, "Matematike e Pergjithshme", 4, "U", 90));
		//Elemente te Analizes Funksionale
		DREJTIMI.get(706).shtoLigjeraten(
				312,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(706).getLenden(
						537), DREJTIMI.get(706).getGrupin(924), false,
						"Matematike e Pergjithshme", 4, "L", 90));
		DREJTIMI.get(706).shtoLigjeraten(
				313,
				new Ligjerata(getProfesorin(14), DREJTIMI.get(706).getLenden(
						537), DREJTIMI.get(706).getGrupin(924),
						false, "Matematike e Pergjithshme", 4, "U", 90));
		//Analiza e te dhenave
		DREJTIMI.get(706).shtoLigjeraten(
				314,
				new Ligjerata(getProfesorin(8), DREJTIMI.get(706).getLenden(
						538), DREJTIMI.get(706).getGrupin(924), false,
						"Matematike e Pergjithshme", 4, "L", 90));
		DREJTIMI.get(706).shtoLigjeraten(
				315,
				new Ligjerata(getProfesorin(5), DREJTIMI.get(706).getLenden(
						538), DREJTIMI.get(706).getGrupin(924),
						false, "Matematike e Pergjithshme", 4, "U", 90));
		//Matematika Financiare I
		//Analize I
		DREJTIMI.get(707).shtoLigjeraten(
				316,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(707).getLenden(
						539), DREJTIMI.get(707).getGrupin(928), false,
						"Matematika Financiare", 1, "L", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				317,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(707).getLenden(
						539), DREJTIMI.get(707).getGrupin(929), false,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				318,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(707).getLenden(
						539), DREJTIMI.get(707).getGrupin(930), false,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				319,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(707).getLenden(
						539), DREJTIMI.get(707).getGrupin(931), false,
						"Matematika Financiare", 1, "U", 90));
		//Algjebra I
		DREJTIMI.get(707).shtoLigjeraten(
				320,
				new Ligjerata(getProfesorin(12), DREJTIMI.get(707).getLenden(
						540), DREJTIMI.get(707).getGrupin(928),false,
						"Matematika Financiare", 1, "L", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				321,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(707).getLenden(
						540), DREJTIMI.get(707).getGrupin(929),
						false, "Matematike Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				322,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(707).getLenden(
						540), DREJTIMI.get(707).getGrupin(930),
						false, "Matematike Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				323,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(707).getLenden(
						540), DREJTIMI.get(707).getGrupin(931),
						false, "Matematike Financiare", 1, "U", 90));
		//Matematika Diskrete I
		DREJTIMI.get(707).shtoLigjeraten(
				324,
				new Ligjerata(getProfesorin(1), DREJTIMI.get(707).getLenden(
						541), DREJTIMI.get(707).getGrupin(928), false,
						"Matematika Financiare", 1, "L", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				325,
				new Ligjerata(getProfesorin(36), DREJTIMI.get(707).getLenden(
						541), DREJTIMI.get(707).getGrupin(929), false,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				326,
				new Ligjerata(getProfesorin(36), DREJTIMI.get(707).getLenden(
						541), DREJTIMI.get(707).getGrupin(930), false,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				327,
				new Ligjerata(getProfesorin(36), DREJTIMI.get(707).getLenden(
						541), DREJTIMI.get(707).getGrupin(931), false,
						"Matematika Financiare", 1, "U", 90));
		//Proceset Stokastike
		DREJTIMI.get(707).shtoLigjeraten(
				328,
				new Ligjerata(getProfesorin(18), DREJTIMI.get(707).getLenden(
						542), DREJTIMI.get(707).getGrupin(928), false,
						"Matematika Financiare", 1, "L", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				329,
				new Ligjerata(getProfesorin(22), DREJTIMI.get(707).getLenden(
						542), DREJTIMI.get(707).getGrupin(929), true,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				330,
				new Ligjerata(getProfesorin(22), DREJTIMI.get(707).getLenden(
						542), DREJTIMI.get(707).getGrupin(930), true,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				331,
				new Ligjerata(getProfesorin(22), DREJTIMI.get(707).getLenden(
						542), DREJTIMI.get(707).getGrupin(931), true,
						"Matematika Financiare", 1, "U", 90));
		//Praktikum i Kompjuterit
		DREJTIMI.get(707).shtoLigjeraten(
				332,
				new Ligjerata(getProfesorin(39), DREJTIMI.get(707).getLenden(
						543), DREJTIMI.get(707).getGrupin(928), true,
						"Matematika Financiare", 1, "L", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				333,
				new Ligjerata(getProfesorin(41), DREJTIMI.get(707).getLenden(
						543), DREJTIMI.get(707).getGrupin(929), true,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				334,
				new Ligjerata(getProfesorin(41), DREJTIMI.get(707).getLenden(
						543), DREJTIMI.get(707).getGrupin(930), true,
						"Matematika Financiare", 1, "U", 90));
		DREJTIMI.get(707).shtoLigjeraten(
				335,
				new Ligjerata(getProfesorin(41), DREJTIMI.get(707).getLenden(
						543), DREJTIMI.get(707).getGrupin(931), true,
						"Matematika Financiare", 1, "U", 90));
		//Matematika Financiare II
		//Analiza III
		DREJTIMI.get(708).shtoLigjeraten(
				336,
				new Ligjerata(getProfesorin(3), DREJTIMI.get(708).getLenden(
						544), DREJTIMI.get(708).getGrupin(932), false,
						"Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				337,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(708).getLenden(
						544), DREJTIMI.get(708).getGrupin(933), false,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				338,
				new Ligjerata(getProfesorin(7), DREJTIMI.get(708).getLenden(
						544), DREJTIMI.get(708).getGrupin(934), false,
						"Matematika Financiare", 2, "U", 90));
		//Teori e Gjases I
		DREJTIMI.get(708).shtoLigjeraten(
				339,
				new Ligjerata(getProfesorin(8), DREJTIMI.get(708).getLenden(
						545), DREJTIMI.get(708).getGrupin(932),
						false, "Matematike Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				340,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(708).getLenden(
						545), DREJTIMI.get(708).getGrupin(933),
						false, "Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				341,
				new Ligjerata(getProfesorin(37), DREJTIMI.get(708).getLenden(
						545), DREJTIMI.get(708).getGrupin(933),
						false, "Matematika Financiare", 2, "U", 90));
		//Programim I
		DREJTIMI.get(708).shtoLigjeraten(
				342,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(708).getLenden(
						546), DREJTIMI.get(708).getGrupin(932),
						false, "Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				343,
				new Ligjerata(getProfesorin(24), DREJTIMI.get(708).getLenden(
						546), DREJTIMI.get(708).getGrupin(933), true,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				344,
				new Ligjerata(getProfesorin(24), DREJTIMI.get(708).getLenden(
						546), DREJTIMI.get(708).getGrupin(934), true,
						"Matematika Financiare", 2, "U", 90));
		//Metoda Numerike I
		DREJTIMI.get(708).shtoLigjeraten(
				345,
				new Ligjerata(getProfesorin(2), DREJTIMI.get(708).getLenden(
						547), DREJTIMI.get(708).getGrupin(932), false,
						"Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				346,
				new Ligjerata(getProfesorin(26), DREJTIMI.get(708).getLenden(
						547), DREJTIMI.get(708).getGrupin(933), true,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				347,
				new Ligjerata(getProfesorin(26), DREJTIMI.get(708).getLenden(
						547), DREJTIMI.get(708).getGrupin(934), true,
						"Matematika Financiare", 2, "U", 90));
		//Makroekonomi
		DREJTIMI.get(708).shtoLigjeraten(
				348,
				new Ligjerata(getProfesorin(15), DREJTIMI.get(708).getLenden(
						548), DREJTIMI.get(708).getGrupin(932), false,
						"Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				349,
				new Ligjerata(getProfesorin(42), DREJTIMI.get(708).getLenden(
						548), DREJTIMI.get(708).getGrupin(933), false,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				350,
				new Ligjerata(getProfesorin(42), DREJTIMI.get(708).getLenden(
						548), DREJTIMI.get(708).getGrupin(934), false,
						"Matematika Financiare", 2, "U", 90));
		//Bazat e Menaxhmentit
		DREJTIMI.get(708).shtoLigjeraten(
				351,
				new Ligjerata(getProfesorin(15), DREJTIMI.get(708).getLenden(
						549), DREJTIMI.get(708).getGrupin(932), false,
						"Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				352,
				new Ligjerata(getProfesorin(43), DREJTIMI.get(708).getLenden(
						549), DREJTIMI.get(708).getGrupin(933), false,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				353,
				new Ligjerata(getProfesorin(43), DREJTIMI.get(708).getLenden(
						549), DREJTIMI.get(708).getGrupin(934), false,
						"Matematika Financiare", 2, "U", 90));
		//Baza e te dhenave
		DREJTIMI.get(708).shtoLigjeraten(
				354,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(708).getLenden(
						550), DREJTIMI.get(708).getGrupin(932), true,
						"Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				355,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(708).getLenden(
						550), DREJTIMI.get(708).getGrupin(933), true,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				356,
				new Ligjerata(getProfesorin(27), DREJTIMI.get(708).getLenden(
						550), DREJTIMI.get(708).getGrupin(934), true,
						"Matematika Financiare", 2, "U", 90));
		//Statistike
		DREJTIMI.get(708).shtoLigjeraten(
				357,
				new Ligjerata(getProfesorin(10), DREJTIMI.get(708).getLenden(
						551), DREJTIMI.get(708).getGrupin(932), false,
						"Matematika Financiare", 2, "L", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				358,
				new Ligjerata(getProfesorin(5), DREJTIMI.get(708).getLenden(
						551), DREJTIMI.get(708).getGrupin(933), true,
						"Matematika Financiare", 2, "U", 90));
		DREJTIMI.get(708).shtoLigjeraten(
				359,
				new Ligjerata(getProfesorin(5), DREJTIMI.get(708).getLenden(
						551), DREJTIMI.get(708).getGrupin(934), true,
						"Matematika Financiare", 2, "U", 90));
		//Matematika Financiare III
		//Praktikum Financiar
		DREJTIMI.get(709).shtoLigjeraten(
				360,
				new Ligjerata(getProfesorin(9), DREJTIMI.get(709).getLenden(
						552), DREJTIMI.get(709).getGrupin(936), false,
						"Matematika Financiare", 3, "L", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				361,
				new Ligjerata(getProfesorin(33), DREJTIMI.get(709).getLenden(
						552), DREJTIMI.get(709).getGrupin(937),
						true, "Matematike Financiare", 3, "U", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				362,
				new Ligjerata(getProfesorin(33), DREJTIMI.get(709).getLenden(
						552), DREJTIMI.get(709).getGrupin(938),
						true, "Matematike Financiare", 3, "U", 90));
		//Gjuhe Shqipe
		DREJTIMI.get(709).shtoLigjeraten(
				363,
				new Ligjerata(getProfesorin(16), DREJTIMI.get(709).getLenden(
						553), DREJTIMI.get(709).getGrupin(936), false,
						"Matematika Financiare", 3, "L", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				364,
				new Ligjerata(getProfesorin(44), DREJTIMI.get(709).getLenden(
						553), DREJTIMI.get(709).getGrupin(937), true,
						"Matematika Financiare", 3, "U", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				365,
				new Ligjerata(getProfesorin(44), DREJTIMI.get(709).getLenden(
						553), DREJTIMI.get(709).getGrupin(938), true,
						"Matematika Financiare", 3, "U", 90));
		//Menaxhmenti Financiar
		DREJTIMI.get(709).shtoLigjeraten(
				366,
				new Ligjerata(getProfesorin(17), DREJTIMI.get(709).getLenden(
						554), DREJTIMI.get(709).getGrupin(936), false,
						"Matematika Financiare", 3, "L", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				367,
				new Ligjerata(getProfesorin(33), DREJTIMI.get(709).getLenden(
						554), DREJTIMI.get(709).getGrupin(937), false,
						"Matematika Financiare", 3, "U", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				368,
				new Ligjerata(getProfesorin(33), DREJTIMI.get(709).getLenden(
						554), DREJTIMI.get(709).getGrupin(938), false,
						"Matematika Financiare", 3, "U", 90));
		//Programimi ne Web
		DREJTIMI.get(709).shtoLigjeraten(
				369,
				new Ligjerata(getProfesorin(4), DREJTIMI.get(709).getLenden(
						555), DREJTIMI.get(709).getGrupin(936), false,
						"Matematika Financiare", 3, "L", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				370,
				new Ligjerata(getProfesorin(32), DREJTIMI.get(709).getLenden(
						555), DREJTIMI.get(709).getGrupin(937), true,
						"Matematika Financiare", 3, "U", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				371,
				new Ligjerata(getProfesorin(32), DREJTIMI.get(709).getLenden(
						555), DREJTIMI.get(709).getGrupin(938), true,
						"Matematika Financiare", 3, "U", 90));
		// Biznesi Elektronik
		DREJTIMI.get(709).shtoLigjeraten(
				372,
				new Ligjerata(getProfesorin(40), DREJTIMI.get(709).getLenden(
						556), DREJTIMI.get(709).getGrupin(936), false,
						"Matematika Financiare", 3, "L", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				373,
				new Ligjerata(getProfesorin(40), DREJTIMI.get(709).getLenden(
						556), DREJTIMI.get(709).getGrupin(937), true,
						"Matematika Financiare", 3, "U", 90));
		DREJTIMI.get(709).shtoLigjeraten(
				374,
				new Ligjerata(getProfesorin(40), DREJTIMI.get(709).getLenden(
						556), DREJTIMI.get(709).getGrupin(938), true,
						"Matematika Financiare", 3, "U", 90));
	

	}

	public static Profesoret getProfesorin(int key) {
		return PROFESORI.get(key);
	}

	public static Sallat getSallen(int key) {
		return SALLA.get(key);
	}

	// public static Lenda getLigjeraten(int key){
	// return LIGJERATA.get(key);
	// }

	public static int NrSallave() {
		return SALLA.size();
	}
	public static Ligjerata merrLigjeraten(int id) {
		for (int i=0; i<DREJTIMI.size(); i++) {
			if (DREJTIMI.get(700+i).merrLigjeraten(id) != null) {
				return DREJTIMI.get(700+i).merrLigjeraten(id);
			}
		}
		return null;
	}

	public static void printoOrarin() {
		int n = DREJTIMI.size();
		for (int i=0; i<n; i++) {
			Iterator<Ligjerata> iter = DREJTIMI.get(700+i).iteruesLigjeratave();
			while (iter.hasNext()) {
				System.out.println(iter.next());
				System.out.println("-----------------------------");
			}
		}
	}

	public static void hillClimb() {
		Random rand = new Random();
		int n = DREJTIMI.size();
		for (int i=0; i<n; i++) {//Gjenerojme rastesisht kohen dhe sallat e ligjeratave
			Iterator<Ligjerata> iter = DREJTIMI.get(700+i).iteruesLigjeratave();//Marrim iteruesin e ligjeratave te 1 drejtimi
			while (iter.hasNext()) {
				Ligjerata l = iter.next();
				l.ndryshoDiten(rand.nextInt(5));// Dita = random[0, 5)
				l.ndryshoOren(rand.nextInt(10)+8);//Ora = random[8, 18)
				l.ndryshoSallen(rand.nextInt(Databaza.NrSallave())+100);//Salla = random[100, NrSallave)
			}
		}
		
		
		int iterimi;
		boolean perfunduarPaPerplasje = true;
		for (iterimi = 0; iterimi<100; iterimi++) {
			perfunduarPaPerplasje = true;
			for (int i=0; i<n; i++) {//Gjenerojme rastesisht kohen dhe sallat e ligjeratave
				Iterator<Ligjerata> iter = DREJTIMI.get(700+i).iteruesLigjeratave();//Marrim iteruesin e ligjeratave te 1 drejtimi
				while (iter.hasNext()) {
					Ligjerata l = iter.next();
					if (Konflikte.Orari(l.getOra(), l)) {
						perfunduarPaPerplasje = false;//Kemi perplasje
						l.ndryshoDiten(rand.nextInt(5));
						l.ndryshoOren(rand.nextInt(10) + 8);
						l.ndryshoSallen(rand.nextInt(Databaza.NrSallave()) + 100);
					}
				}
			}
		}
		System.out.println(perfunduarPaPerplasje);
	}
	public static void main(String[] args) {
		teDhenat();
	
		hillClimb();
		printoOrarin();
		new Tabela();
		System.out.println("Perfundimi");
	}

}

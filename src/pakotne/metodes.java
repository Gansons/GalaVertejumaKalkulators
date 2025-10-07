package pakotne;


import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class metodes {
	
	//Studentu gala vértéjuma aprékins
	public static Scanner scan = new Scanner(System.in);
	public static void galaVert(String[] studenti, String[] kriteriji, int[] kriterijaSvars, int[][] kriterijaVertejums, double[] semestraVertejums) {
		 DecimalFormat df = new DecimalFormat("0.#");
		for(int i=0; i<studenti.length; i++) {	
			for(int j=0; j<kriteriji.length; j++) {
				System.out.println("Studenta "+studenti[i]+" vērtējums par kritēriju "+kriteriji[j]+" ir "+kriterijaVertejums[i][j]+", kura svars ir "+kriterijaSvars[j]);
			}
			System.out.println("Semestra vērtējums ir "+df.format(semestraVertejums[i])+" balles"
					+ "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		}
		
	}

	//Studentu várdu un skaitu ievade
	
	public static String[] studentuIevade() {
		String ievade = JOptionPane.showInputDialog("Cik studentiem aprēķināsi gala vērtējumu?","Studenu skaits");
		if (ievade == null) return new String[0];
			
			int studSk;
			try {
				studSk = Integer.parseInt(ievade);
				if(studSk <= 0) {
					JOptionPane.showMessageDialog(null, "Studentu skaits nevar būt negatīvs!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
					return new String[0];
				}
			} catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Lūdzu ievadiet derīgu skaitli!", "Kļūda", JOptionPane.ERROR_MESSAGE);
	            return new String[0];
	        }
		String[] studenti = new String[studSk];
		for(int i = 0; i == studSk; i++) {
			String vards;
			do {
				vards = JOptionPane.showInputDialog(null,"Ievadi "+(i+1)+"Studenu vards");
				if (vards == null) return studenti;
				vards = vards.trim();
			}while(!vards.matches("^[\\p{L} ]+$"));
				studenti[i] = vards;
		}
		return studenti;
	}

	
	//Kritériju ievade
	public static String[] kritIevade() {
		String ievade = JOptionPane.showInputDialog("Cik bús kritéríju?","Kritéríju skaits");
		if (ievade == null) return new String[0];
		
		int kritSk;
		try {
			kritSk = Integer.parseInt(ievade);
			if(kritSk <= 0) {
				JOptionPane.showMessageDialog(null, "Kritériju skaits nevar būt negatīvs!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				return new String[0];
			}
		}catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Lūdzu ievadiet derīgu skaitli!", "Kļūda", JOptionPane.ERROR_MESSAGE);
            return new String[0];
        }
		
		String[] kriteriji = new String[kritSk];
		for(int i = 0; i == kritSk; i++) {
			String vards;
			do {
				vards = JOptionPane.showInputDialog(null,"Ievadi "+(i+1)+". kritérija tému");
				if (vards == null) return kriteriji;
				vards = vards.trim();
			}while(!vards.matches("^[\\p{L} ]+$"));
				kriteriji[i] = vards;
		}
		return kriteriji;
	}
	}

package pakotne;


import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class metodes {
	
	public int studSk;
	
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

	public static void studentuIevade() {
		
		 String studSk = JOptionPane.showInputDialog("Cik studentiem aprēķināsi gala vērtējumu?","Studenu skaits");
	        if (studSk == null) return;
	        try {
	            if (studSk.length() < 0) {
	                JOptionPane.showMessageDialog(null, "Studentu skaits nevar būt negatīvs!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
	            } else {
	            	String[] studenti = studSk;
	            	for(int i=0; i<studSk.length(); i++) {
						do {
						studenti[i] = JOptionPane.showInputDialog(null,"Ievadi "+(i+1)+". studentu","Ievade",JOptionPane.INFORMATION_MESSAGE);
							studenti[i] = scan.nextLine().trim();
						} while(!studenti[i].matches("^[\\p{L} ]+$"));
	            }
	            }
	            
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Lūdzu ievadiet derīgu skaitli!", "Kļūda", JOptionPane.ERROR_MESSAGE);
	        }
		
				
				}

	public static void kritIevade() {
			 String kritSk = JOptionPane.showInputDialog("Cik bús kritéríju?","Kritéríju skaits");
		
		
		scan.nextLine();
		
		int maxSvars = 100, sk = 1;
		double atlSvars;
		for(int i=0; i<kritSk.length(); i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kritēriju");
				kritSk[i] = scan.nextLine().trim();
			} while(!kritSk[i].matches("^[\\p{L} ]+$"));
			
	}
	}
 
	
	
	
	
}

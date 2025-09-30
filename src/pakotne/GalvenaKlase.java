package pakotne;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GalvenaKlase {
	public static void main(String[] args) {
		int studSk, kritSk;
		String izvele;
		Scanner scan = new Scanner(System.in);
		 String[] darbibusarakst = {"Ievadīt audzēkņus", "Ievadīt kritērijus", "Ievadīt kritēriju svarus", ""
		 		+ "Ievadīt vērtējumus", "Labot kritēriju", "Labot kritērija svaru", ""
		 				+ "Labot iegūto vērtējumu", "Aprēķināt gala vērtējumu", "Saglabāt rezultātus failā", "Nolasīt rezultātus no faila", "Beigt programmu"};

	        do {
	            izvele = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību", "Darbību izvēle",
	                    JOptionPane.QUESTION_MESSAGE, null, darbibusarakst, darbibusarakst[0]);

	            if (izvele == null)
	                izvele = "Beigt programmu";
	            
		switch (izvele) {
		
		
        case "Ievadīt audzēkņus":
        	metodes.studentuIevade();
            break;
            
        case "Ievadīt kritērijus":
        	metodes.kritIevade();
        	break;
        case "Ievadīt kritēriju svarus":
        	
        	break;
        case "Ievadīt vērtējumus":
        		
        	break;
        case "Labot kritēriju":
        	
        	break;
        case "Labot kritērija svaru":
        	
        	break;
        case "Labot iegūto vērtējumu":
          
        	break;
        case "Nolasīt rezultātus no faila":
        
        break;
		}
		} while (!izvele.equals("Beigt programmu"));

        JOptionPane.showMessageDialog(null, "Programma apturēta", "Beigas", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
        
		

			// Norāda katra kritērija svaru
        /*
			do {
				System.out.println("Ievadi "+(i+1)+". kritērija svaru (max: "+maxSvars+")");
				while(!scan.hasNextInt()) {
					System.out.println("Ievadi "+(i+1)+". kritērija svaru");
					scan.next();
				}
				kriterijaSvars[i] = scan.nextInt();
				/* Minimālā KATRA ATLIKUŠĀ kritērija svars ir 5
				 * kopējai svaru vērtībai ir jābūt 100 (ne mazāk, ne vairāk)
				*/
				/*
				atlSvars = (maxSvars - kriterijaSvars[i]) / (double)(kriteriji.length - sk);
			} while(kriterijaSvars[i]>maxSvars || kriterijaSvars[i]<5 || 
				  (i != kriteriji.length-1 && kriterijaSvars[i] == maxSvars) ||
				  (i == kriteriji.length-1 && (maxSvars - kriterijaSvars[i])  > 0) 
				  || atlSvars < 5);
			maxSvars -= kriterijaSvars[i];
			sk++;
			scan.nextLine();
		}
		
		// Norāda vērtējumu kādu ieguvis katrs audzēknis par katru kritēriju
		for(int i=0; i<kriterijaVertejums.length; i++) {
			for(int j=0; j<kriterijaVertejums[i].length; j++) {
				do {
					System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
					while(!scan.hasNextInt()) {
						System.out.println("Ievadi "+studenti[i]+" vērtējumu par kritēriju "+kriteriji[j]);
						scan.next();
					}
					kriterijaVertejums[i][j] = scan.nextInt();
				}while(kriterijaVertejums[i][j]<0 || kriterijaVertejums[i][j]>10);
			}
		}
		
		// Gala vērtējuma aprēķināšana
		double rezultats;
		for(int i=0; i<studenti.length; i++) {
			rezultats=0;
			for(int j=0; j<kriteriji.length; j++) {
				rezultats += ((double) kriterijaSvars[j]/100)*kriterijaVertejums[i][j];
			}
			semestraVertejums[i] = rezultats;
		}
		
		// Gala vērtējumu izvadīšana
		
		*/
		scan.close();
	}
}
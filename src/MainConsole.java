/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlva: 2024.02.21, Németh Ottó
 */

import java.util.Scanner;

public class MainConsole {
    
    
        String  szallitas = "";
        String uzlet = "";
        String javitas = "";    


        public MainConsole() {
      
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");        
        
      
        Scanner scanner = new Scanner(System.in);        

        System.out.println("──────────────────────────────────────────");
        System.out.print("Szállítási költség: ");
        szallitas = scanner.nextLine();

        System.out.println("──────────────────────────────────────────");
        System.out.print("Üzleti költség: ");
        uzlet = scanner.nextLine();

        System.out.println("──────────────────────────────────────────");
        System.out.print("Javítási költség: ");
        javitas = scanner.nextLine();        
        Koltseg koltseg = new Koltseg(szallitas, uzlet, javitas);
        Filehandler filehandler = new Filehandler();
        filehandler.writeToFile(koltseg);
    }
}

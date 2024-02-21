/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlva 2024.02.21, Németh Ottó
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Filehandler {
    
    public void writeToFile(Koltseg koltseg) {
       
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("adat.txt", true));
            
            pw.write(koltseg.szallitas.toString());
            pw.write(":");
            pw.write(koltseg.uzlet.toString());
            pw.write(":");
            pw.write(koltseg.javitas.toString());
            pw.write("\n");
            
            pw.close();
            System.out.println("Költségek sikeresen kiírva a fájlba.");
        } catch (IOException e) {
            System.err.println("Hiba történt a fájl írása során: " + e.getMessage());
        }
    }
    
}

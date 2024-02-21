/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlva 2024.02.21, Németh Ottó
 */

public class Koltseg {
   Double szallitas;
   Double uzlet;
   Double javitas;


  public Koltseg(String szallitas, String uzlet, String javitas) {
  this.szallitas = Double.parseDouble(szallitas);
  this.uzlet = Double.parseDouble(uzlet);
  this.javitas = Double.parseDouble(javitas);
  }
    
}

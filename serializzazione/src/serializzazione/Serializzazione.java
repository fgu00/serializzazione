/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        studente a[]=new studente[3];
        
        try {
            FileOutputStream FO=new FileOutputStream("test.ser");
            ObjectOutputStream OS=new ObjectOutputStream(FO);
//            OS.writeObject(9);
//          OS.writeObject("cioa");
//           OS.writeObject(0.879);
//           float m= 23;
            a[0]=new studente("diedo","lillo",0);
            a[1]=new studente("gillo","villo",1);
            a[2]=new studente("ago","stilennki",2);
           OS.writeObject(a);
//            OS.writeObject(false);
//            OS.writeObject('k');
            OS.flush();
            OS.close();
            FO.close();
            FileInputStream FI=new FileInputStream("test.ser");
            ObjectInputStream IS=new ObjectInputStream(FI); 
            studente v1[]=(studente[]) IS.readObject();
            for (int i = 0; i < v1.length; i++) {
              System.out.println("v1--> "+v1[i].toString());  
            }
//            System.out.println("v1--> "+v1.toString());
//            String v2=(String)IS.readObject();
//            System.out.println(v2);
//            double v3=(double)IS.readObject();
//            System.out.println(v3);
              studenti_creazione sc=new studenti_creazione();
              Thread x=new Thread(sc);
              x.start();
        } catch (FileNotFoundException ex) {
            System.out.println("impossibile trovare il file");
        } catch (IOException ex) {
            System.out.println("hai rotto java");
      } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

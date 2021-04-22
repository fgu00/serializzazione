/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author russo.salvatore
 */
public class studenti_creazione implements Runnable{
    ArrayList<studente>a=new ArrayList<studente>();
    String[]n=new String[5];
    String[]c=new String[5];

    public studenti_creazione() {
        n[0]="gigi";
        n[1]="giorgio";
        n[2]="giafausto";
        n[3]="giacomo";
        n[4]="giovanni";
        c[0]="crespi";
        c[1]="parra";
        c[2]="guissani";
        c[3]="siliprandi";
        c[4]="fumagalli";
    }

    @Override
    public void run() {
        while(true){
            a.add(new studente(this.nome(),this.cognome(),this.id()))  ;
            System.out.println(a.get(a.size()-1));
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(studenti_creazione.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public int id(){
        int s=(int) (Math.random()*30)+1;
        return s;
    }
    public String nome(){
        return n[(int)(Math.random()*5)];   
    }
     public String cognome(){
        return c[(int)(Math.random()*5)];   
    }
     
}

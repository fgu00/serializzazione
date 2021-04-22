/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author russo.salvatore
 */
public class studente implements Serializable{
    private String nome;
    private String cognome;
    private int registro;

    public studente(String nome, String cognome, int registro) {
        this.nome = nome;
        this.cognome = cognome;
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "studente{" + "nome= " + nome + ", cognome= " + cognome + ", registro= " + registro + '}';
    }
    
}

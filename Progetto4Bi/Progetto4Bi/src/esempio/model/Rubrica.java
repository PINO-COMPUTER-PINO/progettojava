/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio.model;

import java.util.ArrayList;

/**
 *
 * @author depietro
 */
public class Rubrica {
    
    private ArrayList<Persona> elenco;

    public Rubrica() {
        elenco=new ArrayList<Persona>();
        
    }
    public void aggiungiPersona(String nome, String cognome ){
        Persona p=new Persona(nome,cognome);
        aggiungiPersona(p);
        
    }
    
    
    public void aggiungiPersona(Persona p){
        elenco.add(p);
        
    }
    
    public Persona cercaPersona(String cognome){
        for (int i=0;i<elenco.size();i++){
            if (elenco.get(i).getCognome().equals(cognome))
                return elenco.get(i);
        }
        return null;
    }
    
    
    
}

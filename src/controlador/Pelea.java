/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Personaje;

/**
 *
 * @author LinaCostanza
 */
public class Pelea {
    
    
    Personaje lobo;
    Personaje medusa;
    Personaje escorpion;
   
    Personaje monstruo;

    public Pelea(Personaje lobo, Personaje medusa, Personaje escorpion, Personaje monstruo) {
        this.lobo = lobo;
        this.medusa = medusa;
        this.escorpion = escorpion;
        this.monstruo = monstruo;
    }
    
   
    
    public String atacar1(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random()*3)+1);
        //Decidir el mas rapido
        if (lobo.getVelocidad()> monstruo.getVelocidad()) {
            atacante = lobo;
            defensor = monstruo;
            
        } else {
            atacante = monstruo;
            defensor = lobo;
            mispj = true;
        }
        
        
        int damage = (10 + atacante.getAtaque()- defensor.getDefensa());
                damage = damage > 0 ? damage : 1;
                defensor.setVida(damage);
        
        
        
        return resulado;
    }
    public String atacar2(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random()*3)+1);
        //Decidir el mas rapido
        if (medusa.getVelocidad()> monstruo.getVelocidad()) {
            atacante = medusa;
            defensor = monstruo;
            
        } else {
            atacante = monstruo;
            defensor = medusa;
            mispj = true;
        }
        
        
        int damage = (10 + atacante.getAtaque()- defensor.getDefensa());
                damage = damage > 0 ? damage : 1;
                defensor.setVida(damage);
        
        
        
        return resulado;
    }
    public String atacar3(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random()*3)+1);
        //Decidir el mas rapido
        if (escorpion.getVelocidad()> monstruo.getVelocidad()) {
            atacante = escorpion;
            defensor = monstruo;
            
        } else {
            atacante = monstruo;
            defensor = escorpion;
            mispj = true;
        }
        
        
        int damage = (10 + atacante.getAtaque()- defensor.getDefensa());
                damage = damage > 0 ? damage : 1;
                defensor.setVida(damage);
        
        
        
        return resulado;
    }


}

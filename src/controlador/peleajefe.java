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
public class peleajefe {
    Personaje lobo;
    Personaje medusa;
    Personaje escorpion;
   
    Personaje Boss;

    public peleajefe(Personaje lobo, Personaje medusa, Personaje escorpion, Personaje Boss) {
        this.lobo = lobo;
        this.medusa = medusa;
        this.escorpion = escorpion;
        this.Boss = Boss;
    }
    
   
    
    public String atacar1(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random()*3)+1);
        //Decidir el mas rapido
        if (lobo.getVelocidad()> Boss.getVelocidad()) {
            atacante = lobo;
            defensor = Boss;
            
        } else {
            atacante = Boss;
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
        if (medusa.getVelocidad()> Boss.getVelocidad()) {
            atacante = medusa;
            defensor = Boss;
            
        } else {
            atacante = Boss;
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
        if (escorpion.getVelocidad()> Boss.getVelocidad()) {
            atacante = escorpion;
            defensor = Boss;
            
        } else {
            atacante = Boss;
            defensor = escorpion;
            mispj = true;
        }
        
        
        int damage = (10 + atacante.getAtaque()- defensor.getDefensa());
                damage = damage > 0 ? damage : 1;
                defensor.setVida(damage);
        
        
        
        return resulado;
    }

}

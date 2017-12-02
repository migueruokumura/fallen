/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelo.Personaje;

 /**
    *Este clase se usa para iniciar la pelea contra algun monstruo
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
  
 
public class Pelea {
    
     /**
    *Este constructor se usa para agregar nuevas personajes de la clase Personaje
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
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
    
   
     /**
    *Este metodo se usa para definir el ataque del personaje Lobo contra el monstruo
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
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
     /**
    *Este metodo se usa para definir el ataque del personaje Medusa contra el monstruo
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
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
     /**
    *Este metodo se usa para definir el ataque del personaje Escorpion contra el monstruo
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
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

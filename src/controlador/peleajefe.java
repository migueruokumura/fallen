/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Personaje;

/**
 * Este Clase se usa para iniciar la batalla contra el jefe
 *
 * @author Julian Amaya
 * @author Miguel Urdaneta
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

    /**
     * Este metodo se usa para definir el ataque del personaje Lobo contra el
     * monstruo
     *
     * @author Julian Amaya
     * @author Miguel Urdaneta
     */
    public String atacar1(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (lobo.getVelocidad() > Boss.getVelocidad()) {
            atacante = lobo;
            defensor = Boss;

        } else {
            atacante = Boss;
            defensor = lobo;
            mispj = true;
        }

        int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
        damage = damage > 0 ? damage : 1;
        defensor.setVida(damage);

        return resulado;
    }

    /**
     * Este metodo se usa para definir el ataque del personaje Medusa contra el
     * monstruo
     *
     * @author Julian Amaya
     * @author Miguel Urdaneta
     */
    public String atacar2(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (medusa.getVelocidad() > Boss.getVelocidad()) {
            atacante = medusa;
            defensor = Boss;

        } else {
            atacante = Boss;
            defensor = medusa;
            mispj = true;
        }

        int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
        damage = damage > 0 ? damage : 1;
        defensor.setVida(damage);

        return resulado;
    }

    /**
     * Este metodo se usa para definir el ataque del personaje Escorpion contra
     * el monstruo
     *
     * @author Julian Amaya
     * @author Miguel Urdaneta
     */
    public String atacar3(int seleccion) {
        String resulado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (escorpion.getVelocidad() > Boss.getVelocidad()) {
            atacante = escorpion;
            defensor = Boss;

        } else {
            atacante = Boss;
            defensor = escorpion;
            mispj = true;
        }

        int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
        damage = damage > 0 ? damage : 1;
        defensor.setVida(damage);

        return resulado;
    }

    private String ataqueJefe(Personaje atacante, Personaje defensor, int selecc) {
        String resultado = "";
        switch (selecc) {
            case 1:
                int dano = (10 + atacante.getAtaque() - defensor.getDefensa());
                dano = dano > 0 ? dano : 1;
                defensor.setVida(dano);
                resultado = atacante.getNombre() + " ataco a " + defensor.getNombre()
                        + " tomo " + dano + " puntos de daño";
                break;
            default:
                resultado = "Ataque no soportado";
        }
        return resultado;

    }
}

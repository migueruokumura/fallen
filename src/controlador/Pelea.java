/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Random;
import modelo.Personaje;

/**
 * Este clase se usa para iniciar la pelea contra algun monstruo
 *
 * @author Julian Amaya
 * @author Miguel Urdaneta
 */
public class Pelea {

    /**
     * Este constructor se usa para agregar nuevas personajes de la clase
     * Personaje
     *
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
     * Este metodo se usa para definir el ataque del personaje Lobo contra el
     * monstruo
     *
     * @author Julian Amaya
     * @author Miguel Urdaneta
     * @param seleccion decide quien va a atacar
     * @return daño que recibe el defensor
     */
    public String atacar1(int seleccion) {
        String resultado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (lobo.getVelocidad() > monstruo.getVelocidad()) {
            atacante = lobo;
            defensor = monstruo;

        } else {
            atacante = monstruo;
            defensor = lobo;
            mispj = true;
        }

        int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
        damage = damage > 0 ? damage : 1000;
        defensor.setVida(damage);
        resultado = atacante.getNombre() + " ataco " + defensor.getNombre()
                + " tomo " + damage + " puntos de daño";

        return resultado;
    }

    /**
     * Este metodo se usa para definir el ataque del personaje Medusa contra el
     * monstruo
     *
     * @author Julian Amaya
     * @author Miguel Urdaneta
     * @param seleccion selecciona quien atacara
     * @return daño dirigido al defensor
     */
    public String atacar2(int seleccion) {
        String resultado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (medusa.getVelocidad() > monstruo.getVelocidad()) {
            atacante = medusa;
            defensor = monstruo;

        } else {
            atacante = monstruo;
            defensor = medusa;
            mispj = true;

        }
        if (defensor.getVida() > 0) {
            resultado += ataqueMonstruo(atacante, defensor, !mispj ? seleccion : seleccionCom);
            int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
            damage = damage > 0 ? damage : 100;
            defensor.setVida(damage);

            resultado = atacante.getNombre() + " atacó a " + defensor.getNombre()
                    + " tomo " + damage + " puntos de daño";

        }

        return resultado;

    }

    /**
     * Este metodo se usa para definir el ataque del personaje Escorpion contra
     * el monstruo
     *
     * @author Julian Amaya
     * @author Miguel Urdaneta
     * @param seleccion selecciona el personaje que va a atacar
     * @return daño dirigido al defensor
     */
    public String atacar3(int seleccion) {
        String resultado = "";
        Personaje atacante, defensor;
        boolean mispj = false;
        int seleccionCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (escorpion.getVelocidad() > monstruo.getVelocidad()) {
            atacante = escorpion;
            defensor = monstruo;

        } else {
            atacante = monstruo;
            defensor = escorpion;
            mispj = true;
        }

        int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
        damage = damage > 0 ? damage : 100;
        defensor.setVida(damage);

        resultado = atacante.getNombre() + " ataco " + defensor.getNombre()
                + " tomo " + damage + " puntos de daño";

        return resultado;
    }

    /**
     *
     * @param atacante personaje que ataca
     * @param defensor personaje recibe el dañodel atacante
     * @param selecc decide quien ataca
     * @return daño dirigido al defensor
     */
    private String ataqueMonstruo(Personaje atacante, int selecc) {
        String resultado = "";

        boolean mispj = false;
        int seleccCom = (int) ((Math.random() * 3) + 1);
        //Decidir el mas rapido
        if (monstruo.getVelocidad()) {
            atacante = monstruo;
            
            mispj = true;
            Random def = new Random(2)
            switch (def) {
                case 1:
                     int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
            damage = damage > 0 ? damage : 1000;
            defensor.setVida(damage);
            resultado = lobo.getNombre() + " ataco " + defensor.getNombre()
                    + " tomo " + damage + " puntos de daño";

            return resultado;
                    break;
                case 2:
                     int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
            damage = damage > 0 ? damage : 1000;
            defensor.setVida(damage);
            resultado = medusa.getNombre() + " ataco " + defensor.getNombre()
                    + " tomo " + damage + " puntos de daño";

            return resultado;
                    break;
                case 3:
                     int damage = (10 + atacante.getAtaque() - defensor.getDefensa());
            damage = damage > 0 ? damage : 1000;
            defensor.setVida(damage);
            resultado = escorpion.getNombre() + " ataco " + defensor.getNombre()
                    + " tomo " + damage + " puntos de daño";
            break;

            return resultado;
                   
            
                         
        }
       
        }

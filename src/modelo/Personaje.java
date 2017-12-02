package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /**
    *Este clase se usa para crear los personajes
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
public class Personaje {
    private int ataque, defensa, vida, velocidad,daño;
    private String Profesion;
    private String Nombre;
    
     /**
    *Este constructor le da a los personajes creados las estadisticas del personaje
    * @param ataque genera el ataque
    * @param defensa genera la defensa
    * @param vida genera la vida
    * @param velocidad genera la velocidad
    * @param Profesion genera la profesion
    * @param Nombre genera el nombre
    * @param Daño daño que recive un personaje al ser atacado 
    * @author Julian Amaya 
    * @author Miguel Urdaneta
    */
    public Personaje(int ataque, int defensa, int vida, int velocidad, String Profesion, String Nombre) {
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.velocidad = velocidad;
        this.Profesion = Profesion;
        this.Nombre = Nombre;
    }

    /**
     *
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the Profesion
     */
    public String getProfesion() {
        return Profesion;
    }

    /**
     * @param Profesion the Profesion to set
     */
    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the daño
     */
    public int getDaño() {
        return daño;
    }

    /**
     * @param daño the daño to set
     */
    public void setDaño(int daño) {
        this.daño -= vida;
    }

 
}

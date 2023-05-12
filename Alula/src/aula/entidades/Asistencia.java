/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.entidades;

/**
 *
 * @author Jomayra Larico
 */
public class Asistencia {
    
    private int fecha;
    private int hora;
    private Clase clase;
    private int puntuales;
    private int faltas;

    public Asistencia(int fecha, int hora, Clase clase) {
        this.fecha = fecha;
        this.hora = hora;
        this.clase = clase;
    }
    
    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the clase
     */
    public Clase getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(Clase clase) {
        this.clase = clase;
    }

    /**
     * @return the puntuales
     */
    public int getPuntuales() {
        return puntuales;
    }

    /**
     * @param puntuales the puntuales to set
     */
    public void setPuntuales(int puntuales) {
        this.puntuales = puntuales;
    }

    /**
     * @return the faltas
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * @param faltas the faltas to set
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    public String mostrarAsistencia(){
        return "Clase " + this.clase.getTurno() + " | " +
            this.fecha + this.hora;
    }
}

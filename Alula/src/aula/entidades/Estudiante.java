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
public class Estudiante {
    
    private String dni;
    private String nombreCompleto;
    private String telefono;
    private int sexoBiologico;
    public final static int masculino = 0;
    public final static int femenino = 1;
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sexoBiologico
     */
    public int getSexoBiologico() {
        return sexoBiologico;
    }

    /**
     * @param sexoBiologico the sexoBiologico to set
     */
    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    
    public String mostrarDatos(){
        return this.nombreCompleto + " | DNI: " + this.dni;
    }
}

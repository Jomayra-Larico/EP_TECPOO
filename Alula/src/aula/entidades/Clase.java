/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.entidades;

import java.util.List;

/**
 *
 * @author Jomayra Larico
 */
public class Clase {
    
    private String codigo;
    private String turno;
    private String curso;
    private List<Estudiante> estudinantes;
    private List<Asistencia> asistencias;

    public Clase(String codigo, String turno, List<Estudiante> estudinantes) {
        this.codigo = codigo;
        this.turno = turno;
        turnoCurso(turno);
        this.estudinantes = estudinantes;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void turnoCurso(String truno){
        switch(turno){
            case "Mañana": this.curso = "Trigonometría"; break;
            case "Tarde": this.curso = "Geometría"; break;
            case "Noche": this.curso = "Álgebra"; break;
        }
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the estudinantes
     */
    public List<Estudiante> getEstudinantes() {
        return estudinantes;
    }

    /**
     * @param estudinantes the estudinantes to set
     */
    public void setEstudinantes(List<Estudiante> estudinantes) {
        this.estudinantes = estudinantes;
    }

    /**
     * @return the asistencias
     */
    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    /**
     * @param asistencias the asistencias to set
     */
    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
    
    public String mostrarDatos(){
        return "Clase " + this.turno + " | codigo: " + this.codigo;
    }
    
}

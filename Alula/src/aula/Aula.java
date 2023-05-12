/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import aula.entidades.Asistencia;
import aula.entidades.Clase;
import aula.entidades.Estudiante;
import aula.pantallas.JFrameAula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jomayra Larico
 */
public class Aula {
    
    public static List<Clase> clasesEnElSistema;
    public static List<Estudiante> estudiantesEnElSistema;
    public static List<Asistencia> asistenciasEnElSistema;
    
    public static List<String> horasDeHorario = new ArrayList<>();
    public static List<String> fechasDeHorario = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clasesEnElSistema  = new ArrayList<>();
        estudiantesEnElSistema  = new ArrayList<>();
        asistenciasEnElSistema   = new ArrayList<>();
        
        Clase claseMnn = new Clase("001","Mañana",estudiantesEnElSistema);
        Clase claseTrd = new Clase("002","Tarde",estudiantesEnElSistema);
        Clase claseNch = new Clase("003","Noche",estudiantesEnElSistema);
        clasesEnElSistema.add(claseMnn);
        clasesEnElSistema.add(claseTrd);
        clasesEnElSistema.add(claseNch);
        
        horasDeHorario.add("07:30am");
        horasDeHorario.add("01:00pm");
        horasDeHorario.add("07:30pm");
        
        fechasDeHorario.add("12/05/2023");
        fechasDeHorario.add("13/05/2023");
        fechasDeHorario.add("14/05/2023");
        fechasDeHorario.add("15/05/2023");
        fechasDeHorario.add("16/05/2023");
        fechasDeHorario.add("17/05/2023");
        fechasDeHorario.add("18/05/2023");
        fechasDeHorario.add("19/05/2023");
        fechasDeHorario.add("20/05/2023");
        
        JFrameAula framePrincipal = new JFrameAula();
        framePrincipal.setLocationRelativeTo(null);
        framePrincipal.setVisible(true);
    }
    
}

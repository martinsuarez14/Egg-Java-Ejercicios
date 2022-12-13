/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Usuario
 */
public class Simulador {

    public ArrayList generarListaAlumnos() {

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();

        nombres.add("Martin");
        nombres.add("Fernando");
        nombres.add("Diana");
        nombres.add("Agustina");
        nombres.add("Jorge");
        nombres.add("Cristian");
        nombres.add("Milena");
        nombres.add("Mariana");
        nombres.add("Blas");
        nombres.add("Alejandro");

        apellidos.add(" Suarez");
        apellidos.add(" Maratea");
        apellidos.add(" Coman");
        apellidos.add(" Villa");
        apellidos.add(" Ojeda");
        apellidos.add(" Zalazar");
        apellidos.add(" Astier");
        apellidos.add(" Zilli");
        apellidos.add(" Bandeo");
        apellidos.add(" Leguiza");

        ArrayList<String> alumnos = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int al1 = (int) (Math.random() * 9);
            int al2 = (int) (Math.random() * 9);
            String nombre = nombres.get(al1) + apellidos.get(al2);
            alumnos.add(nombre);
        }
        return alumnos;
    }

    public ArrayList generarListaDNIs() {

        ArrayList<Integer> listaDNIs = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            int aleatorio = (int) (Math.random() * (50000000 - 30000000) + 30000000);

            listaDNIs.add(aleatorio);
        }
        return listaDNIs;
    }

    public ArrayList generarAlumnos(ArrayList<String> alumnos, ArrayList<Integer> dni) {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            Alumno a1 = new Alumno();

            int al1 = (int) (Math.random() * 9);
            int al2 = (int) (Math.random() * 9);

            String nombre = alumnos.get(al1) + alumnos.get(al2);
            a1.setNombreCompleto(nombre);

            if (!dni.contains(dni.get(al2))) {
                a1.setDni(dni.get(al2));
            }
            
            listaAlumnos.add(a1);
        }

        return listaAlumnos;
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        
        System.out.println("*** Lista de Alumnos ***");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
        System.out.println("");
    }

    public void votacion(ArrayList<Alumno> alumnos){
        
        HashSet<Voto> alumnosQueVotaron = new HashSet<>();
        
        
        for (Alumno alumno : alumnos) {
            
            for (int i = 0; i < 3; i++) {
                int aleatorio = (int) (Math.random() * 19);
                alumnos.get(aleatorio).setCantidadDeVotos(alumnos.get(aleatorio).getCantidadDeVotos() + 1);
            }
            
            
            
            
            
        }
        
        
    }
    
}

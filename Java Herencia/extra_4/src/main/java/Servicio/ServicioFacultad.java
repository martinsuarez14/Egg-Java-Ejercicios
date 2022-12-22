/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import Enumeraciones.Departamento;
import Enumeraciones.EstadoCivil;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioFacultad {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Persona> personas = new ArrayList<>();

    public void cargarPersonas() {

        Persona p1 = new Estudiante("Arquitectura", "Ted", "Mosby", 30845124, EstadoCivil.SOLTERO);
        personas.add(p1);
        Persona p2 = new Estudiante("Medicina", "Robin", "Sckerbatsky", 24512485, EstadoCivil.DIVORCIADO);
        personas.add(p2);
        Persona p3 = new Profesor(Departamento.CS_SOCIALES, 2018, 7, "Edison", "Edison", 20845752, EstadoCivil.CASADO);
        personas.add(p3);
        Persona p4 = new Profesor(Departamento.MATEMATICA, 2019, 6, "Gabriela", "Gómez", 12545421, EstadoCivil.VIUDO);
        personas.add(p4);
        Persona p5 = new PersonalServicio("Cocina", 2022, 4, "Pedro", "picapiedras", 30144215, EstadoCivil.SOLTERO);
        personas.add(p5);
        Persona p6 = new PersonalServicio("Baños", 2020, 4, "Vilma", "Picapiedras", 10145268, EstadoCivil.CONCUBINATO);
        personas.add(p6);

    }

    public void menu() {

        boolean flagMenu = true;

        while (flagMenu == true) {

            System.out.println("** MENÚ REVISAR PERSONAL **\n"
                    + "1. Cambiar Estado Civil\n"
                    + "2. Reasignar Despacho\n"
                    + "3. Matricular Estudiante\n"
                    + "4. Cambiar Departamento a un Docente\n"
                    + "5. Traslado de sección a Personal de Servicio\n"
                    + "6. Imprimir la información de todas las personas\n"
                    + "7. Salir\n"
                    + "Seleccione una opción.");

            int opcionMenu = leer.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese el DNI de la persona: ");
                    int dniEstadoCivil = leer.nextInt();
                    for (Persona aux : personas) {
                        if (aux.getDni() == dniEstadoCivil) {
                            aux.cambiarEstadoCivil();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el DNI de la persona: ");
                    int dniDespacho = leer.nextInt();
                    for (Persona aux : personas) {
                        if (aux.getDni() == dniDespacho) {
                            ((Empleado) aux).cambiarDespacho();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el DNI de la persona: ");
                    int dniMatricula = leer.nextInt();
                    for (Persona aux : personas) {
                        if (aux.getDni() == dniMatricula) {
                            ((Estudiante) aux).nuevaMatriculacion();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el DNI de la persona: ");
                    int dniCambiarDepartamento = leer.nextInt();
                    for (Persona aux : personas) {
                        if (aux.getDni() == dniCambiarDepartamento) {
                            ((Profesor) aux).cambiarDepartamento();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el DNI de la persona: ");
                    int dniCambiarSeccion = leer.nextInt();
                    for (Persona aux : personas) {
                        if (aux.getDni() == dniCambiarSeccion) {
                            ((PersonalServicio) aux).cambiarSeccion();
                        }
                    }
                    break;
                case 6:
                    for (Persona aux : personas) {
                        System.out.println(aux);
                    }
                    break;
                case 7:
                    flagMenu = false;
                    System.out.println("Hasta Pronto.");
                    break;
                default:
                    System.out.println("Opción errónea.");
            }
        }
    }
}

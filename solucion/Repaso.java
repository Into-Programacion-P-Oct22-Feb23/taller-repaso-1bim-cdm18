/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author SALA I
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String mensaje = "";
        int numero_empleados = 0;
        int cedula;
        int horas_matutinas;
        int horas_nocturnas;
        double cuotahora_mat = 10;
        double cuotahora_noct = 15;
        double pagoDia;
        double pagoNoche;
        double adicional = 0;
        double sueldo;
        boolean bandera = true;
        String opcion;
        double seguro;
        double subtotal;
        String ciudad;
        int contador = 0;

        while (bandera) {

            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la ciudad de su empresa");
            ciudad = entrada.nextLine();

            System.out.println("Ingrese su cedula");
            cedula = entrada.nextInt();

            System.out.println("Ingrese las horas matutinas trabajadas");
            horas_matutinas = entrada.nextInt();

            System.out.println("Ingrese las horas nocturnas trabajadas");
            horas_nocturnas = entrada.nextInt();
            entrada.nextLine();
            pagoDia = cuotahora_mat * horas_matutinas;
            
            if (horas_nocturnas >= 10) {
                adicional = cuotahora_noct * 0.10;
            }
            
            cuotahora_noct = cuotahora_noct + adicional;
            pagoNoche = cuotahora_noct * horas_nocturnas;
            subtotal = pagoDia + pagoNoche;
            seguro = (subtotal * 18)/100;
            sueldo = subtotal - seguro;

            mensaje = mensaje + "Rol del trabajador de nombre " + nombre
                    + " y cedula " + cedula + "." + "\n" + "\t"
                    + "Horas matutina trabajadas: " + horas_matutinas + "."
                    + "\n\t" + "Horas nocturnas trabajadas: " + horas_nocturnas
                    + "." + "\n\t" + "Subtotal " + "$" + subtotal + "\n\t" +
                    "Seguro social " + "$" + seguro + "\n\t" + 
                    "Total a cancelar " + "$" + sueldo
                    + "." + "\n\n";
            contador = contador + 1;
            
            System.out.println("Desea seguir ingresando datos, si no es asi presione S");
            opcion = entrada.nextLine();
            

            if ((opcion.equals ("S")) || (opcion.equals ("s"))) {
                bandera = false;
            }
        }
        System.out.println("Nomina de trabajadores" + "\n\n" + mensaje + 
                "Numero de empleados " + contador);

    }
}
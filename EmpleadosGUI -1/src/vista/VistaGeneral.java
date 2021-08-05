
package vista;

import java.util.Scanner;

/**
 *
 * @author Erika
 */
public class VistaGeneral {
    private Scanner teclado;
    private VistaEmpresa vistaEmpresa;
    
    public VistaGeneral(){
        vistaEmpresa = new VistaEmpresa();
        teclado = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Empresas");
            System.out.println("2. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaEmpresa.menu(); break;
            }
        } while (opcion<5);
    }
    
}

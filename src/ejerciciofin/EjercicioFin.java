/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofin;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class EjercicioFin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto;
        do{
            Scanner ent = new Scanner(System.in);
            System.out.println("Introduzca un texto: ");
            texto=ent.nextLine();
            
        }while(texto.equals("FIN")==false);
    }
    
}

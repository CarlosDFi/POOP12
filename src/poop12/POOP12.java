/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author alumno
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new HiloT ("PrimerHilo").start();
        HiloT hilo2 =new HiloT("SegundoHilo");
        hilo2.start();
        new Thread (new HiloR(),"Tercer hilo").start();
        new Thread (new HiloR(),"Cuarto hilo").start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion"+i+" del " +"hilo main");
            
        }
        System.out.println("Hilo Main terminado");
    }
    
}

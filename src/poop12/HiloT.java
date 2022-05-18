package poop12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class HiloT extends Thread{

    public HiloT(String name) {
        super(name);
    }
public void run(){
    for( int i = 0; i < 5; i++){
        System.out.println("iteracion " +i+"del hilo "+getName());
    }
    System.out.println("Termina el hilo "+getName());
}   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       Scanner input=new Scanner(System.in);
      System.out.print("Ingrese un numero: ");
     int num=input.nextInt();

       int factorial=1;
      for (int i = 1; i <num+1; i++) {
        factorial*=i;
}
      System.out.println("");
     System.out.println("Factorial de "+num+" es: "+factorial);
    }
    
}

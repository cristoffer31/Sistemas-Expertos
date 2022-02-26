/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciadefibonacci_se;

import java.util.Scanner;


public class SecuenciaDeFibonacci_SE {

    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el limite de la serie fibonacci que desee: ");
        long limite = sc.nextLong();
        
        System.out.println("los primeros " + limite + " de la serie Fibonacci son: ");
        seriefibonacci(limite, 0, 1);
    }
    
    public static void seriefibonacci(long limite, long anterior, long actual){
        if(limite > 0){
            System.out.println(actual);
            seriefibonacci(limite - 1, actual, anterior + actual);
        }
    }
    }
    


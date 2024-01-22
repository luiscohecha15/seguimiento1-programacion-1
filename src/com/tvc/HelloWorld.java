package com.tvc;
/*
Luis alfonso cohecha suarez y Daniel Felipe Manjarres Clavijo
*/
public class HelloWorld {
    public static void main(String[] arg) {
        int i = 0;
        System.out.println("Imprimiendo números impares:");
        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue; // Saltar a la siguiente iteración si es un número par
            }
            System.out.print(i + " ");
        }
    }
}

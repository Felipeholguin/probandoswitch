package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double temperaturaAmbiente;

        Scanner teclado=new Scanner(System.in);

        //Proceso
        System.out.println("cual es la temperatura ambiente");
        temperaturaAmbiente=teclado.nextDouble();

        if (temperaturaAmbiente== 20.0){
            temperaturaAmbiente= 25.0;
        }else if (temperaturaAmbiente== 30.0){
            temperaturaAmbiente= 20.0;
        } else if (temperaturaAmbiente== 40.0){
            temperaturaAmbiente= 20.0;
        }else{
            System.out.println("señor usuario ingrese temperatura"+temperaturaAmbiente);
            temperaturaAmbiente= teclado.nextDouble();
        }
        System.out.println("Apreciado usuario su temperatura cambio a"+temperaturaAmbiente);

    }
}
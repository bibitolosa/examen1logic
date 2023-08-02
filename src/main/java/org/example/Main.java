package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DECLARANDO VARIABLES

        String nombreCliente;
        String apellidoCliente;
        Integer cedula;
        Integer edad;
        String ciudad;
        Integer valorBoleta=450000;
        Integer numeroDeBoletas;

        System.out.println("** hola bienvenido a tu boleta**");

        Scanner teclado=new Scanner(System.in);

        System.out.print("señor usuario por favor digite su nombre ");
        nombreCliente=teclado. nextLine();



        System.out.print("señor usuario por favor digite su apellido");
        apellidoCliente=teclado.nextLine();

        System.out.println("señor usuario por favor digite su edad");
        edad=teclado.nextInt();

        System.out.print("señor usuario digite su cedula");
        cedula=teclado.nextInt();

        System.out.println("señor usuario por favor digite la ciudad donde vive");
        ciudad=teclado.nextLine();

        System.out.println("por favor digite cuantas boletas desea comprar");
        numeroDeBoletas= teclado.nextInt();

        Integer totalPagarBoletas=numeroDeBoletas*valorBoleta;

        if (edad<18){
            System.out.println("señor usuario, usted debe ser mayor de 18 años para asistir al evento");
        }  else if (numeroDeBoletas>4){
            System.out.print("señor usuario, el numero de boletas que ingreso no esta permitido. (1-4)");

        }else{
            System.out.print("señor usuario, gracias por su compra el valor a pagar por las 4 boletas es:" + totalPagarBoletas);
        }

    }
}
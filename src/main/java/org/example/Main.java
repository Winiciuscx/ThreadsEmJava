package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequencia de caracteres: ");
        String entrada = scanner.nextLine();
        char [] array = entrada.toCharArray();

        DetectorLetra detectorLetra = new DetectorLetra(array);
        DetectorNumeros detectorNumeros = new DetectorNumeros(array);
        detectorNumeros.start();
        detectorLetra.start();




    }
}
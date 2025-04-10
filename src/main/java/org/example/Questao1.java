package org.example;

public class Questao1{
    public static void main(String[] args) {
        char[] values = {'A', '3', 'G', '7', 'B', '1', 'E', '9', 'C', '4', 'H', '6', 'D', '0', 'F', '2'};
//        char[] letras = new char[8];
//        char[] numeros = new char[8];

        StringBuilder resLetras = new StringBuilder();
        StringBuilder resNumeros = new StringBuilder();


        new Thread(() -> {
            for(int i=0; i < values.length; i++) {
                if (Character.isLetter(values[i])) {
                    resLetras.append(values[i]);;
                }
            }
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Letras: " + resLetras);
        }).start();

        new Thread(() -> {
            for(int i=0; i < values.length; i++) {
                if (Character.isDigit(values[i])) {
                    resNumeros.append(values[i]);
                }
            }

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Números: " + resNumeros);

        }).start();
    }
}
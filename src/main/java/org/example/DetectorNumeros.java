package org.example;

public class DetectorNumeros extends Thread {
    private char[] array;


    public DetectorNumeros(char[] array){
        this.array = array;
    }
    @Override
    public void run(){
        StringBuilder acumulador= new StringBuilder();
        try {
            for (char numero : array){
                if (Character.isDigit(numero)) {
                    acumulador.append(numero);
                }else if (acumulador.length() == 0) {
                    sleep(1000);

                } else {
                    System.out.println("Sequência de Numeros: " + acumulador.toString());
                    acumulador.setLength(0);
                    sleep(500);
                }
            }
            if (acumulador.length() > 0) {
                System.out.println("Sequência de Numeros: " + acumulador.toString());
                sleep(500);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

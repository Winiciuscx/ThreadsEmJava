package org.example;

public class DetectorLetra extends Thread {
    private char[] array;

    public DetectorLetra(char[] array) {
        this.array = array;
    }

@Override
    public void run() {
        StringBuilder acumulador = new StringBuilder();
        try {
            for (char letra : array) {
                if (Character.isLetter(letra)) {
                    acumulador.append(letra);
                } else if (acumulador.length() == 0) {
                    sleep(500);

                } else {
                    System.out.println("Sequência de Letras: " + acumulador.toString());
                    acumulador.setLength(0);
                    sleep(500);
                }
            }
            if (acumulador.length() > 0) {
                System.out.println("Sequência de Letras: " + acumulador.toString());
                sleep(500);
            }
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

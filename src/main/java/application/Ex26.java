package application;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam = 5;
        Integer[] vect = new Integer[tam];

        // Entrada
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Insira um valor para o vetor na posição " + i);
            vect[i] = sc.nextInt();
        }

        // Processamento
        for (int i = 0; i < vect.length - 1; i++) {
            for (int j = i + 1; j < vect.length; j++) {
                if (vect[j] < vect[i]) {
                    int aux = vect[i];
                    vect[i] = vect[j];
                    vect[j] = aux;

                }

            }

        }

        // Saida
        for (int i = 0; i < vect.length; i++) {
            System.out.println("vetor na posição " + i + " é " + vect[i]);
        }

        sc.close();
    }
}

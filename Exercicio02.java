package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Digite um numero: ");
                matriz[i][j] = sc.nextInt();

                soma = soma + matriz[i][j];
            }
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}

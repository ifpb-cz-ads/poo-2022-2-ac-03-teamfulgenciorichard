/* Implemente um programa que recebe um número de 1 a 7 e imprime o
dia da semana correspondente. */

import java.util.*;

public class BMAtividade4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um dia da semana: ");
        int diaSemana = scanner.nextInt();

        switch(diaSemana){
            case 1: System.out.print("Domingo"); break;
            case 2: System.out.print("Segunda-Feira"); break;
            case 3: System.out.print("Terça-Feira"); break;
            case 4: System.out.print("Quarta-Feira"); break;
            case 5: System.out.print("Quinta-Feira"); break;
            case 6: System.out.print("Sexta-Feira"); break;
            case 7: System.out.print("Sábado"); break;
        }
    }
}
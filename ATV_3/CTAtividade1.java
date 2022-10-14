/* Faça um programa que dada a idade de uma pessoa verifique sua classe
eleitoral:
• menor que 16 anos não pode votar;
• com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
• entre 18 e 65 anos (inclusive), votar é obrigatório. */

import java.util.*;

public class CTAtividade1{
    public static void main(String[] args){
        
        try(
            Scanner scanner = new Scanner(System.in)){
                System.out.print("Insira a idade: ");
                int idade = scanner.nextInt();
                if(idade < 16){
                    System.out.println("Não pode Votar");
                }
                else if(idade >=16 && idade<=17 || idade > 65){
                    System.out.print("Votar é facultativo");
                }
                else{
                    System.out.println("Votar é obrigatório");
                }
            }
        catch(InputMismatchException e){
            System.out.print("O valor informado não é um número!");
        }
    }
}
//Condição composta

import java.util.Scanner;

public class ResultadoEscolar {
    
    public static void main (String[]args){

        double nota = 0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 7)
        System.out.println("Você está aprovado");

        else if(nota >= 5 && nota <7)
        System.out.println("Você está de recuperação");

        else if(nota == 0)
        System.out.println("Paspalho");

        else
        System.out.println("Você foi reprovado");

        

    }


}

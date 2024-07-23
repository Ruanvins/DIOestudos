//condição Ternaria

import java.util.Scanner;

public class ResultadoEscolarTernario {
    public static void main (String []args){

        System.out.println("Bem vindo a Universidade Infatil");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado" ;
        
        System.out.println(resultado);


    }
}

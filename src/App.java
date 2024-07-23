//Condição simples

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double saldo = 630.0;
        double valorSolicitado = 28.0;

        if (valorSolicitado < saldo){
       saldo = saldo - valorSolicitado;
       System.out.println("Novo saldo: " + saldo);
    
    }else
       System.out.println("Saldo insuficiente.");


    }
}

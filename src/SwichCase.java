public class SwichCase {

    public static void main (String []args){

        System.out.println("Planos Telefônicos!");

        String plano = "M";

        switch (plano) {
            case "P":
                System.out.println("Pequeno");
                break;
        
            case "M":
                System.out.println("Médio");
                break;

            case "G":
                System.out.println("Grande");
                break;

            default:
            System.out.println("Sem plano");
                
        }


    }
    
}

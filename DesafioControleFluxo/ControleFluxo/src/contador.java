import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
         System.out.println("Digite o primeiro parametro");
         int paramentroUm = terminal.nextInt();
         System.out.println("Digite o segundo parametro");
         int paramentroDois = terminal.nextInt();


         try { 
             contar(paramentroUm, paramentroDois);
        
          } catch(ParametrosInvalidosException exception) {
             System.out.println(exception.getMessage());

        }
    }
         static void contar(int paramentroUm, int paramentroDois) throws  ParametrosInvalidosException {
             if (paramentroUm > paramentroDois) {
                 throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
             }

             int contagem = paramentroDois - paramentroUm;
             for (int i = 1; i <= contagem; i++) {
                 System.out.println("Imprimindo o número " + i);
        }
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            
            System.out.println("Digite um número");
            int numero = sc.nextInt();

            for(int i = numero ; i>=0; i--){
                System.out.println(i);
                }

                System.out.println("Fim da Contagem!");
            }
        }
}

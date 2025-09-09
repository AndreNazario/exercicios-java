import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Digite sua Primeira Nota");
            double nota1 = sc.nextDouble();

            System.out.println("Digite sua Segunda Nota");
            double nota2 = sc.nextDouble();
            
            double media = (nota1 + nota2) / 2;
            
            if(media >= 7){
                System.out.println(" Parabéns! Sua Média final foi: " +(media)+ " e Você foi Aprovado! ");
            }else{
                System.out.println(" Você foi reprovado Infelizmente, e Sua Média final foi: "  +(media)+ "");
            }
        }
        

    }
}
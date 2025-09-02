import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
    for(int i=0; i<10; i++){
        System.out.println("Digite um número");
        int numero = sc.nextInt();
    if(numero > 0){
            System.out.println("Esse número é Positivo");
    }else if(numero < 0){
            System.out.println("Esse número é Negativo");
    }else{
            System.out.println("Esse número é 0");
    }
   }
  }
 }
}
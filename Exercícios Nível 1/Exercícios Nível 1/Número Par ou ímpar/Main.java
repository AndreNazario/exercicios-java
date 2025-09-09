import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)){
         for(int i=0; i<10; i++){
        System.out.println("Loop:" + (i+1) + ": Digite um número");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("Este número é par");
        }else{
            System.out.println("Este número é impar");
        }
    }
   }
}
}
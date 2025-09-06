import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("------Calculadora------");
            System.out.println(" 1- Soma (+)");
            System.out.println(" 2- Subtração (-)");
            System.out.println(" 3- Multiplicação (x)");
            System.out.println(" 4- Divisão (/)");
            System.out.println(" 0- Sair ");
            System.out.println("-----------------------");
            System.out.println("Escolha uma opção:");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                return;
            }


            System.out.println("Digite o primeiro número:");
            double num1 = sc.nextDouble();

            System.out.println("Digite o segundo número:");
              double num2 = sc.nextDouble();
        
              double Resultado = 0;
        switch (opcao) {
        case 1:
            Resultado = num1 + num2;
                System.out.println("Resultado da Soma: " +Resultado);
                break;
        case 2:
            Resultado = num1 - num2;
                System.out.println("Resultado da Subtração: " +Resultado);
                break;
        case 3:
            Resultado = num1 * num2;
                System.out.println("Resultado da Multiplição: " +Resultado);
                break;
        case 4:
        if(num2 !=0){
            Resultado = num1 / num2;
                System.out.println("Resultado da Divisão: " +Resultado);
        }
        else{
        System.out.println("Erro: Divisão por zero não é permitida.");
        }
        break;
        default:
            System.out.println("Opção inválida. Tente novamente.");
            break;
       
    }
}
}
}
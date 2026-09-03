//Izaias Pereira da Cruz Lopes Santos

import java.util.Scanner;

public class EX4{

    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);

        System.out.print("Digite o primeiro numero:");
        int N1= Scanner.nextInt();
        System.out.print("Digite o segundo numero:");
        int N2= Scanner.nextInt();
        System.out.print("Digite o terceiro numero:");
        int N3= Scanner.nextInt();
        System.out.print("Digite o quarto numero ");
        int N4= Scanner.nextInt();

        int total = N1+N2+N3+N4;
        System.out.println("O resultado da soma de todos os numero é: "+ total);

    }

}



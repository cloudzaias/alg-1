
//Izaias Pereira da Cruz Lopes Santos

import java.util.Scanner;

public class EX3{

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite um numero:");
        int N1 = scanner.nextInt();
        
       System.out.print("Digite segundo numero:");
        int N2 = scanner.nextInt();

        int total = N1*N2;
        
        System.out.println("O produto desse numero é: "+ total);
    }
    
}

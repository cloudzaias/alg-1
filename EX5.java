
//Izaias Pereira Da Cruz lopes Santos

import java.util.Scanner;
public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        double N1= scanner.nextDouble();
        System.out.print("Digite a segunda nota:");
        double N2= scanner.nextDouble();
        System.out.print("Digite o terceira nota:");
        double N3= scanner.nextDouble();

        double nota = (N1+N2+N3)/3;

        System.err.println("Sua nota é: " + nota);

        
    }
}

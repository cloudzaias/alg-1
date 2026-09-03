//Izaias Pereira Da Cruz lopes Santos

import java.util.Scanner;
public class EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Digite um numero:");
        double N1 = scanner.nextDouble();

        double Q = Math.pow(N1,2);
        double C = Math.pow(N1,3);
        double R = Math.sqrt(N1);
        double P = Math.pow(N1,10);

        System.err.println("Seu numero ao quadrado é:"+Q);
        System.err.println("Seu numero ao cubo é:"+C);
        System.err.println("A raiz do seu numero é:"+R);
        System.err.println("Seu numero elevado a 10 é:"+P);
    }

}
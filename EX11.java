//Izaias Pereira Da Cruz lopes Santos

import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Digite o ano em que nasceu: ");
        int ano = scanner.nextInt();
        int idade = 2026 - ano;
        int futuro = 2030 - ano;

        System.out.println("Sua idade é:" + idade);
        System.out.println("Em 2030 vc tera: "+ futuro);
    

    }

}
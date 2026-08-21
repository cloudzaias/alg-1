import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastro dos 5 livros favoritos");
        System.out.println();

        
        System.out.println("Digite seu livro favorito 1");
        String livro1 = entrada.nextLine();

        System.out.println("Digite seu livro favorito 2");
        String livro2 = entrada.nextLine();

        System.out.println("Digite seu livro favorito 3");
        String livro3 = entrada.nextLine();

        System.out.println("Digite seu livro favorito 4");
        String livro4 = entrada.nextLine();

        System.out.println("Digite seu livro favorito 5");
        String livro5 = entrada.nextLine();

        System.out.println("\nSeus livros favoritos sao:");
        System.out.println("1" + livro1);
        System.out.println("1" + livro2);
        System.out.println("1" + livro3);
        System.out.println("1" + livro4);
        System.out.println("1" + livro5);

        entrada.close();


        
      
    


    }
}

import java.util.Scanner;

public class ExemploEntradaDados {

    //Criar um programa para ler e calcular a media da FIAP
    public static void main(String[] args) {
        // Criar o objeto para ler o teclado

        Scanner leitor = new Scanner(System.in);

        var nome;
        var nome1 = leitor ;

        //cp
        System.out.println("Digite a nota da cpt 1: ");
        double cp1 = leitor .nextDouble();

        System.out.println("Digite a nota da cpt 2: ");
        double cp2 = leitor .nextDouble();

        System.out.println("Digite a nota da cpt 3: ");
        double cp3 = leitor .nextDouble();

        //challenge
        double challenge;

        System.out.println("Digite a nota da sprint 1: ");
        double challenge1 = leitor.nextDouble();

        System.out.println("Digite a nota da sprint 2: ");
        double challenge2 = leitor.nextDouble();

        //gs
        double gs;
        System.out.println("Digite a nota da gs: ");
        double gsnota1 = leitor.nextDouble();

        //media
        double mediacp = ((cp1+ + cp2 + cp3)/2);
        double challengemedia = ((challenge1+challenge2)/2);

        double mediafinal = ((mediacp*0.2) + (challengemedia*0.2) + (gsnota1*0.6));

        System.out.println("Média Final: " + mediafinal);




    }




}

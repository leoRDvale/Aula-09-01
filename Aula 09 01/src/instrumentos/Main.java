package instrumentos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de violão:");
        System.out.println("classico | folk | flet | jumbo | 7cordas | 12cordas | zero | duplozero | triplozero");

        String escolha = scanner.nextLine();

        Instrumento violao = FabricaInstrumentos.getInstrumento(escolha);

        if (violao != null) {
            violao.exibirInfo();
        } else {
            System.out.println("Tipo inválido!");
        }

        scanner.close();
    }
}
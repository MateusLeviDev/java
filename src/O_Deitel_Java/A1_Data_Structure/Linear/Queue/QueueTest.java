package O_Deitel_Java.A1_Data_Structure.Linear.Queue;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("\n\nInforme o tamanho maximo da fila -> ");
        int tamanho = scn.nextInt();

        if (tamanho <= 0) {
            System.out.println("ERRO: tamanho invalido ->" + tamanho);
            return;
        }

        TADQueue fila = new TADQueue(tamanho);

        while (true) {

            System.out.println("\n\n===========================================================");
            System.out.println("                 EXERCICIO DE TAD FILA");
            System.out.println("                   - Mateus Levi");
            System.out.println("===========================================================");
            System.out.println("0 - encerrar");
            System.out.println("1 - inserir um elemento na fila");
            System.out.println("2 - remover um elemento da fila");
            System.out.println("3 - imprimir a fila");
            System.out.println("4 - informacoes gerais sobre a fila");

            System.out.println("-----------------------------------------------------------");
            System.out.print("Opcao -> ");

            int opc = scn.nextInt();

            if (opc == 0) {
                break;
            } else if (opc == 1) {
                System.out.print("Elemento a inserir -> ");
                int elem = scn.nextInt();
                System.out.println(fila.enqueue(elem));
            } else if (opc == 2) {
                Integer elem = fila.dequeue();
                if (elem == null) {
                    System.out.println("ERRO: a fila esta' vazia.");
                } else {
                    System.out.println("O valor retornado e' -> " + elem);
                }
            } else if (opc == 3) {
                System.out.print("Os elementos da fila sao -> ");
                System.out.println(fila.print());
            } else if (opc == 4) {

                System.out.println("-------------------------------------------------");
                System.out.println("       informacoes gerais sobre a fila");
                System.out.println("-------------------------------------------------");
                System.out.println("Capacidade maxima -> " + fila.capa);
                System.out.println("Tamanho (size) ----> " + fila.size());
                System.out.println("Primeiro elemento -> " + fila.peek());
                System.out.println("Ponteiro INI ------> " + fila.ini);
                System.out.println("Ponteiro FIM ------> " + fila.fim);
                System.out.println("Ultima operacao ---> " + fila.ope);

            }

        }

    }
}

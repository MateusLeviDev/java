package O_Deitel_Java.A1_Data_Structure.Linear.Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackTrianguloTeste {
    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<StackTriangulo> stack2 = new Stack<>();

        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("\n\n\n==============================================");
            System.out.println("PILHA 1 - contem numeros inteiros");
            System.out.println("PILHA 2 - contem objetos da classe Triangulo");
            System.out.println("==============================================");
            System.out.println("0 - encerrar");
            System.out.println("----- opcoes da PILHA 1 -----");
            System.out.println("1 - inserir elemento");
            System.out.println("2 - extrair elemento");
            System.out.println("3 - localizar elemento");
            System.out.println("4 - imprimir a pilha");
            System.out.println("----- opcoes da PILHA 2 -----");
            System.out.println("5 - inserir elemento");
            System.out.println("6 - extrair elemento");
            System.out.println("7 - localizar elemento");
            System.out.println("8 - imprimir a pilha");
            System.out.println("==============================================");
            System.out.println("");
            System.out.print("Opcao: ");
            int opc = scn.nextByte();

            if (opc == 0) {
                break;
            } //==================================================================
            //           OPCOES DA PILHA DE NUMEROS INTEIROS
            //
            else if (opc == 1) {  //===> push
                Scanner scn1 = new Scanner(System.in);
                System.out.print("Valor do elemento (numero int.) -> ");
                int valor1 = scn1.nextInt();
                int x = stack1.push(valor1);
                System.out.print("x = " + x);
            } else if (opc == 2) {  //===> pop
                if (stack1.empty()) {
                    System.out.println("A pilha esta' vazia");
                } else {
                    System.out.println("Elemento extraido -> " + stack1.pop());
                }
            } else if (opc == 3) {  //===> localizar

                Scanner scn3 = new Scanner(System.in);
                System.out.print("Valor a localizar -> ");
                int valor3 = scn.nextInt();
                System.out.println("Valor encontrado nas seguintes posicoes: ");
                System.out.print("===> ");
                for (int i = 0; i < stack1.size(); i++) {
                    if (stack1.get(i) == valor3) {
                        System.out.print(i + " ");
                    }
                }


                System.out.println("");
                System.out.println("Posicao pelo metodo 'search' -> " + stack1.search(valor3));

                System.out.println("\n--- Agora pelo meu método equivalente ao 'search' plus:");
                for (int i = stack1.size() - 1; i >= 0; i--) {
                    if (stack1.get(i) == valor3) {
                        System.out.print(((stack1.size() - i)) + " ");
                    }
                }

            } else if (opc == 4) {  //===> imprimir
                int qtd = stack1.size();
                System.out.println("stack1.size() -> " + qtd + " elementos na pilha.");
                for (int i = 0; i < qtd; i++) {
                    System.out.print(stack1.get(i) + " ");
                }

            } //------------------------------------------------------------------
            //==================================================================
            //            OPCOES DA PRILHA DE OBJETOS TRIANGULO
            //
            else if (opc == 5) {  //===> push

                float[] t = defineTriangulo();
                StackTriangulo tri = new StackTriangulo(t[0], t[1], t[2]);
                if (!tri.trianguloValido()) {
                    System.out.println("ERRO: triangulo invalido.");
                    continue;
                }
                stack2.push(tri);

            } else if (opc == 6) {  //===> pop
                if (stack2.empty()) {
                    System.out.println("A pilha esta' vazia");
                } else {
                    System.out.println("Elemento extraido -> " + printTriangulo(stack2.pop()));
                }
            } else if (opc == 7) {

                float[] t = defineTriangulo();
                StackTriangulo tri = new StackTriangulo(t[0], t[1], t[2]);

                int pos = stack2.search(tri);
                System.out.println("Triangulo na posicao -> " + pos);

            } else if (opc == 8) {
                int qtd = stack2.size();
                System.out.println("stack2.size() -> " + qtd);
                for (int i = 0; i < qtd; i++) {
                    System.out.print(printTriangulo(stack2.get(i)) + " == ");
                }

            }

        }

    }

    private static float[] defineTriangulo() {
        float[] tri = new float[3];
        Scanner scn = new Scanner(System.in);
        System.out.print("Lado 1 -> ");
        tri[0] = scn.nextFloat();
        System.out.print("Lado 2 -> ");
        tri[1] = scn.nextFloat();
        System.out.print("Lado 3 -> ");
        tri[2] = scn.nextFloat();
        return tri;
    }

    private static String printTriangulo(StackTriangulo t) {
        return "|" + t.getLado1() + "|" + t.getLado2() + "|" + t.getLado3() + "|";
    }
}

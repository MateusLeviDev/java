package Enums.Labs;

public class Calculator {

    enum Operacao {
        SOMAR("+") {
            @Override
            public double executarOperacao(double x, double y) {
                return x + y;
            }
        },
        SUBTRAIR("-") {
            @Override
            public double executarOperacao(double x, double y) {
                return x - y;
            }
        },
        MULTIPLICAR("*") {
            @Override
            public double executarOperacao(double x, double y) {
                return x * y;
            }
        },
        DIVIDIR("/") {
            @Override
            public double executarOperacao(double x, double y) {
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo) {
            this.simbolo = simbolo;
        }

        public abstract double executarOperacao(double x, double y);

        @Override
        public String toString() {
            return this.simbolo;
        }
    }

    public static void main(String[] args) {
        double x = 2;
        double y = 4;

        for (Operacao operacao : Operacao.values()) {
            System.out.print(x + " ");
            System.out.print(operacao.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(operacao.executarOperacao(x, y));
        }
    }
}

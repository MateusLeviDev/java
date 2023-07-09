package InheritanceAndPolymorphism;

public class Main {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.setNomeCliente("Levi");
        savingsAccount.setNumConta("212121");

        savingsAccount.depositar(200);

        realizarSaque(savingsAccount, 100);

        savingsAccount.setDiaRendimento(8);

        if (savingsAccount.calcularNovoSaldo(0.5)) {
            System.out.println("Novo rendimento: " + savingsAccount.getSaldo());
        } else {
            System.out.println("hoje não.");
        }

        System.out.println(savingsAccount.toString());
    }

    public static void realizarSaque(Account account, double valor) {
        if (account.sacar(valor)) {
            System.out.println("Efetuado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}

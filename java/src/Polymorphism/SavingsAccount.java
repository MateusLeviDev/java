package Polymorphism;

import java.util.Calendar;

public class SavingsAccount extends Account{

    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }


    public boolean calcularNovoSaldo(double taxaDeRendimento) {
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            setSaldo(getSaldo() + (getSaldo() * taxaDeRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "diaRendimento=" + diaRendimento +
                '}';
    }
}

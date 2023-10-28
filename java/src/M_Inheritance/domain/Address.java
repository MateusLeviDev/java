package M_Inheritance.domain;

public class Address {
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Address{" +
                "rua='" + rua + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}

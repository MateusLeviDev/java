package Enums;

public enum DocumentType {

    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cpf();
        }
    },
    CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.cnpj();
        }
    };

    public abstract String geraNumeroTeste();
}

package E_OOPAssociation.ClassRelationship;

import java.util.Arrays;

public class Contact {

    private String name;
    private Endereco endereco;
    private Telefone[] telefones;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", endereco=" + endereco +
                ", telefones=" + Arrays.toString(telefones) +
                '}';
    }
}

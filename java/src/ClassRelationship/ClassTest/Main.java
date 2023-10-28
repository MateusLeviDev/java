//@uthor: Levi
//        jul/23
//contact tem muitos telefone

package ClassRelationship.ClassTest;

import ClassRelationship.Contact;
import ClassRelationship.Endereco;
import ClassRelationship.Telefone;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact();
        Endereco endereco = new Endereco();
        Telefone telefone = new Telefone();
        Telefone telefone2 = new Telefone();

        contact.setName("Levi");
        contact.setEndereco(endereco); //set endereco em contact too

        endereco.setRua("Rua Olegario");
        endereco.setCidade("Rua Olegario");
        endereco.setCep("Rua Olegario");
        endereco.setComplemento("Rua Olegario");
        endereco.setEstado("Rua Olegario");

        telefone.setTipo("Celular");
        telefone.setDdd("Celular");
        telefone.setNumero("Celular");
        telefone2.setTipo("Casa");
        telefone2.setDdd("Celular");
        telefone2.setNumero("Celular");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contact.setTelefones(telefones);

        System.out.println(contact.toString());
    }
}

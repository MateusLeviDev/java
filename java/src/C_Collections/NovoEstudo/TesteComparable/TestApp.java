package C_Collections.NovoEstudo.TesteComparable;

public class TestApp {

    public static void main(String[] args) {
        Person person1 = new Person("Mateus", 24);
        Person person2 = new Person("Naruto", 32);

        System.out.println(person1.compareTo(person2));
    }
}

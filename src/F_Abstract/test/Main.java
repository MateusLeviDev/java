package F_Abstract.test;

import F_Abstract.domain.Developer;
import F_Abstract.domain.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Naruto", 4000);
        Developer developer = new Developer("Levi", 3000);
        developer.calculateBonus();
        manager.calculateBonus();
        System.out.println(manager);
        System.out.println(developer);
    }
}

package J_Generics.test;

import J_Generics.domain.Boat;
import J_Generics.domain.Car;
import J_Generics.service.RentService;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<Car> carrosDisponiveis = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> barcosDisponiveis = new ArrayList<>(List.of(new Boat("Lancha"), new Boat("Canoa")));
        RentService<Car> rentalServiceCarro = new RentService<>(carrosDisponiveis);
        Car carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("----------");

        RentService<Boat> rentalServiceBarco = new RentService<>(barcosDisponiveis);
        Boat barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}

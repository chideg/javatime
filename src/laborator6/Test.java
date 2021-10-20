package laborator6;

import java.util.ArrayList;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        Car dacia = new Car(Car.Tip.DACIA, 7685, 2015);
        Car renault = new Car(Car.Tip.RENAULT, 9625, 2018);
        Car fiat = new Car(Car.Tip.FIAT, 10750, 2020);

        Dealership otopeni = new Dealership();

        System.out.println("Initial price: " + dacia.getPret());
        System.out.println("Final price: " + otopeni.getFinalPrice(dacia) + "\n");

//        otopeni.negotiate(dacia, new Offer() {
//            @Override
//            public int getDiscount(Car car) {
//                return 600;
//            }
//        });

        System.out.println("Initial price: " + renault.getPret());
        System.out.println("Final price: " + otopeni.getFinalPrice(renault) + "\n");

        System.out.println("Initial price: " + fiat.getPret());
        System.out.println("Final price: " + otopeni.getFinalPrice(fiat) + "\n");


        //Task 5 Lambda
        System.out.println("\n-------\n");
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(dacia);
        carList.add(renault);
        carList.add(fiat);
        System.out.println(carList);
        carList.removeIf(car -> car.getPret() < 10000);
        System.out.println(carList);

    }
}

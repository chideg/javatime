package laborator6;

import java.util.Random;

public class Dealership {

    private int oferta;
    private static int AN_CURENT = 2021;

    class BrandOffer implements Offer{
        @Override
        public int getDiscount(Car car) {
            if (car.getTip() == Car.Tip.DACIA) {
                oferta = car.getPret() * 5/100;
                System.out.println("Applying Brand discount: " + oferta);
            }
            return oferta;
        }
    }

    class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            oferta = (AN_CURENT - car.getAnFabricatie())*100;
            System.out.println("Applying Dealer discount: " + oferta);
            return oferta;
        }
    }

    class SpecialOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            double random = Math.random()*300;
            oferta = (int) random;
            System.out.println("Applying Special discount: " + oferta);
            return oferta;
        }
    }

    //Task 4 gresit (fara negotiate)
    class ClientOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            Random random = new Random();
            int clientDiscount = 600;
            if (random.nextBoolean()) {
                System.out.println("Applying Client discount: " + clientDiscount);
                oferta = clientDiscount;
            }
            return oferta;
        }
    }

    public int getFinalPrice(Car car) {
        return car.getPret() - new BrandOffer().getDiscount(car) - new DealerOffer().getDiscount(car) - new SpecialOffer().getDiscount(car) - new ClientOffer().getDiscount(car);
    }

//    void negotiate(Car car, Offer offer) {
//    }


}

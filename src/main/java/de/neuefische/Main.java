package de.neuefische;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "White", new BigDecimal(30000), "2");
        CarClass carClass = new CarClass();
        Car currywurst = Car.builder()
                .brand("VW")
                .price(new BigDecimal(13000))
                .build();

        System.out.println(currywurst.brand());

        /**
         * Lombok´s Best:
         * @Data -> Beinhaltet alle Getter/Setter, Equals+HashCode, toString
         * @AllArgs-, NoArgs-, RequiredArgsConstructor (Alle Werte, Keine Werte, Final Werte)
         * @Builder -> Ermöglicht Builder Pattern zum instanziieren von Objekten = leicht lesbar und flexibel
         * @With -> erstellt Wither für alle Felder
         */
    }
}
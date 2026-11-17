package prac11.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 0);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 10);
        Assertions.assertEquals(Integer.valueOf(100), price);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 21);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 0);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 1001);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(Integer.valueOf(7000), price);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, 0);
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, 1000);
        Assertions.assertEquals(Integer.valueOf(5000), price);
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        Integer price = priceCalculator.calculatePrice(TransportType.DRONE, 0);
        Assertions.assertNull(price);
    }
}

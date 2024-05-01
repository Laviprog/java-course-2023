package edu.hw3.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStockMarket {
    static Stream<Arguments> methodSourceMostValuableStock() {
        return Stream.of(Arguments.of(
                new StockMarketImpl() {{
                    add(new Stock("gazprom", 10.0));
                    add(new Stock("sber", 15.0));
                    add(new Stock("tinkoff", 20.0));
                    add(new Stock("mtc", 19.0));
                    add(new Stock("Yandex", 18.5));
                }},
                new Stock("tinkoff", 20.0)
        ));
    }

    @ParameterizedTest
    @MethodSource("methodSourceMostValuableStock")
    void testMostValuableStock(StockMarketImpl stockMarketImpl, Stock stockExpected) {
        assertEquals(stockExpected, stockMarketImpl.mostValuableStock());
    }
}

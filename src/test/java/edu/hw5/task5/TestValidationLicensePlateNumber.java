package edu.hw5.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestValidationLicensePlateNumber {
    @ParameterizedTest
    @CsvSource({
            "А123ВЕ777, true",
            "О777ОО177, true",
            "А123ВЕ77, true",
            "Х987ХУ12, true",
            "123АВЕ777, false",
            "А123ВГ77, false",
            "А123ВЕ7777, false",
            "АА123ВЕ777, false"
    })
    void testValidLicensePlateNumber(String licensePlateNumber, boolean expected) {
        assertEquals(expected, new ValidationLicensePlateNumber().isValid(licensePlateNumber));
    }
}

package controller.PlaceOrderControllerTest;

import controller.PlaceOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateNameTest {
    // Duc - 20173040
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() {
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({
            "Duc, true",
            "Duc, true",
            ",false",
            "@ Duc, false",
            "@ Duc, false",
            "Le1,false",
            "Le@, false",
            "Le@ Duc, false"
    })
    void validateName(String name, boolean expected){
        //when
        boolean rs = placeOrderController.validateName(name);
        //then
        assertEquals(expected, rs);
    }
}
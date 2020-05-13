package ie.groupproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class shoppingCartTest {

    ShoppingCart ShoppingCart;

    @BeforeAll
    static void startingTests() {
        System.out.println("Starting the tests");
    }

    @BeforeEach
    void printDisplayNames(TestInfo testInfo, TestReporter testReporter){
        testReporter.publishEntry(testInfo.getDisplayName());
    }

    @AfterAll
    static void completeTests(){
        System.out.println("Testing Complete");
    }

    @DisplayName("Testing Constructor")
    @Test
    void testingConstructor(){
        ShoppingCart = new ShoppingCart("John", "Galway", "10", "2");
        assertEquals("John",ShoppingCart.getName());
        assertEquals("Galway",ShoppingCart.getAddress());
        assertEquals("10",ShoppingCart.getPrice());
        assertEquals("2",ShoppingCart.getShippingCharge());
    }
}

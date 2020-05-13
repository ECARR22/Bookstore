package ie.groupproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class customerTest {

    Customer customer;

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
        customer = new Customer("Evan","Galway", "2345", "12345678", "20" );
        assertEquals("Evan",customer.getName());
        assertEquals("Galway",customer.getAddress());
        assertEquals("2345",customer.getId());
        assertEquals("12345678",customer.getPassword());
        assertEquals("12345678",customer.getPassword());
        assertEquals("20",customer.getShippingPrice());
    }

}

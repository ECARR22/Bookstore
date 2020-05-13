package ie.groupproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class itemTest {

    item item;

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
        item = new item("Book", "1234", "novel", 5.0, 0);
        assertEquals("Book",item.getAuthor());
        assertEquals("1234",item.getCode());
        assertEquals("novel",item.getDescription());
        assertEquals(5.0,item.getPrice());
        assertEquals(0,item.getCount());
    }

    @DisplayName("Testing empty Constructor")
    @Test
    void testEmptyCstr() {
        item = new item("", "", "", 0.0, 0);
        assertEquals("",item.getAuthor());
        assertEquals("",item.getCode());
        assertEquals("",item.getDescription());
        assertEquals(0.0,item.getPrice());
        assertEquals(0,item.getCount());

    }

    @Test

    void testToString() {
        item = new item("Book", "1234", "novel", 5.0, 0);
        item.toString();
        //assertEquals("")
    }
}

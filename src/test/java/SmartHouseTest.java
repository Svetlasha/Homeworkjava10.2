import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SmartHouseTest {

    @Test
    public void TestSmart() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSmartNext() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(20);
        radio.prev();
        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}




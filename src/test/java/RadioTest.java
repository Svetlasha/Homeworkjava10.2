import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testLimitNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitPositive() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testLimitAverage() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitPositiveBorder() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitPositiveBorderMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLimitNegativeMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSoundNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSoundBack() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSoundBackNull() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSoundBackMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSoundMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.next();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSoundAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.next();
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
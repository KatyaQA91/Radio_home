import netology.ru.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void showCurrentStationAtAValueAboveMax() {  // текущий канал
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void showCurrentStationAtAValueAboveMin() {  // текущий канал
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showCurrentVolumeAtAValueAboveMax() {  // текущий канал
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void showCurrentVolumeAtAValueAboveMin() {  // текущий канал
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test

    public void checkStationAboveMax() {  //максимальный канал
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void showCurrentStationMin() {  // минимальный канал
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showCurrentNextAtTheMinValue() {  //увеличивает канал
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showCurrentNextAtTheMaxValue() {  //увеличивает канал
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showCurrentStationBackAtTheMinValue() {  //уменьшает канал
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void showCurrentStationAtTheMaxValue() {  //уменьшает канал
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showCurrentVoliumAtTheMinValue() {   // уменьшает громкость
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.back();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void showCurrentVoliumAtTheMaxValue() {   // уменьшает громкость
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.back();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void showCurrentVoliumNextMax() {  //прибавляет громкость
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.control();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void showCurrentVoliumNextMaxWithMinValue() {  //прибавляет громкость
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.control();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
package netology.ru;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;

    private int maxVolume = 100;

    public Radio() {


    }

    public Radio(int quantity) {
        this.maxStation = quantity - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }

    public void back() {
        if (currentVolume >= maxVolume) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }

    public void control() {
        if (currentVolume != maxVolume) {
            currentVolume++;
            return;
        }
        currentVolume = maxVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume++;
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        } else {
            this.currentVolume = currentVolume;
        }


    }
}

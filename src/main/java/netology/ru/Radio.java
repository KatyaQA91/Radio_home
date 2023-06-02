package netology.ru;


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;


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
        if (currentVolume >= 100) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }

    public void control() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 100;
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
        if (currentVolume > 100) {
            return;
        } else {
            this.currentVolume = currentVolume;
        }


    }
}
public class SmartTv {

    boolean power = false;
    int channel = 2;
    int volume = 25;


    public void higherVolume() {
        volume++;
    }

    public void lowerVolume() {
        volume--;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

}

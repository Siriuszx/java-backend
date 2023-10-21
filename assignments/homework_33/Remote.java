package homework_33;

public class Remote {

    private final TV mainTV;

    Remote(TV mainTV) {
        this.mainTV = mainTV;
    }

    public void on(int channelIndex) {
        mainTV.showBroadcast(channelIndex);
    }
}

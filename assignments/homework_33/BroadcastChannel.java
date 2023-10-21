package homework_33;

public class BroadcastChannel{
    private final String broadcastChannelName;

    Broadcast[] channelBroadcasts;

    public BroadcastChannel(String broadcastChannelName, Broadcast ...broadcasts) {
        this.broadcastChannelName = broadcastChannelName;
        this.channelBroadcasts = broadcasts;
    }

    public void showBroadcast() {
        int rndIndex = (int) Math.floor(Math.random() * channelBroadcasts.length);

        System.out.printf("You are watching now '%s' on %s\n", channelBroadcasts[rndIndex].getBroadcastName(), broadcastChannelName);
    }

    public String getBroadcastChannelName() {
        return broadcastChannelName;
    }
}

package homework_33;

public class Broadcast {

    private final String broadcastName;
    private final String broadcastLength;

    public Broadcast(String broadcastName, String broadcastLength) {
        this.broadcastName = broadcastName;
        this.broadcastLength = broadcastLength;
    }

    public String getBroadcastName() {
        return broadcastName;
    }

    public String getBroadcastLength() {
        return broadcastLength;
    }
}

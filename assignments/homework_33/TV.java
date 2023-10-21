package homework_33;

public class TV {

    private final BroadcastChannel[] broadcastChannels;

    public TV(BroadcastChannel ...broadcastChannels) {
        this.broadcastChannels = broadcastChannels;
    }

    public void showBroadcast(int channelID) {
        if(channelID >= 0 && channelID < broadcastChannels.length)
            broadcastChannels[channelID].showBroadcast();
        else
            System.err.println("This channel doesn't exist! Too bad!");
    }
}

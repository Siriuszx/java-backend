package homework_33;

public class homework_33 {

    public static void main(String[] args) {
        Broadcast cats = new Broadcast("Cute cats", "1h");
        Broadcast dogs = new Broadcast("Stray dogs", "20m");
        Broadcast science = new Broadcast("Quick science facts", "2m");
        Broadcast drama = new Broadcast("Ruble Exchange Rate", "1h 0m 1s 22ms");
        Broadcast weather = new Broadcast("Weather in Europe", "30m");
        Broadcast talkShow = new Broadcast("U Dmitriya Gordona", "1h");
        Broadcast comedy = new Broadcast("Parliament Live", "∞");
        Broadcast USNews = new Broadcast("Latest Report from the US", "30m");
        Broadcast AUNews = new Broadcast("PowerPoint genius explains the causes of wars", "1h 30m");
        Broadcast morningBreak = new Broadcast("Morning with Sleepy Bob", "20m");
        Broadcast techShow = new Broadcast("Apple Presentation", "1h");
        Broadcast codingShow = new Broadcast("JS Conference 2024", "2h");
        Broadcast quickLaughs = new Broadcast("Funny animals", "1m");

        BroadcastChannel cnn = new BroadcastChannel("CNN", cats, science, dogs);
        BroadcastChannel skyNews = new BroadcastChannel("SkyNews", AUNews, quickLaughs, weather);
        BroadcastChannel foxNews = new BroadcastChannel("FOX NEWS", USNews, comedy, morningBreak);
        BroadcastChannel bbc = new BroadcastChannel("BBC", drama, talkShow, techShow, codingShow);

        TV tv = new TV(cnn, skyNews, foxNews, bbc);

        Remote livingRoomRemote = new Remote(tv);

        livingRoomRemote.on(4);
    }
}

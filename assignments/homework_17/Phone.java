package homework_17;

public class Phone {
    private final int RAM;
    private final int storage;
    private final String modelName;
    private final int resolutionWidthPx;
    private final int resolutionHeightPx;
    private final float screenSize;
    private String OSVersion = "17.0.1";

    public Phone(int RAM, int storage, String modelName, int resolutionWidthPx, int resolutionHeightPx, float screenSize, String OSVersion) {
        this.RAM = RAM;
        this.storage = storage;
        this.modelName = modelName;
        this.resolutionWidthPx = resolutionWidthPx;
        this.resolutionHeightPx = resolutionHeightPx;
        this.screenSize = screenSize;
        this.OSVersion = OSVersion;
    }

    public void displayInfo() {
        System.out.printf(
                "Model Name: %s\nStorage Capacity: %sgb\nScreen Size: %f'\nScreen Resolution: %dx%d\nCurrent OS Version: IOS%s\n",
                modelName,
                storage,
                screenSize,
                resolutionHeightPx,
                resolutionWidthPx,
                OSVersion
        );
    }

    public void sendMsg(String msg, String recepient) {
        System.out.printf("Sending message: \"%s\"\nto %s\n", msg, recepient);
    }

    public void updateOSVersion(String newOSVersion) {
        OSVersion = newOSVersion;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

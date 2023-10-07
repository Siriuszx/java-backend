package homework_18;

public class Dog {
    final String name;

    int defaultJumpHeight;
    int currentJumpHeight;

    private static int jumpsCount = 0;

    Dog(String name, int jumpHeightValue) {
        this.name = name;
        this.defaultJumpHeight = jumpHeightValue;
        this.currentJumpHeight = jumpHeightValue;
    }

    public static int getJumpsCount() {
        return jumpsCount;
    }

    void train() {
        if ((currentJumpHeight + 10) < defaultJumpHeight * 2) {
            currentJumpHeight += 10;
        } else {
            System.err.println("Error: dogs can't be trained to jump that high.");
        }
    }

    void jumpOverBarrier(int barrierHeight) {
        if (currentJumpHeight >= barrierHeight) {
            System.out.println("*Dog jumps over the barrier*");
            jumpsCount++;
        } else {
            if (barrierHeight < defaultJumpHeight * 2) {
                System.out.printf("The dog should train %d more times\n", (barrierHeight - currentJumpHeight) / 10);
            } else {
                System.err.println("Error: your dog can't be trained to jump that high.");
            }
        }
    }
}

package Bikes;

public class InvalidFrameSize extends RuntimeException {

    public InvalidFrameSize() {
        super("Invalid Frame Size");
        System.err.println("Select valid frame size");
    }

    public InvalidFrameSize(String str) {
        super("Invalid Frame Size");
        System.err.println("unknown frame size ==> " + str);
    }
}

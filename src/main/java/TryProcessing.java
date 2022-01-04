import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(640/2, 480/2, 20, 20);
        //executes only once where as draw method will get executes again and again in loop
    }

    @Override
    public void draw() {
        ellipse(WIDTH/2, HEIGHT/2, DIAMETER, DIAMETER);
    }
}

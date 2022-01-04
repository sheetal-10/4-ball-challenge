import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    public static final int SPEED_1 = 1;
    public static final int SPEED_2 = 2;
    public static final int SPEED_3 = 3;
    public static final int SPEED_4 = 4;
    private int x1 = 0;
    private int x2 = 0;
    private int x3 = 0;
    private int x4 = 0;


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
        //executes only once whereas draw method will get executes again and again in loop
    }

    @Override
    public void draw() {
        ellipse(x1 += SPEED_1, HEIGHT / 4, DIAMETER, DIAMETER);
        ellipse(x2 += SPEED_2, HEIGHT * 2 / 4, DIAMETER, DIAMETER);
        ellipse(x3 += SPEED_3, HEIGHT * 3 / 4, DIAMETER, DIAMETER);
        ellipse(x4 += SPEED_4, HEIGHT * 4 / 4, DIAMETER, DIAMETER);
    }
}

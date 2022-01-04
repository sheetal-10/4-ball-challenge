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


    Ball ball1 = new Ball(x1, HEIGHT / 4, SPEED_1);
    Ball ball2 = new Ball(x2, HEIGHT * 2 / 4, SPEED_2);
    Ball ball3 = new Ball(x3, HEIGHT * 3 / 4, SPEED_3);
    Ball ball4 = new Ball(x4, HEIGHT * 4 / 4, SPEED_4);


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
        ball1.setX(ball1.getX() + ball1.getSpeed());
        ball2.setX(ball2.getX() + ball2.getSpeed());
        ball3.setX(ball3.getX() + ball3.getSpeed());
        ball4.setX(ball4.getX() + ball4.getSpeed());


        ellipse(ball1.getX(), ball1.getY(), DIAMETER, DIAMETER);
        ellipse(ball2.getX(), ball2.getY(), DIAMETER, DIAMETER);
        ellipse(ball3.getX(), ball3.getY(), DIAMETER, DIAMETER);
        ellipse(ball4.getX(), ball4.getY(), DIAMETER, DIAMETER);
    }
}

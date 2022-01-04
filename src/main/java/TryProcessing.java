import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int SPEED_1 = 1;
    public static final int SPEED_2 = 2;
    public static final int SPEED_3 = 3;
    public static final int SPEED_4 = 4;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;

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
        ball1 = new Ball(0, HEIGHT / 4, SPEED_1);
        ball2 = new Ball(0, HEIGHT * 2 / 4, SPEED_2);
        ball3 = new Ball(0, HEIGHT * 3 / 4, SPEED_3);
        ball4 = new Ball(0, HEIGHT * 4 / 4, SPEED_4);
    }

    @Override
    public void draw() {
        ball1.move();
        ball2.move();
        ball3.move();
        ball4.move();

        ball1.draw(this);
        ball2.draw(this);
        ball3.draw(this);
        ball4.draw(this);
    }
}

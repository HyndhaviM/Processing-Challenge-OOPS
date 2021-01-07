import processing.core.PApplet;
class Circle {
    private static float diameter= 20;
    private float x;
    private float y;

    public Circle(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    void drawCircle(PApplet pApplet)
    {
        pApplet.ellipse(x,y,diameter,diameter);
    }
}

public class ProcessingOOP extends PApplet{

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 1000;
    private int noOfCircles = 4;
    private int[] xCoordinates;

    public static void main(String[] args)
    {
        PApplet.main("ProcessingOOP",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        //initializing x coordinate for each circle
        xCoordinates = new int[noOfCircles];
        for(int i=0;i<noOfCircles;i++)
        {
            xCoordinates[i]=1;
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<noOfCircles;i++)
        {
           Circle circle = new Circle(xCoordinates[i],(i+1)*HEIGHT/5);
           circle.drawCircle(this);
           xCoordinates[i]+=(i+1); //updating x coordinate for circle to draw at respective place (appears to be speed)
        }

    }

}


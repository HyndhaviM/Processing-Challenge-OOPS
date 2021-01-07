import processing.core.PApplet;
public class ProcessingOOP extends PApplet{

    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public int noOfEllipses = 4;
    public int[] xEllipses;
    public static final float diameter= 20;

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
        xEllipses = new int[noOfEllipses];
        for(int i=0;i<noOfEllipses;i++)
        {
            xEllipses[i]=1;
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<noOfEllipses;i++)
        {
           Circle circle = new Circle(xEllipses[i],(i+1)*HEIGHT/5, diameter);
           circle.drawCircle();
           xEllipses[i]+=(i+1); //updating x coordinate for circle to draw at respective place (appears to be speed)
        }

    }

    class Circle {
        public float diameter= 20;
        public float x;
        public float y;

        public Circle(float x, float y, float diameter)
        {
            this.x = x;
            this.y = y;
            this.diameter = diameter;
        }

        public void drawCircle()
        {
            ellipse(x,y,diameter,diameter);
        }
    }

}


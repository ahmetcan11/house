
/**
 * Write a description of class Mypicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mypicture
{
    // instance variables - replace the example below with your own
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square tree;
    private boolean drawn;
    /**
     * Constructor for objects of class Mypicture
     */
    public Mypicture()
    {
        // initialise instance variables
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        
        drawn = false;
    }
public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
            
            sun.changeColor("red");
            sun.moveHorizontal(50);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }
     public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}

    
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
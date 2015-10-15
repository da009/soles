/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square ground;
    private Person persona;
    private Person persona1;
    private Person persona2;
    private Person persona3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        ground = new Square();
        ground.changeColor("green");
        ground.moveHorizontal(-320);
        ground.moveVertical(130);
        ground.changeSize(520);
        ground.makeVisible();
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Bajar sun y dejar en blanco y negro
     */
    public void movesun()
    {
        {
            sun.slowMoveVertical(100);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            ground.changeColor("black");
        }
    }
    
        /**
     * Aperece una persona y se acerca a la casa
     */
    public void persona()
    {
        {
            persona = new Person();
            persona.moveHorizontal(-300);
            persona.moveVertical(20);
            persona.makeVisible(); 
            persona.slowMoveHorizontal(175);
        }
    }
    
         /**
     * Creas personas invisibles
     */
    public void invmen()
    {
        {
            persona1 = new Person();
            persona1.moveHorizontal(-150);
            persona1.moveVertical(-200);
            
            persona2 = new Person();
            persona2.moveHorizontal(110);
            persona2.moveVertical(-200);
            
            persona3 = new Person();
            persona3.moveHorizontal(0);
            persona3.moveVertical(-200);
        }
    }
    
             /**
     * Llueven personas
     */
    public void rainningmen()
    {
        if (persona1 != null)   // only if it's visible already...
        if (persona2 != null)   // only if it's visible already...
        if (persona3 != null)   // only if it's visible already...
        {
            persona1.makeVisible(); 
            persona1.slowMoveVertical(220);

            persona2.makeVisible(); 
            persona2.slowMoveVertical(220);

            persona3.makeVisible(); 
            persona3.slowMoveVertical(220);
        }
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            ground.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
            ground.changeColor("green");
        }
    }
}

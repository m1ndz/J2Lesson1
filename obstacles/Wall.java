package obstacles;
import animals.*;
/**
 * Write a description of class Wall here.
 *
 * @author Anton Ezhov
 * @version 22.12.2017
 */
public class Wall implements Please {
    private float height;

    public Wall(float height) {
        this.height = height;
    }
    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }
    public float getHeight(){
        return height;
    }
}
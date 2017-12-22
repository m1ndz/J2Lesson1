package obstacles;
import animals.*;
/**
 * Write a description of class Water here.
 *
 * @author Anton Ezhov
 * @version 22.12.2017
 */
public class Water implements Please {
    private int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}
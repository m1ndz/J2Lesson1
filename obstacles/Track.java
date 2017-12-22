package obstacles;
import animals.*;
/**
 * Write a description of class Track here.
 *
 * @author Anton Ezhov
 * @version 22.12.2017
 */
public class Track implements Please {
    private int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}
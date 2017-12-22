package obstacles;
import java.util.*;
import animals.*;
/**
 * Write a description of class Course here.
 *
 * @author Anton Ezhov
 * @version 22.12.2017
 */
public class Course {
    Please[] please = new Please[3];
    Random random = new Random();
    public Course() {
        Track track = new Track(random.nextInt(100));
        Wall wall = new Wall(random.nextFloat() * 10);
        Water water = new Water(random.nextInt(100));
        please[0] = (Please) track;
        please[1] = (Please) wall;
        please[2] = (Please) water;
    }
    public void printObstacleInfo() {
        System.out.println("Length track: " + ((Track) please[0]).getLength());
        System.out.println("Height wall: " + ((Wall) please[1]).getHeight());
        System.out.println("Length water: " + ((Water) please[2]).getLength());
        System.out.println();
    }
    public void passObstacle(Team team){
        for(Animal animal : team.teamAnimal){
            for(Please l : please){
                if(!l.doIt(animal)){
                    animal.setPassing(l.doIt(animal));
                    break;
                }
                animal.setPassing(true);
            }
        }
    }
}
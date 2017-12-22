package animals;
import java.util.*;
/**
 * Write a description of class Team here.
 *
 * @author Anton Ezhov
 * @version 22.12.2017
 */
public class Team {
    private String nameTeam = "unknown";
    Animal[] zoo = {new Cat("Murzik"), new Hen("Izzy"), new Hippo("Hippopo")};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    public Team(String nameTeam) {
        this.nameTeam = nameTeam;
        for(int i = 0; i < 4; i++){
            int rand = random.nextInt(3);
            teamAnimal[i] = zoo[rand];
        }
    }
    public void printTeamInfo() {
        System.out.println("Team: " + nameTeam);
        for(Animal a : teamAnimal) {
            System.out.println(a);
            System.out.println("Run limit: " + a.run_limit);
            if (a instanceof Swimable)
                System.out.println("Swim limit: " + ((Swimable) a).getSwimLimit());
            if (a instanceof Jumpable)
                System.out.println("Jump limit: " + ((Jumpable) a).getJumpLimit());
        }
        System.out.println();
    }
    public void passDistance(){
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal){
            if(a.passing){
                System.out.println(a + " passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();
    }
}
import animals.*;
import obstacles.*;
/**
 * Write a description of class J2Lesson1 here.
 *
 * @author Anton Ezhov
 * @version 22.12.2017
 */
public class J2Lesson1 {

    public static void main(String[] args) {
        Team team1 = new Team("Virtus.pro");
        team1.printTeamInfo();
        Team team2 = new Team("SK_Gaming");
        team2.printTeamInfo();
        Course course = new Course();
        course.printObstacleInfo();
        course.passObstacle(team1);
        course.passObstacle(team2);
        team1.passDistance();
        team2.passDistance();
    }
}
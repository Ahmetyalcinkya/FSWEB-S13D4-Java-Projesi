import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        POINT
        Point pointOne = new Point(6,5);
        Point pointTwo = new Point(3,1);
        Point pointThree = new Point(0,0);
        Point pointFour = new Point(0,0);


        System.out.println("<------------------->");
        System.out.println("<--Defaults-->");
        System.out.println("distance(0,0) : " + pointOne.distance());
        System.out.println("distance(second)= " + pointOne.distance(pointTwo));
        System.out.println("distance(2,2)= " + pointOne.distance(2, 2));
        System.out.println("distance(0,0) : " + pointThree.distance());
        System.out.println("<------------------->");
        System.out.println("<--Custom-->");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number : ");
        int xSetter = scanner.nextInt();
        System.out.println("Give another number : ");
        int ySetter = scanner.nextInt();
        pointFour.setX(xSetter);
        pointFour.setY(ySetter);

      System.out.println("distance for user : " + pointThree.distance(pointFour.getX(), pointFour.getY() ));

//        PLAYER

        Player playerOne = new Player("Ahmet", 100, Weapon.AWP);
        Player playerTwo = new Player("X", 125, Weapon.AK47);

        System.out.println(playerOne);
        playerOne.loseHealth(Weapon.AWP.getDamage());
        System.out.println(playerTwo);
        playerTwo.loseHealth(Weapon.AK47.getDamage());
        System.out.println(playerTwo);
        playerTwo.restoreHealth(20);
        System.out.println(playerTwo);

    }
}
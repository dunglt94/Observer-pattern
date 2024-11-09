package view;

import model.BinaryObserver;
import model.HexObserver;
import model.OctObserver;
import model.Subject;

import java.util.Scanner;

public class ObserverDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Subject sub = new Subject();

        new HexObserver(sub);
        new OctObserver(sub);
        new BinaryObserver(sub);

        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(scan.nextInt());
        }
    }
}

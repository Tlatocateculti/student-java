//import wskz.Figure; //to nie zadziała!
import wskz.Figure;
import wskz.Square;
import wskz.Triangle;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    void calcSquare() {
        var s = new Square(0,0,2,2);
        System.out.println(s.calculatePerimiter());
        System.out.println(s.calculateField());
    }
    void calcTriangle() {
        Scanner sc = new Scanner(System.in);
        Figure t2 = new Triangle();
        double x,y;
        x=y=-1d;
        while (t2.getPointsNumber() < 3) {
            System.out.println("Podaj współrzędne punktu (X, Y): ");
            x = sc.nextDouble();
            y = sc.nextDouble();
            t2.addPoint(x, y);
        }
        System.out.println(t2.calculatePerimiter());
        System.out.println(t2.calculateField());
    }
    void menu() {
        int choice = -1;
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("1. Trójkąt\n2.Kwadrat\n3.Koniec ");
        System.out.println("Twój wybór: ");
        choice = (new Scanner(System.in)).nextInt();
        switch (choice) {
            case 1: calcTriangle(); break;
            case 2: calcSquare(); break;
            case 3: System.exit(0);
            default: System.out.println("Nieznana operacja");
        }
    }
    public static void main(String[] args) {
        for (;;)
            (new Main()).menu();
    }
    //oryginalna funkcja main
    /*public static void main(String[] args) {
        var t = new Triangle(0,0,1,0, 1,1);
        System.out.println(t.calculatePerimiter());
        System.out.println(t.calculateField());
        var s = new Square(0,0,2,2);
        System.out.println(s.calculatePerimiter());
        System.out.println(s.calculateField());
        Figure s2 = new Square(10,11);
        System.out.println(s2.calculatePerimiter());
        System.out.println(s2.calculateField());
        Scanner sc = new Scanner(System.in);
        Figure t2 = new Triangle();
        double x,y;
        x=y=-1d;
        while ((x!=0d && y!=0d) || t2.getPointsNumber() < 3) {
            System.out.println("Podaj współrzędne punktu (X, Y): ");
            x = sc.nextDouble();
            y = sc.nextDouble();
            t2.addPoint(x, y);
        }
        System.out.println(t2.calculatePerimiter());
        System.out.println(t2.calculateField());
    }*/
}
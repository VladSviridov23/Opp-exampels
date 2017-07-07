package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Circul circul = new Circul();
        circul.countSquare();
        Square square = new Square();
        square.countSquare();
        Rectangle rectangle = new Rectangle();
        rectangle.countSquare();

    }
}

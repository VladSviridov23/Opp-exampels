package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Rectangle extends Figure  {
    private int longSide=5;
    private int shortSide=2;

    public void countSquare() {
        int square= longSide * shortSide;
        System.out.println("rectangl square = "+square);
    }
}

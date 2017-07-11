package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Rectangle extends Figure  {
    double longSide=5.65;
    double shortSide=2.13;

    @Override
    public void countSquare() {
        super.countSquare();
        double square= longSide * shortSide;
        System.out.println("rectangl square = "+square);
    }
}

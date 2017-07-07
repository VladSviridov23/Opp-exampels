package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Rectangle extends Figure {
    double longSide;
    double shortSide;

    @Override
    public void countSquare() {
        double square= longSide * shortSide;
    }
}

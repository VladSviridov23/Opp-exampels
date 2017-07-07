package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Square extends  Figure {
     double  side;
    @Override
    public void countSquare() {
        double square = side *side;
    }
}

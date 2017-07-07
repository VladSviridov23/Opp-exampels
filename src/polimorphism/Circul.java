package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Circul extends Figure {

    double r;
    double  PI =3.1415;

    @Override
    public void countSquare() {
            double square = PI * r * r;
        }
}

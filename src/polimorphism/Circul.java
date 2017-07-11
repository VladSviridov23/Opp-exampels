package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Circul extends Figure {

    double r=2.11;
    double  PI =3.1415;

    @Override
    public void countSquare() {
        super.countSquare();
            double square = PI * r * r;
        System.out.println("circul square = "+square);
    }
}

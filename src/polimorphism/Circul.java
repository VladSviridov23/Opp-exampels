package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Circul extends Figure {

    private int r=5;
    private double  PI =3.14;

        public void countSquare() {
            double square = PI * r * r;
        System.out.println("circul square = "+square);
    }
}

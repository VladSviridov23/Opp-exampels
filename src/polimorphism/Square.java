package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Square extends Figure{
     double  side=4.4;

     @Override
     public void countSquare() {
          super.countSquare();
          double square = side *side;
          System.out.println("squrae  = " +square);
     }
}

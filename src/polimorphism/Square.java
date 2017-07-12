package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Square extends Figure{
     private int  side=4;

     public void countSquare() {
          int square = side *side;
          System.out.println("squrae  = " +square);
     }
}

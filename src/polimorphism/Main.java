package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        Figure f = new Circul();
        f.countSquare();

        f=new Square();
        f.countSquare() ;

        f= new Rectangle();
        f.countSquare();
    }
}

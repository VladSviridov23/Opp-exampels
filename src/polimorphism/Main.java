package polimorphism;

/**
 * Created by Vlad on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        Figure[] arr = new Figure[]{new Circul(),new Rectangle(),new Square()};
        for(int i=0;i<arr.length;i++)
            arr[i].countSquare();
    }
}

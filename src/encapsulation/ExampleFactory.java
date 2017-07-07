package encapsulation;

/**
 * Created by Vlad on 07.07.2017.
 */

public class ExampleFactory {
    public int component1 = 6;
    public int component2 = 13;


    public int getProduct(){
        int component3 = getComponent3();
        System.out.println("Factory component #3: " + component3);
        int product = component1*component2*component3;
        return product;
    }

    private int getComponent3(){
        return 12345;
    }
}


package abstraction;

/**
 * Created by Vlad on 07.07.2017.
 */
public class BT7 extends AbstractTank {

    public BT7(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {
        System.out.println("Move BT7 speed 70");
    }

    @Override
    public void draw() {
        if (!isDestroyed()) {
            System.out.println("Draw Yellow tank");
        }
    }

    public static void main(String[] args) {

        AbstractTank tank = new BT7(50, 60);
    }
}

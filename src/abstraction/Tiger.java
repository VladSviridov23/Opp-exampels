package abstraction;

/**
 * Created by Vlad on 07.07.2017.
 */
public class Tiger extends AbstractTank {

    private int arm;

    public Tiger(int x, int y, int arm) {
        super(x, y);
        this.arm = arm;
    }

    @Override
    public void move() {
        System.out.println("Move Tiger speed - 45");
    }

    @Override
    public void draw() {
        if (!isDestroyed()) {
            System.out.println("Red Tank");
        }
    }

    public int getArm() {
        return arm;
    }

    public void setArm(int arm) {
        this.arm = arm;
    }

}

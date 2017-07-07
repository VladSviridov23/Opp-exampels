package abstraction;

/**
 * CCreated by Vlad on 07.07.2017.
 */
public abstract class AbstractTank  implements Tank {

    private int x;
    private int y;
    private boolean destroy;

    public AbstractTank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean isDestroyed() {
        return destroy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void fire() {
        System.out.println("Fire");
    }

    @Override
    public void destroy() {
        destroy = true;
    }

}

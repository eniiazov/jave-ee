package polymorphism2;


public class HumanScale extends Chair implements Rollable, Collapsible {

    @Override
    public void sit() {
        System.out.println("Sitting on Humanscale chair");
    }

    @Override
    public void stepOnIt() {
        System.out.println("Stepping on Humanscale chair");
    }

    @Override
    public void lock() {
        System.out.println("HumanScale is locking");
    }

    @Override
    public void unlock() {
        System.out.println("HumanScale is unlocking");
    }

    @Override
    public void fold() {
        System.out.println("HumanScale is folding");
    }

    @Override
    public void unfold() {
        System.out.println("HumanScale is unfolding");
    }

    @Override
    public void rollBack() {
        System.out.println("HumanScale is rolling back");
    }

    @Override
    public void rollForward() {
        System.out.println("HumanScale is rolling forward");
    }
}

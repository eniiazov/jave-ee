package abs;

public class Firefox extends Browser {

    // Why?
    // Regular methods: close, toString, clone, hashCode etc
    // Abstract methods: launch, browse, getNumOfTabs
    // Abstract class: a class that can have both abstract and non-abstract methods.
    // Abstract class is MEANT to be a parent of some other class.


    @Override
    public void launch() {

    }

    @Override
    public void browse(String url) {

    }

    @Override
    public int getNumOfTabs() {
        return 0;
    }
}

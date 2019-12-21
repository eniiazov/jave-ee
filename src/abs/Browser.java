package abs;

public abstract class Browser {

    String name;
    double size;
    double version;

    public Browser(){
        super();
    }

    public abstract void launch();

    public abstract void browse(String url);

    public abstract int getNumOfTabs();

    public void close(){
        System.out.println("Browser is closing");
    }

    @Override
    public String toString() {
        return "what up";
    }
}

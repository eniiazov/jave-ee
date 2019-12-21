package abs;

public class Safari extends Browser{

    @Override
    public void launch() {
        System.out.println("Safari is launching");
    }

    @Override
    public void browse(String url) {
        System.out.println("Safari is browsing the URL: " + url);
    }

    @Override
    public int getNumOfTabs() {
        System.out.println("Safari is getting number of tabs");
        return 7;
    }
}

package abs;

public class Chrome extends Browser {

    public Chrome(){
        super();
    }

    @Override
    public void launch(){
        System.out.println("Chrome is launching");
    }

    @Override
    public void browse(String url){
        System.out.println("Chrome is browsing URL: " + url);
    }

    @Override
    public int getNumOfTabs(){
        System.out.println("Chrome is returning number of tabs open");
        return 10;
    }

}

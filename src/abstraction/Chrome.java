package abstraction;

public class Chrome extends Browser{

    @Override
    public void launch(){
        System.out.println("Chrome is launching");
    }

    @Override
    public void browse(String url){
        System.out.println("Chrome is browsing the URL: " + url);
    }

}

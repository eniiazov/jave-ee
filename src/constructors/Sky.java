package constructors;

import com.sun.tools.corba.se.idl.toJavaPortable.Skeleton;

public class Sky {

    public Sky(String colorCode){
        this.color = colorCode;
    }

    public Sky(){

    }

    // Create a constructor that takes both color and visibleStars and set them accordingly
    public Sky(String color, int visibleStars){
        this.color = color;
        this.visibleStars = visibleStars;
    }

    String color;
    int visibleStars;

    public void info(){
        System.out.println("\nColor: " + color);
        System.out.println("Visible stars: " + this.visibleStars);
    }


    public static void main(String[] args) {
        Sky refSky = new Sky("Blue");
        refSky = new Sky("red", 3);

        int i = 5;
        i = 4;

        Sky s2 = new Sky("Yellow", 7);
        s2.info();
        refSky.info();

    }

}

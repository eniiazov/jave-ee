package accessModifiers;

public class Chair {

    private int size;
    public String model;

    public void setSize(int size){
        if(size > 0){
            this.size = size;
        }
    }

    public int getSize(){
        if(this.model.equals("IKEA")){
            return size;
        }
        else{
            System.out.println("Sorry, it is not IKEA");
            return -1;
        }

    }


    public void info(){
        System.out.println("Model: " + this.model);
        System.out.println("Size: " + this.size);
    }

}

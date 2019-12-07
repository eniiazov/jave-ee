package recapwednesdays;

public class ArrayEx1 {
    public static void main(String[] args) {

        //1-Create an array of Strings called carBrands
        String [] carBrands = {"mercedes","bmw","toyota","ferrari"};
        //2-Loop through carBrands
        for(String car: carBrands){
            //3-Create a check (if) condition to create my logic
            if(car.equalsIgnoreCase("mercedes")){
                System.out.println(car + ": Luxury - Comfort");
            }else if(car.equalsIgnoreCase("bmw")){
                System.out.println(car + ": Luxury - Sport");
            }else if(car.equalsIgnoreCase("toyota")){
                System.out.println(car + ": Reliable - Cheap");
            }else if(car.equalsIgnoreCase("ferrari")){
                System.out.println(car + ": Super luxury - Super expensive");
            }

        }



    }
}

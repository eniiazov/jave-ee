package recapwednesdays;

public class Methods_LoremIpsum {
    public static void main(String[] args) {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Risus in hendrerit gravida rutrum. Cursus turpis massa tincidunt dui ut. Quisque non tellus orci ac. In nisl nisi scelerisque eu ultrices vitae auctor eu augue.";
        System.out.println(doesContain(lorem));
    }

    public static boolean doesContain(String str){
        //1- Split with dot to get all sentences as a String array
        String [] strArr = str.split("\\.");
        //2- Check if sentence with index #2 contains massa
        String thirdSentence = strArr[2];
        if(!thirdSentence.contains("massa")){
            return false;
        }else
            return true;
        //3- return value
    }
}

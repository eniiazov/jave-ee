package recapwednesdays;

public class ArrayReverseSentence {
    public static void main(String[] args) {

        //1- Create a string
        String sentence = "We went to picnic today";
        String reversedSentence = "";
        //2- Create logic to reverse the string
        for(int i=sentence.length()-1; i>=0; i--){
            reversedSentence += sentence.charAt(i);
        }
        //3- Print out the value

        System.out.println("Reversed Sentence is: " + reversedSentence);

    }
}

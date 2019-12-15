package recapwednesdays;

public class Methods_Fibonacci {

    public static void main(String[] args) {
        beFibonacci(10);
    }

    public static void beFibonacci(int n){
        int num1=0;
        int num2=1;

        System.out.print("The first " + n + " number of Fibonacci series are: ");
        //0 1 1 2 3 5
        for(int i=0; i<n; i++){
            System.out.print(num1 + " - ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

    }
}

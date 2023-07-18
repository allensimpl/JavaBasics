import java.util.Scanner;

public class OddNos {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int digit = sc.nextInt();
        System.out.println(oddNosCalculator(digit));
    }
    public static int oddNosCalculator(int digit){
        int noOfOdds = 0;
        for(int i=1;i<=digit;i++){
            if(i%2!=0){
                noOfOdds++;
            }
        }
        return noOfOdds;
    }
}

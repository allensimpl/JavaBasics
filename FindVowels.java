import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindVowels {
    public static void main(String args[]){
        final String TEST_STRING = "alerilobuns";
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int count = 0;
        for(int i=0;i<=TEST_STRING.length()-1;i++){
            char testCharachter = TEST_STRING.charAt(i);
            if(vowels.contains(testCharachter)){
                count++;
            }
        }
        System.out.println(count);
    }
}

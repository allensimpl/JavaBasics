public class Palindrome {
    private final static String TEST_PAL_STRING = "malayalam";
    public static void main(String[] args){
        palindromeChecker(TEST_PAL_STRING);
    }
    public static void palindromeChecker(String TEST_PAL_STRING){
        int i=0;
        int j=TEST_PAL_STRING.length()-1;
        int pal = 1;
        while(i<=j){
            if(TEST_PAL_STRING.charAt(i)!=TEST_PAL_STRING.charAt(j)){
                pal=0;
                break;
            }
            i++;
            j--;
        }
        if(pal==1){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It's not a Palindrome");
        }

    }
}

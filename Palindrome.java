public class Palindrome {
    public static void main(String[] args){
        final String TEST_PAL_STRING = "malayalam";
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

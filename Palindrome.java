public class Palindrome {
    public static void main(String[] args){
        String x = "malayalam";
        int i=0;
        int j=x.length()-1;
        int pal = 1;
        while(i<=j){
            if(x.charAt(i)!=x.charAt(j)){
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

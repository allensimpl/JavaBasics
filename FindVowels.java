public class FindVowels {
    public static void main(String args[]){
        String x = "alerilobuns";
        int count = 0;
        for(int i=0;i<=x.length()-1;i++){
            char a = x.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}

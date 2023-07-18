public class CountPrime {
    private final static int[]  TEST_DIGITS = {3,11,2,7,12,3};
    public static void main(String[] args){
        primeChecker(TEST_DIGITS);
    }
    public static void primeChecker(int[] TEST_DIGITS){
        int count=0;
        for(int element:TEST_DIGITS){
            int flag=1;
            if(element==0||element==1){
                continue;
            }
            for(int j=2;j<=(element/2);j++){
                if(element%j==0) {
                    flag = 0;
                }
            }
            if(flag==1){
                count++;
            }
        }
        System.out.println(count);
    }
}

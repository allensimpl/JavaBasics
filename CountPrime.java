public class CountPrime {
    public static void main(String[] args){
        int[] a = {9,11,2,7,12,3};
        int count=0;
        for(int i:a){
            int flag=1;
            for(int j=2;j<=(i/2);j++){
                if(i%j==0) {
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

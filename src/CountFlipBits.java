public class CountFlipBits {

   public static int countFlipBits(int a, int b){
       int n = a^b;
       int count =0;

       while(n>0){
           if((n&1)== 1){
               count ++;
           }
           n >>=1;
       }return count;
   }

    public static void main(String[] args) {

    }
}

public class CountFlipBits {


    //method to count the steps to convert a to b or vice versa
   public static int countFlipBits(int a, int b){
      //first of all take xor operator as the non similar will give 1 and the same ones will give 0
       int n = a^b;
       int count =0;

       //so when i take n's & with 1, if it gives me one then this element should be switched
       while(n>0){
           if((n&1)== 1){
               count ++;
           }
           // otherwise just perform a right shift
           n >>=1;
       }return count;
   }

    public static void main(String[] args) {

    }
}

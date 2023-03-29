public class ReverseNum {
    public static void main(String[] args) {
        int num=34567;
        int temp=0;
        while(num!=0){
            int rem=num%10;
            temp=temp*10+rem;
            num/=10;

        }

        System.out.println(temp);
        
    }
}

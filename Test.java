public class Test {
    public static void main(String[] args) {
        int x=20;
        String str=(x<15)?"small":(x<22)?"tiny":"huge"; //tiny
        System.out.println(str);

        int a=0,b=0,c=0;

        a=(++a + b--)*c++; // (1+0)*0
        System.out.println(a);//0

        int p=5,q=2,exp=10;

        exp=exp % p+(p>6?++q:--q); //(10%5+1)=(0+1)=1
        System.out.println(exp);


        

        
}

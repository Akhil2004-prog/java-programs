public class Main5{
    public void f(String s,String h,String d,int n){
        if(n==1) {
            System.out.println("move"+n+"from"+s+"to"+d);
            return;
        }
       f(s,d,h,n-1);
        System.out.println("move"+n+"from"+s+"to"+d);
        f(h,s,d,n-1);
    }
    public static void main(String[] args){
        Main5 m=new Main5();
        int n=3;
        m.f("source","helper","dest",n);
    }
}
public class Main2{
public int fun(int n){
if(n<=1){
return n;
}
return fun(n-1)+fun(n-2);
}
public static void main(String[] args){
Main2 m=new Main2();
System.out.println(m.fun(4));
}
}

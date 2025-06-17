public class Main3{
public int f(int []a,int s,int i){
if (i==a.length){
	return s;
s=s+a[i];
return f(a,s,i+1);
}
}
public static void main(String[] args){
Main3 m=new Main3();
int a[]={1,2,3,4,5};
int s=0;
int i=0;
System.out.println(m.f(a,s,i));
}
}
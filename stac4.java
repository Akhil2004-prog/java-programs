import java.util.*;
public class stac4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack<>();
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        String a="";
        for(int i=0;i<s.length();i++){
            a=a+st.pop();
        }
        System.out.print(a);
    }
}
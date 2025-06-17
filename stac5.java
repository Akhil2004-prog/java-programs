import java.util.Stack;
public class stac5{
    public static void main(String [] args){
        
        Stack st=new Stack<>();
        String s="akhil";
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
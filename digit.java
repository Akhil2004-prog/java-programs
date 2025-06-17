import java.util.*;
public class digit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(Character.isDigit(ch)==true){
                System.out.println(" digits");
                System.exit(0);
          
        }
        
    }
    System.out.println(" not digits");
    }
}


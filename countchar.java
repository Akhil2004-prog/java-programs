import java.util.*;
public class countchar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char b=sc.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b){
                count+=1;
            }
            
        }
        
      System.out.println(count);
    } 
}
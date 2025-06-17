import java.util.*;
public class vowelcount{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
       int vowelcount=0;
       int  consonantcount=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelcount+=1;
        
            }
            else{
                consonantcount+=1;
            }
        }
        System.out.println(vowelcount);
        System.out.println(consonantcount);
        
    }
}

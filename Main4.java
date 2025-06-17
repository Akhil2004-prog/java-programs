public class Main4{
    public boolean f(String s,int i,int j){
        if (i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return f(s,i+1,j-1);
    }
    public static void main(String [] args){
        Main4 m=new Main4();
         String st="121";
        int i=0;
        int j=st.length()-1;
       
        System.out.println(m.f(st,i,j));
    }
}
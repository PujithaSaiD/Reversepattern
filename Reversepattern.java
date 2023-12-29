import java.util.*;
public class Reversepattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
        for(int j=0;j<l.size();j++){
            for(int k=l.get(j);k>0;k--){
                for(int m=l.get(j);m>k-1;m--){
                    System.out.print(m);
                }
                System.out.println();
            }
        }
        
    }
    
}


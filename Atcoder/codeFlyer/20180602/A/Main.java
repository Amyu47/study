
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=a;i++){
        	if(i%b==0){
        		ans = i;
        	}
        }
        System.out.println(ans);
    }
}

import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		int t = sc.nextInt();
 		int count = 0;
 		for(int i=0;i<n-1;i++){
 			count += sc.nextInt();
 		}       

 		if(count%t==0){
 			System.out.println(count/t);
 		}
 		else{
 			System.out.println(count/t+1);
 		}

    }
}

import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		int[] count = {8,10};
 		int now = 0;
 		int counter = 0;
 		while(count[0] > 0 && count[1] > 0){
 			if((int)Math.pow(9,count[0])>(int)Math.pow(6,count[1])){
 				now = 0;
 				if(n>(int)Math.pow(9,count[now])){
 					n -= (int)Math.pow(9,count[now]);
 					counter++;
 					System.out.print(Math.pow(9,count[now])+" ");
 				}
 				else{
 					count[now]--;
 				}
 			}
 			else{
 				now = 1;
 				if(n>(int)Math.pow(6,count[now])){
 					n -= (int)Math.pow(6,count[now]);
 					System.out.print(Math.pow(6, count[now])+" ");
 					counter++;
 				}
 				else{
 					count[now]--;
 				}
 			}
 		}
 		System.out.println(counter+n);
    }
}
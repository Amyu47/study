import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean flag = false;
		boolean judge = true;
		int count = 0;
		int counter = 0;
		int ans = 0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == '2'){
				counter++;
				ans = Math.max(ans, counter);
			}
			else{
				counter--;
			}
			if(counter<0){
				judge = false;
				break;
			}	
		}
		if(judge && counter == 0){
			System.out.println(ans);
		}
		else{
			System.out.println(-1);
		}
	}
}


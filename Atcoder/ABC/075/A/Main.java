import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b){
			System.out.println(c);
		}
		else if(a==c){
			System.out.println(b);
		}
		else{
			System.out.println(a);
		}
	}
}

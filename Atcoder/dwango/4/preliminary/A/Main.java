import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0)==s.charAt(2) && s.charAt(1)==s.charAt(3)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}


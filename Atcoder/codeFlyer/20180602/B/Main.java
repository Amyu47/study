
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
        int n = sc.nextInt();
        String s = sc.next();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i) == 'S'){
        		a = Math.max(0, a-1);
        	}
        	else if(s.charAt(i) == 'C'){
        		b = Math.max(0, b-1);
        	}
        	else{
        		if(a>=b){
        			a = Math.max(0, a-1);
        		}
        		else{
        			b = Math.max(0, b-1);
        		}
        	}
        }

        System.out.println(a);
        System.out.println(b);
    }
}
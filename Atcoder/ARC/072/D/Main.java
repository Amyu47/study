
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if(Math.abs(x-y)<=1){
        	System.out.println("Brown");
        }
        else{
        	System.out.println("Alice");
        }
    }
}
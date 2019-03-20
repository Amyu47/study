
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i=0;i<m;i++){
        	a[i] = sc.nextInt();
        	b[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        int[] z = new int[q];
        for(int i=0;i<q;i++){
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        	z[i] = sc.nextInt();
        }

        
        
    }
}
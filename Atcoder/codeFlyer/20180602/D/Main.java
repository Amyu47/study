
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] a = new boolean[n][m];
        boolean[] now = new boolean[2*n][m];
        int[] count = new int[n];
        int[] mcount = new int[n];
        for(int i=0;i<n;i++){
        	String s = sc.next();
        	for(int j=0;j<m;j++){
        		if(s.charAt(j)=='.'){
        			a[i][j] = false;
        		}
        		else{
        			a[i][j] = true;
        		}
        	}
        }

        for(int i=0;i<m;i++){
        	if(a[0][i]){
        		count[0]++;
        		now[i] = true;
        	}
        }

        for(int i=1;i<n;i++){
        	for(int j=0;j<m;j++){
        		if(a[i][j] || now[j]){
        			count[i]++;
        			now[j] = true;
        		}
        	}
        }


    }
}
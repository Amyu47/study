
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] a= new long[n];
        for(int i=0;i<n;i++){
        	a[i] = sc.nextLong();
        }
        long count = 0;
        for(int i=1;i<n-1;i++){
        	int left = -1;
        	int right = i;
        	int center = i;
        	while(right-left>1){
        		center = (right + left)/2;
        		if(a[i]-a[center]<=d){
        			right = center;
        		}
        		else{
        			left = center;
        		}
        	}
        	int x = right;
        	left = i;
        	right = n;
        	center = n;
        	while(right-left>1){
        		center = (right + left)/2;
        		if(a[center]-a[i]<=d){
        			left = center;
        		}
        		else{
        			right = center;
        		}
        	}
        	int z = right-1;
        	count += (long)(i - x) * (long)(z - i);
        }

        for(int i=0;i<n-2;i++){
        	int left = i;
        	int right = n;
        	while(right-left>1){
        		int center = (right + left) / 2;
        		if(a[center] - a[i]<=d){
        			left = center;
        		}
        		else{
        			right = center;
        		}
        	}
        	count -= (long)(right - 1 - i)*(long)(right - 2 - i)/2;
        }

        System.out.println(count);
    }
}


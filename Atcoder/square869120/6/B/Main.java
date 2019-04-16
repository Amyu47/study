
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
     	int n = sc.nextInt();
     	long[] a = new long[n];
     	long[] b = new long[n];
     	for(int i=0;i<n;i++){
     		a[i] = sc.nextLong();
     		b[i] = sc.nextLong();
     	}

     	Arrays.sort(a);
		Arrays.sort(b);

		long ans = 0;
		for(int i=0;i<n;i++){
			ans += (long)Math.abs(a[i]-a[n/2]) + (long)Math.abs(a[i]-b[i]) + (long)Math.abs(b[i]-b[n/2]);
		}     	


		System.out.println(ans);
    }
}
import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long z = sc.nextLong();
		long[] a = new long[n];
		//long maxdata = 0;
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
		}	
		long[] b = new long[n];
		for(int i=0;i<n;i++){
			if(z<a[i]){
				b[i] = gcd(a[i],z);
			}
			else{
				b[i] = gcd(z,a[i]);
			}
			//maxdata = Math.max(maxdata, b[i]);
		}
		/*int max = (int)Math.sqrt(maxdata)+2;
		boolean[] flag = new boolean[max];
		for(int i=2;i<max;i++){
			if(!flag[i]){
				flag[i] = true;
				long x = (long)i;
				list.add(x);
				for(int j=i*2;j<max;j+=i){
					flag[i] = true;
				}
			}
		}*/
		//System.out.println(max+" "+list.size());
		/*int[] maxcounter = new int[max+1];
		int counter = 0;
		for(int i=0;i<n;i++){
			counter = 0;
			for(int j=0;j<list.size();j++){
				long x = list.get(j);
				if(b[i]%x==0){
					//System.out.println(i+" "+b[i]+" "+x+" "+counter);
					counter++;
					b[i]/=x;
					j--;
				}
				else{
					maxcounter[(int)x] = Math.max(maxcounter[(int)x],counter);
					counter = 0;
				}
			}
		}*/

		long ans = 1;
		/*for(int i=2;i<=max;i++){
			if(maxcounter[i]!=0){
				ans *= i*maxcounter[i];
			}
		}*/
		for(int i=0;i<n;i++){
			ans = lcm(Math.max(ans,b[i]),Math.min(ans,b[i]));
		}
		System.out.println(ans);
		/*for(int i=0;i<n;i++){
			System.out.println(b[i]);
		}*/

	}

	public static long gcd(long a, long b){
		if(b== 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}

	public static long lcm(long m, long n){
		return m/gcd(m,n)*n;
	}
}

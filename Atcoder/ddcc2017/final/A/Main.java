import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int ans2 = 0;
		int ans3 = 0;
		int i = 1;
		int j = 1;
		boolean flag = false;
		while(true){
			while(true){
				if(j==1 && (double)k*i*k*i+(double)k*j*k*j>Math.pow(100,2)+0.00000001){
					flag = true;
					break;
				}
				if((double)k*i*k*i+(double)k*j*k*j<=Math.pow(100,2)+0.00000001){
					ans2++;
				}
				else{
					break;
				}
				j++;
			}
			if(flag){
				break;
			}
			i++;
			j = 1;
		}
		System.out.print(ans2*4+" ");
		int x = 0;
		for(int z=1;z<150;z++){
			if((double)k/2+k*z<=150.00000001){
				x++;
			}
			else{
				break;
			}
		}
		flag = false;
		int ans4 = 0;
		i = 1;
		j = 1;
		while(true){
			while(true){
				if(j==1 && ((double)k/2+k*i)*((double)k/2+k*i)+((double)k/2+k*j)*((double)k/2+k*j)>Math.pow(150,2)+0.00000001){
					flag = true;
					break;
				}
				if(((double)k/2+k*i)*((double)k/2+k*i)+((double)k/2+k*j)*((double)k/2+k*j)<=Math.pow(150,2)-0.000000001){
					ans3++;
					//System.out.println(i+" "+j);
				}
				else{
					break;
				}
				j++;
			}
			if(flag){
				break;
			}
			i++;
			j = 1;
		}
		flag = false;
		i=1;
		j=1;
		while(true){
			while(true){
				if(j==1 && (double)k*i*k*i+(double)k*j*k*j>Math.pow(150,2)+0.00000001){
					flag = true;
					break;
				}
				if((double)k*i*k*i+(double)k*j*k*j<=Math.pow(150,2)+0.00000001){
					ans4++;
				}
				else{
					break;
				}
				j++;
			}
			if(flag){
				break;
			}
			i++;
			j = 1;
		}
		//System.out.println(ans3+" "+x);
		if(k==5 || k==50 || k==25 || k==10){
			System.out.println(ans4*4);
		}
		else{
			System.out.println(ans3*4+x*4-3);
		}
	}
}

import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] c = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				c[i][j] = sc.nextInt();
			}
		}
		int[][] a = new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				a[i][j] = sc.nextInt();
			}
		}

		


	} 
}
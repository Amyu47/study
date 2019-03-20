public class CombinationByFermat {
	public static void main(String[] args) {
		
		long mod = (long) Math.pow(10, 9) + 7;
		FermatCombination com = new FermatCombination(5, mod);
		long num = com.combine(5, 3);
		System.out.println(num);
		
	}
}

class FermatCombination {
	
	long factrial[];
	long inverse[];
	long MOD;
	
	FermatCombination(int size, long mod) {
		
		this.factrial = new long[size + 1];
		this.inverse = new long[size + 1];
		this.MOD = mod;
		
		this.factrial[0] = 1;
		this.inverse[0] = 1;
		
		for (int i = 1; i <= size; i++) {
			factrial[i] = (factrial[i - 1] * i) % MOD;
			inverse[i] = pow(factrial[i], (int) MOD - 2) % MOD;
		}
	}
	
	long combine(int n, int k) {
		return factrial[n] * inverse[k] % MOD * inverse[n - k] % MOD;
	}
	
	long pow(long x, int n) { 
		long ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans = ans * x % MOD;
			}
			x = x * x % MOD;
			n >>= 1;
		}
		return ans;
	}
}
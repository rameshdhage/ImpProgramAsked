
public class PrimeNumber {
	
	public static void main(String[] args) {
		
	
	int num=7;
	int a=0;
	for(int i=2;i<=num-1;i++) {
		if(num%i==0) {
			a=a+1;
		}}
		
	if(a==0) {
		System.out.println("This is prime number" +num);
	}
	else {
		System.out.println("This is not prime number"+num);
	}
	}
	
	

}

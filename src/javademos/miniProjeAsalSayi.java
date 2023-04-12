package javademos;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		//sistemsel açıklara bug denir.
int number = -2;
int remainder = number%2;
System.out.println(remainder);
	boolean isPrime=true;
	
	if(number==1) {
	System.out.println("SayiAsalDeğildir");
	
	return;
	}
	if(number<1) {
		System.out.println("GeçersizSayı");
	}
	
	for (int i=2; i<number;i++) {
		if (number % i == 0) {
			isPrime = false;
		} 
	}
	if(isPrime) {
	System.out.println("SayıAsaldır");
	} else {
		System.out.println("SayiAsalDeğildir");
	
	}
	}
}

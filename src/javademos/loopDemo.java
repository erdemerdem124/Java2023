package javademos;

public class loopDemo {

	public static void main(String[] args) {
   //for
		for (int i=2;i<=10;i+=2) {
			System.out.println(i);
   }
		System.out.println("For Döngü Bitti");
		
		int i=2;
		//while
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		//dowhile
		int j=100;
		do {
			System.out.println(j);
			j+=1;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
}
}
package javademos;

public class reCapDemo2 {

	public static void main(String[] args) {
double[] myList = {1.3,1.7,1.8};
double total=0;
double max=myList[0];

 	for(int i=0;i<myList.length;i++) {
 		System.out.println(myList[i]);
 	}
 		for(double number:myList) {
 			if(max<number) {
 				max=number;
 			}
 			total=total+number;
 	 		System.out.println(number);
 	}
 		System.out.println("Total :"+total);
 		System.out.println("En büyük"+max);
	}

}

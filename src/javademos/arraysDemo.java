package javademos;

public class arraysDemo {

	public static void main(String[] args) {
String öğrenci1 ="Engin";
String öğrenci2 ="Derin";
String öğrenci3 ="Salih"; 

System.out.println(öğrenci1);
System.out.println(öğrenci2);
System.out.println(öğrenci3);

System.out.println("------------");
 
String[] öğrenciler= new String[4];
öğrenciler[0]="Engin";
öğrenciler[1]="Derin";
öğrenciler[2]="Salih";
öğrenciler[3]="ErDem";
//öğrenciler[4]="Ali";
for(int i=0;i<öğrenciler.length;i++) {
System.out.println(öğrenciler[i]);

	}
System.out.println("------------");

for(String öğrenci:öğrenciler){
	System.out.println(öğrenci);
}
}
}
package javademos;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int [] sayilar = new int[] {1,3,5,6,7,8};
		int aranacak=2;
		boolean varMi=false;
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		String mesaj="";
		if (varMi) {
			mesajVer("Sayi mevcut moruk:"+ aranacak);
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi mevcut değildir moruk:"+ aranacak);
		}
	}
		public static void mesajVer(String mesaj) {
			System.out.println(mesaj);
		}
	}


  package javademos;
//description açıklama tanım
//price fiyat"
//stockAmount stok adedi
public class Product {

	public Product (int id ,String name,String description,double price,int stockAmount,String renk ){
	}
//attribute veya field 
//public halka açık demek
//private özel demek

private int id;
String description;
double price ;
int stockAmount;
String kod;
String renk; 
String name;
//getter
public int getId() {
	return id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getStockAmount() {
	return stockAmount;
}
public void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}
public String getKod() {
	return this.name.substring(0,1)+id;

}
public String getRenk() {
	return renk;
}
public void setRenk(String renk) {
	this.renk = renk;
}
//setter
public void setId(int id) {
	id=id;
	//this varsa bu classa ait oldugunu gösteriyor.

System.out.println("Yapıcı blok çalıştı ");

}
}
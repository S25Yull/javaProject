package ch12;
import java.util.*;

class Product{}
class Tv1 extends Product{}
class Audio1 extends Product{}

public class Ex12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv1> tvList = new ArrayList<Tv1>();
		
		productList.add(new Tv1());
		productList.add(new Audio1());
		
		tvList.add(new Tv1());
		tvList.add(new Tv1());
		
		printAll(productList);
	}
public static void printAll(ArrayList<Product>list) {
	for(Product p : list)
		System.out.println(p);
}
}

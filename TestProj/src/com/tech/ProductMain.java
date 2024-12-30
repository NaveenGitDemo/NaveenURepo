package com.tech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //creating reference for product class
		List<Product> listOfProduct=new ArrayList<Product>();
		
		listOfProduct.add(new Product(101,"Book", 400.20d));
		listOfProduct.add(new Product(102,"shampoo", 500.70d));
		listOfProduct.add(new Product(103,"Powder", 900.50d));
		listOfProduct.add(new Product(104,"Book", 200.20d));
		listOfProduct.add(new Product(105,"Book", 100.20d));
		
		// find lowest price among all product using stream api
		
Product	lowestPriceProd	=listOfProduct.stream()
		.min((p1,p2) -> {return (p1.getProdPrice() > p2.getProdPrice())?1 :(p1.getProdPrice() > p2.getProdPrice())?-1:0 ;})
		.get();

System.out.println(" Lowest price product : "+lowestPriceProd);
// average price for book
 Long avgPriceOfBook= listOfProduct.stream().collect(Collectors.averagingDouble(Product :: getProdPrice)).longValue();
 System.out.println(avgPriceOfBook);
 //max price of each book
 Map<String,Double> bookByMaxPrice = listOfProduct.stream().collect(Collectors.groupingBy(Product :: getProdName , Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product :: getProdPrice)), value -> value.get().getProdPrice())));
 System.out.println(bookByMaxPrice);

      // create map where key is product id and value is object of product

Map<Integer, Product> mapProd=listOfProduct.stream().collect(Collectors.toMap(Product :: getProdId, Function.identity()));

System.out.println(" Map of Product  "+mapProd);

mapProd.forEach((k, v) -> System.out.println(" product id : "+k +" product associate with id : "+v));

// filter by book and lowest price

Product lowestPriceFromBook=listOfProduct.stream().filter(p ->  p.getProdName().equals("Book") ).min((p1,p2) -> p1.getProdPrice().compareTo(p2.getProdPrice())).get();

System.out.println(" lowest price from Book product : "+lowestPriceFromBook);

// count each product by name

Map<String, Long > mapOfP=listOfProduct.stream().collect(Collectors.groupingBy(Product :: getProdName , Collectors.counting()));

System.out.println(" Product count by name of each product  "+mapOfP);

// sum of all price
Double sumofP=listOfProduct.stream().collect(Collectors.averagingDouble(Product :: getProdPrice));
System.out.println(" sum of price "+sumofP);

// max of all prod by name 
Map<String, Object> prod=listOfProduct.stream().collect(Collectors.groupingBy(Product :: getProdName ,
		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product :: getProdPrice)), p -> p.get())));
System.out.println(" max of prod by name or category  "+prod);

// joining is Product name by  ,

String concatProdByName=listOfProduct.stream().map( p -> p.getProdName()).collect(Collectors.joining(","));
System.out.println("  product name concated  "+concatProdByName);

// max value among all prod
Product prodMaxP=listOfProduct.stream().max(Comparator.comparing(Product :: getProdPrice)).get();
System.out.println(" max prod value : "+prodMaxP);

// get product id among all product
List<Integer> productIdList=listOfProduct.stream().map(product -> product.getProdId() ).collect(Collectors.toList());
System.out.println(productIdList);
// approach 2 for the same
List<Integer> productList=new ArrayList<>();
listOfProduct.forEach(product -> productList.add(product.getProdId()));
System.out.println(" from second approach : "+productList);

// min value of among all product 
Product minProductPrice=listOfProduct.stream().min(Comparator.comparing(Product :: getProdPrice)).get();

System.out.println(" Minimum product price is : "+minProductPrice);
Map<Boolean,List<Product>> booleanMap=listOfProduct.stream().collect(Collectors.partitioningBy(product -> product.getProdName().equals("Book")));
 // System.out.println(" Minimum product price is : "+ids);
booleanMap.forEach((k,v) ->{
	                      if(k == true) {
                          System.out.println(" k "+k +" v "+v);
	                      v.forEach(System.out :: println);
	                      }
						}
		);

Product maxprodpriceValue=listOfProduct.stream().max(Comparator.comparing(Product :: getProdPrice)).get();
System.out.println(" Max Product Price id and  value is  "+maxprodpriceValue.getProdId() + " : "+maxprodpriceValue.getProdPrice());
	
	}

}

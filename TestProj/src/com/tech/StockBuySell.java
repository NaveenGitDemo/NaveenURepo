package com.tech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Interval{
	
	int buy,sell;
}

class findIndexOfProfitBuyAndSell{
	
	void stockBuySell(int [] price, int n){
		
		
		// Prices must be given for at least  
        // two days 
        if (n == 1) 
            return; 
  
        int count = 0; 
  
        // Solution array 
        ArrayList<Interval> sol =  
                  new ArrayList<Interval>(); 
        
        // store price as well of stock
        ArrayList<Interval> stockPrice =  
                new ArrayList<Interval>(); 
  
        // Traverse through given price array 
        int i = 0; 
        while (i < n - 1)  
        { 
            // Find Local minima. Note that the  
            // limit is (n-2) as we are comparing  
            // present element to the next element. 
            while ((i < n - 1) && ( price[i] >= price[i + 1])) {
                i++; 
            }
            // If we reached the end, break as no  
            // further solution possible 
            if (i == n - 1) 
                break; 
  
            Interval e = new Interval(); Interval e1 = new Interval(); 
            e1.buy = price[i];
            e.buy = i++; 
            // Store the index of minima 
            
            // Find Local maxima.  Note that the  
            // limit is (n-1) as we are comparing  
            // to previous element 
            while ((i < n ) && (price[i] >= price[i - 1])) {
                i++; 
            }
            // Store the index of maxima 
            e.sell = i - 1; e1.sell=price[i-1];
            sol.add(e); 
            stockPrice.add(e1);
            // Increment number of buy/sell 
            count++; 
        } 
  
        // print solution 
        if (count == 0) {
            System.out.println( 
            "There is no day when buying the stock " +  
            "will make profit"); 
        }else {
            for (int j = 0; j < count; j++) 
                System.out.println( 
                "Buy on day: " + sol.get(j).buy +  
                "        " + "Sell on day : " +  
                sol.get(j).sell); 
        stockPrice.forEach(interval -> System.out.println("Stock buy at price "+interval.buy + " Stock sell at price  "+interval.sell));
      Interval minBuy  =stockPrice.stream().collect(Collectors.minBy((Comparator.comparingInt((e) -> {return e.buy;})))).get();
      Interval maxSell =stockPrice.stream().collect(Collectors.maxBy(Comparator.comparing((e) -> {return e.sell;}))).get();
      int maxProfit = maxSell.sell - minBuy.buy ;
      System.out.println(" Maximum profit can get : "+maxProfit);
        }
        return; 
		
	}
	
	
	
}

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findIndexOfProfitBuyAndSell stock = new findIndexOfProfitBuyAndSell(); 
		  
        // stock prices on consecutive days 
        int price[] = {100, 180, 260,  
                       310, 40, 535, 695}; 
        int n = price.length; 
  
        // function call 
        stock.stockBuySell(price, n); 

	}

}

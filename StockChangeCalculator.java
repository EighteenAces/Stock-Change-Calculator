import java.util.Scanner;

public class StockChangeCalculator{

    static Scanner input = new Scanner(System.in);
    static double stockValueDay1;
    static double stockValueDay2;
    static double stockDifference;
    static double calculatedChange;
    public static void main(String[] args) {
        
        String symbol;

        StockChangeCalculator calPercent = new StockChangeCalculator();

        try{
            System.out.println("Enter the stock symbol: ");
            symbol = input.nextLine();
    
            System.out.println("Enter" + " " + symbol + "'s  day1 value:");
            stockValueDay1 = input.nextDouble();
            
            System.out.println("Enter" + " " + symbol + "'s  day2 value:");
            stockValueDay2 = input.nextDouble();

            calPercent.percentChange();
            System.out.println(symbol + " " + "has changed" + " " + calculatedChange + " " + "%"  + " " + "in one day");
        }
        catch(Exception e){

            System.out.println("Wrong input! Please try again!");
        }

    }
    
    public double percentChange(){

        try{

            if(stockValueDay2 < stockValueDay1){

                stockDifference = stockValueDay2 - stockValueDay1;
                calculatedChange = stockDifference/stockValueDay1 * 100;
            }
            return calculatedChange;
        }
        catch(Exception e){
            
            System.out.println("error!");
        }
        return calculatedChange;
        
    }
    
}


package Loops;

public class Tax {
    public static void main(String[] args) {
        double[] prices ={8.99,9.66,8.33,6.33};
        double[]afterTax = new double[prices.length];
        for(int i =0 ; i<afterTax.length ; i++){
            afterTax[i] = prices[i] + prices[i]*0.13;
        }
        for(int i = 0;i<afterTax.length;i++){
            System.out.println(afterTax[i]);
        }

    }
    
}

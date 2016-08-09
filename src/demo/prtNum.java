package demo;

import java.util.ArrayList;
import java.util.List;

public class prtNum {
	   public static List<Integer> numbersByRecursion(int n) throws InterruptedException {
	        // write your code here
		   
	        List<Integer> ret = new ArrayList<Integer>();
	        if(n==0)
	            return ret;
	        else
	        {
	        	ret.addAll(numbersByRecursion(n-1));
	        	int num = (int) Math.pow(10, n);
		        for( int i = (int) Math.pow(10, n -1) ; i < num ; i ++ )
		        {
		            ret.add(i);
		        }
		       return ret;
	        }
	        
	    }
	   public static List<Integer> numberRecursion(int n)
	   {
		   List<Integer> ret = new ArrayList<Integer>();
		   int num = (int) Math.pow(10, n);
	        for( int i = (int) Math.pow(10, n -1) ; i < num ; i ++ )
	        {
	            ret.add(i);
	        }
		   return ret;
	   }
	   
	   public static void main(String args[]) throws InterruptedException
	   {
		   List<Integer> t = prtNum.numbersByRecursion(2);
		   for(int i = 0 ; i < t.size() ; i++)
		   {
			   System.out.println(t.get(i)); 
		   }
	   }
}

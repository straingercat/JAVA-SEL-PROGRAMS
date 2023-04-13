package PRACTICENEW2023;

public class Excluding_numbers {

	public static void main(String[] args) {

      int a[]= {2,4,6,8,10,3};
       
      for(int i=0;i<a.length;i++)
      {
    	  if (a[i]%2!=0)
    	  {
    		  System.out.println(a[i]);
    	  }
      }

	}

}

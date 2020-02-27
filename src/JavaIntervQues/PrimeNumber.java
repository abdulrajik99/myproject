package JavaIntervQues;

public class PrimeNumber
{
	public static void main(String[] args) 
	{
	 for(int i=2;i<50;i++)
	 {
	    int count=1;
	    for(int j=2;j<i;j++)
	    {
	        if(i%j ==0)
	        {
	          count=0;
	          break;
	        }
        }
	     if(count==1)
	     {
	      System.out.println(i);
         }
	     
	 }
	}
}



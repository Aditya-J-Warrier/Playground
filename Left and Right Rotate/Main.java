import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int temp1 = 0, temp2 = 0;
		int n = obj.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = obj.nextInt();
		}
        int rot = obj.nextInt();
		       if (n%2==0)
		    {
		        for(int r=1;r<=rot ;r++)
		      {
		        temp1 = arr[1];
		        for(int j=3;j<=n-1;j=j+2)
		        {
		            arr[j-2] = arr[j];
		        }
		        arr[n-1] = temp1;
		      
		    
	    	  
	    	    temp2 = arr[n-2];
		        for(int j=n-2;j>=2;j=j-2)
		        {
		            arr[j] = arr[j-2];
		        }
		        arr[0] = temp2;
		      
		    }
		  }
		  else
		  {
		      for(int r=1;r<=rot ;r++)
		      {
		        temp1 = arr[1];
		        for(int j=3;j<=n-1;j=j+2)
		        {
		            arr[j-2] = arr[j];
		        }
		        arr[n-2] = temp1;
		      
		    
	    	  
	    	    temp2 = arr[n-1];
		        for(int j=n-1;j>=2;j=j-2)
		        {
		            arr[j] = arr[j-2];
		        }
		        arr[0] = temp2;
		      
		    }
		  }
		
		for(int i=0;i<n;i++)
		{
		   System.out.print(arr[i]+" ");
		}
      
    }
}
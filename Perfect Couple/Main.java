import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner obj = new Scanner(System.in);
      int n = obj.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
      {
		arr[i] = obj.nextInt();
      }
      int val = obj.nextInt();
      for(int i=0;i<n-1;i++)
      {
		for(int j=i;j<n;j++)
        {
			int sum = arr[i]+arr[j];
          	if (sum == val)
            {
              System.out.println(arr[i]+", "+arr[j]);
            }
        }
      
        }
    }
}
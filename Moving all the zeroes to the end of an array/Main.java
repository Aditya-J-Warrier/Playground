import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner obj = new Scanner(System.in);
       int k=0,j=0;
       int n = obj.nextInt();
       int arr[] = new int[n];
       int zer[] = new int[n];
       int nonz[] = new int[n];
       for(int i=0; i<n;i++)
         arr[i] = obj.nextInt();
       for(int i=0;i<n;i++)
       {
         if (arr[i]==0)
         { zer[j] = arr[i];
           j++;
         }
         else
         { nonz[k] = arr[i];
           k++;
         }
       }
       for(int i=0; i<k;i++)
       {
			System.out.print(nonz[i]+" ");
       }
       for(int i=0; i<j;i++)
       {
			System.out.print(zer[i]+" ");
       }
    }
}
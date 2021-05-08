import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    char ch = in.next().charAt(0);
    int key = in.nextInt();
    if(ch >= 'a'){
      if(ch-key < 'a')
        ch = (char)(124 - key + 1);
      else
        ch = (char)(ch - key);
    }
    else {
       if(ch-key < 'A')
        ch = (char)(90 - key + 1);
      else
        ch = (char)(ch - key); 
    }
    System.out.print(ch);
  }
}
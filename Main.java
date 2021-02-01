import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from: ");
    int number = s.nextInt();

    if(number > 0) {
      while(number != 0) {
        number--;
        System.out.println(number);
      }
    }  
    else if(number < 0) {
      while(number != 0) {
        number++;
        System.out.println(number);
      }
    }
    else {
    }
    System.out.println("Blast off!");
  }
}
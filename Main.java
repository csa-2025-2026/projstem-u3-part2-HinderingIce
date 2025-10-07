import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    System.out.println("Give double:");
    double input = scan.nextDouble();
    if(input == 12.345) {System.out.println("true");} else {System.out.println("false");}

    System.out.println("Give int:");
     input = scan.nextInt();
    if(input == 46) {System.out.println("true");} else {System.out.println("false");}

    System.out.println("Give 2 int:");
     input = scan.nextInt();
     double input2 = scan.nextInt();
    if(input == 0.5(input2)) {System.out.println("true");} else {System.out.println("false");}

    System.out.println("Give int:");
     input = scan.nextInt();
     if(input%2 == 0) {System.out.println("divisible by 2");} else {System.out.println("false");}
     if(input%3 == 0) {System.out.println("divisible by 3");} else {System.out.println("false");}
    
    System.out.println("Give int:");
     input = scan.nextInt();
    if(input%2 == 0) {System.out.println("even");} else {System.out.println("odd");}

    System.out.println("Give letter:");
    input = scan.nextString();
    if(input.equals(A))
    {
      System.out.println("90 - 100:");
    {
    else
    {
      if(input.equals(B))
      {
        System.out.println("80 - 90:");
      }
      else
      {
        if(input.equals(C))
        {
          System.out.println("70 - 80:");
        }
        else
        {
          if(input.equals(D))
          {
            System.out.println("60 - 70:");
          }
          else
          {
            if(input.equals(F))
            {
              System.out.println("0 - 60:");
            }
            else
            {
              System.out.println("Invalid letter grade");
            }
          }
        }
      }
    }
    
    int x1 = (Math.random() * 50);
    int x2 = (Math.random() * 49 + 51);
    System.out.println( x1 + " + " + x2 " = ");
    input = scan.nextString();
    if(input == x1+x2)
    {System.out.println("True");}
    else
    {System.out.println("False");}

    System.out.println("Body temp?: ");
    input = scan.nextInt();
    if{input >= 97 && input<= 99 }
    {
      System.out.println("Normal");
    }
    else
    {
      System.out.println("Not normal");
    }


    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}

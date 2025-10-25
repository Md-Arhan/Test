/*Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string 
*/

public class Problem_1 {

  static class Calculator {
    double a;
    double b;
    String operation;

    Calculator(double a, double b, String operation) {
      this.a = a;
      this.b = b;
      this.operation = operation;
    }

    public double evaluation() {
      switch (operation) {
        case "Addition":
          return a + b;
        case "Subtraction":
          return a - b;
        case "Multiplication":
          return a * b;
        case "Division":
          if (b != 0) {
            return a / b;
          } else {
            System.out.println("Dividend cannot be zero.");
            return 0;
          }
        default : 
          System.out.println("Not a valid operatiion");
          return 0;
      }
    }
  }

  public static void main(String[] args) {
     Calculator calc = new Calculator(12, 12, "Division");
     double res = calc.evaluation();
     System.out.println(res);
  }
}


// The Time Complexity of this code is O(1) because it performs constant time operations.
// The Space Complexity of this code is O(1).
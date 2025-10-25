/*Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1, 3
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5, 7
    .
    .
    5) input a = x, then output : 1, 3, 5, 7, ....... 
*/


import java.util.Scanner;

public class Problem_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int numbers = 1;

        for(int i=1; i<=n; i++){
            System.out.print(numbers + " ");
            numbers+=2;
        }
    }
}


// The Time Complexity of this problem is going to be O(n) where n is the input given by the user.
// The Space Complexity is going to be O(1), because we have not use any extra space.
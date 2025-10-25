/*Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
 */


import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int number = 1;

        if(n % 2 == 0){
            n--;
        }

        for(int i=1; i<=n; i++){
            System.out.print(number + " ");
            number+=2;
        }
        
    }
}


// The time Complexity of this problem is O(n) where the n is the input, if the given input is even then we reduce it by 1 to make it odd.
// The Space Complexity of this problem is O(1).
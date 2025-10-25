/*Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
 {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
 */


public class Problem_4 {

    public static void main(String[] args) {

        int num[] = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
        int m = num.length;

        int ans[] = new int[9];

        for(int i=0; i<9; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(num[j] % (i+1) == 0){
                    count++;
                }
            }
            ans[i] = count;
        }

        for(int i=0; i<9; i++){
            System.out.print( i+1 + ":" + ans[i] + " ");
        }
    }
}


// This code Time Complexity is going to be O(9n) where the constant are ignored so the tc = O(n).
// The Space Complexity of this code is going to O(n) because we are using ans array to print the result.
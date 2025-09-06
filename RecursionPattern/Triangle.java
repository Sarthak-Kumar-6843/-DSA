package RecursionPattern;

public class Triangle {
    public static void main(String[] args) {
        print2(4,0);

    }
    static void print(int r, int c){
        if(r == 0){
            return;
        }
        if( c < r){
            System.out.print("*");
            print(r,c+1);
        }else {
            System.out.println();
            print(r - 1, 0);
        }
    }

    static void print2(int r, int c){
        if(r == 0){
            return;
        }
        if( c < r){
            print(r,c+1);
            System.out.print("*");
        }else {
            print(r - 1, 0);
            System.out.println();
        }
    }

    static void bubble(int[] arr, int r, int c) {
        // Base case: if only one element is left, stop
        if (r == 0) {
            return;
        }

        // If we are still in the current pass
        if (c < r) {
            if (arr[c] > arr[c + 1]) {  // ✅ Fix comparison: swap if current > next
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            // Continue the same row
            bubble(arr, r, c + 1);
        } else {
            // Move to next row, reset column to 0
            bubble(arr, r - 1, 0);
        }
    }
    }


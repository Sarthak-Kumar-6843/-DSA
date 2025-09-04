package Recursion;

public class Occurence {
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }

    public static void findOccurence(String str, int idx, char element) {
        // base case: when index reaches end
        if (idx == str.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        char currChar = str.charAt(idx);

        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        // recursive call
        findOccurence(str, idx + 1, element);
    }
}

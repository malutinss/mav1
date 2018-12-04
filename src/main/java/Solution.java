import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());

        int[] arr = new int[1000];
        Arrays.fill(arr, 50);
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().freeMemory());


    }
}

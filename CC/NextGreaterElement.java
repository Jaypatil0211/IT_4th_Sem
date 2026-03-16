public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        System.out.println(max);
        int SL = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val>SL && val<max) {
                SL = val;
            }
        }
        System.out.println(SL);
    }
}

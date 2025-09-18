public class AllEqual {
    /**
     * Check if all 3 numbers a, b, c are equal.
     * @param args is arguments.
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a == b && b == c) {
            System.out.print("all equal");
        } else {
            System.out.print("not all equal");
        }
    }
}

public class HowMany {
    /**
     * used to print variable number of command line arguments.
     * @param args is arguments.
     */
    public static void main(String[] args) {
        int a = args.length;
        System.out.print("There ");
        if (a == 1 || a == 0) {
            System.out.print("is " + a + " argument.");
        } else {
            System.out.print("are " + a + " arguments.");
        }
    }
}

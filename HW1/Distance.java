public class Distance {
    /**
     * used to calculate the distance between 2 points (a,b) and (0,0).
     * @param args is arguments.
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.print("Distance between two points ("+ x + "," + y + ") and (0,0) is : " + d);
    }
}

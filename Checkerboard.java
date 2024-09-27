public class Checkerboard {
    public static void main(String[] args) {
        int n = Math.abs(Integer.parseInt(args[0]));
        if (n == 0) n = 1;
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0, n);

        boolean x = true;
        boolean even = n % 2 == 0;
        double len = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x) StdDraw.setPenColor(StdDraw.BLUE);
                else StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                double xCoord = i * len + len / 2;
                double yCoord = j * len + len / 2;
                StdDraw.filledSquare(xCoord, yCoord,
                                     len / 2);
                x = !x;
            }
            x = even != x;
        }
        StdDraw.show();
    }
}

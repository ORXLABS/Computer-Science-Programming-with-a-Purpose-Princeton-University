public class RevesPuzzle {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        reves(n, "a", "b", "c", "d");
    }

    private static void hanoi(int n, int k, String from, String to,
                              String temp) {
        if (n != 0) {
            hanoi(n - 1, k, from, temp, to);
            print(n + k, from, to);
            hanoi(n - 1, k, temp, to, from);
        }
    }

    private static void reves(int n, String from, String temp1,
                              String temp2, String to) {
        if (n == 1)
            print(n, from, to);
        else {
            int k = (int) Math.round((double) n + 1 - Math.sqrt(2 * (double) n + 1));
            reves(k, from, temp2, to, temp1);
            hanoi(n - k, k, from, to, temp2);
            reves(k, temp1, from, temp2, to);
        }
    }

    private static void print(int n, String from, String to) {
        StdOut.printf("Move disc %d from %S to %S%n", n, from, to);
    }
}

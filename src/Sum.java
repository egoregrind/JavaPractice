public class Sum {
    public static void main(String[]args) {
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }

        System.out.println(sum);
    }
}

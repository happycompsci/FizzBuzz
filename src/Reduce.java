public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int initial = 100;
        while (initial != 0) {

            // Find out which numbers divide i.
            boolean divisibleBy2 = initial % 2 == 0;

            // Print our appropriate result.
            if (divisibleBy2) {

                initial = initial / 2;
                count = count + 1;

            } else if (!divisibleBy2){

                initial = initial - 1;
                count = count + 1;
            }
    }System.out.println(count);
}
}

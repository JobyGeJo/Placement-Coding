public class reducedSubtraction {
    public static void main(String[] args) {
        int number = 9756;
        int tempNumber, left, right;

        while (number > 9) {
            tempNumber = number;
            number = 0;

            while (tempNumber > 9) {
                left = tempNumber % 10;
                right = (tempNumber % 100) / 10;

                if (left > right)
                    number = number * 10 + left - right;
                else
                    number = number * 10 + right - left;

                tempNumber /= 10;
            }
        }

        System.out.println(number);
    }
}

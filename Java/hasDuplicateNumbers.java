public class hasDuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 2, 7, 3, 8};
        boolean hasDuplicate;

        for (int i=0; i<numbers.length; i++) {

            if (numbers[i] == -1)
                continue;

            hasDuplicate = false;
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                    hasDuplicate = true;
                }
            }
            
            if (hasDuplicate)
                System.out.println(numbers[i]);

        }
    }
}

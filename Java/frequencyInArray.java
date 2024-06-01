public class frequencyInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 2, 7, 3, 8};
        int count;

        for (int i=0; i<numbers.length; i++) {

            if (numbers[i] == -1)
                continue;

            count = 1;
            for (int j=i+1; j<numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[j] = -1;
                    count ++;
                }
            }
            
            System.out.println(numbers[i] + " --> " + count);
        }
    }
}

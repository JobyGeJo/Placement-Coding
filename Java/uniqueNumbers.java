

public class uniqueNumbers {
    public static void main(String[]agrs) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 2, 7, 3, 8};
        boolean notUnique = false;

        for (int i=0; i<numbers.length; i++) {
            notUnique = false;

            if (numbers[i] == -1)
                continue;

            for (int j=i+1; j<numbers.length; j++) {

                if (numbers[i] == numbers[j]){
                    notUnique = true;
                    numbers[j] = -1;
                }

            }

            if (notUnique) 
                notUnique = false;
            else
                System.out.println(numbers[i]);

        }
    }
}
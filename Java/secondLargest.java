public class secondLargest {
    public static void main(String[]agrs) {
        int numbers[] = {1, 2, 3, 3, 4, 9, 2, 7, 3, 8};
        int firstLargest = 0, secondLargest=-1;

        for (int i: numbers){
            if (firstLargest < i) {
                secondLargest = firstLargest;
                firstLargest = i;
            }
            else if (secondLargest < i)
                secondLargest = i;
        }

        System.out.println(secondLargest);
    }
}

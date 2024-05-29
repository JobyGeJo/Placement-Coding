public class addOddIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 2, 7, 3, 8};
        int Sum = 0;

        for (int i=1; i<numbers.length; i+=2) 
            Sum += numbers[i];

        System.out.println(Sum);
    }
}
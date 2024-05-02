public class reverseArray {
    public static void main(String[]agrs) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 2, 7, 3, 8};
        int temp, length=numbers.length;

        System.out.print("{");
        for (int i=numbers.length-1; i>0; i--) 
            System.out.print(numbers[i] + ", ");
        System.out.println(numbers[0] + "}");

        for (int i=0; i<(length/2); i++) {
            temp = numbers[i];
            numbers[i] = numbers[length-i-1];
            numbers[length-i-1] = temp; 
        }

        for (int i: numbers)
            System.out.print(i + " ");
    }
}
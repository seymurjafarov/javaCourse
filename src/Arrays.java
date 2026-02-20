public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        System.out.println(numbers[5]);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=i+1;
        }

        for (int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}

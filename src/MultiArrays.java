public class MultiArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                counter++;
                arr[i][j]=counter;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

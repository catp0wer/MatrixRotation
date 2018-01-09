public class App {

    public static void main(String[] args) {

        int[][] my_array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        matrixRotation matrix = new matrixRotation();
        System.out.println("Initial array is: ");
        matrix.printArray(my_array);
        System.out.println("Rotated array is: ");
        int [][] result = matrix.Rotation(my_array);
    }
}

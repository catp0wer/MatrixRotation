public class matrixRotation {

    private int [][] rotated_array = new int [3][3];
    private int numberOfRotations = 2;
    private int count = 0;

    public int [][] Rotation(int[][] my_array){

        for(int col = 0 ; col < my_array.length; col++){
            int k=0;
            for(int row = my_array.length-1; row>=0;row--) {
                rotated_array[col][k] = my_array[row][col];
                k++;
            }
            }printArray(rotated_array);
        return rotated_array;

        }

    public static void printArray(int[][] my_array){
        for(int i=0; i<my_array.length;i++){
            for(int j=0; j<my_array.length;j++){
                System.out.format("%d ", my_array[i][j]);
            }System.out.println();
        }
    }
}

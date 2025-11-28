package Arrays;

class PKG{
    public static void printThreeD(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

public class JavaArray {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = "mango";
        arr[3] = "orange";

        String[] fruits = {"apple","jam","avocado","mosambbi","bee"};
        int i= 0;
        for(String fr : fruits){
            System.out.println(i++ +" : "+fr);
        }

        float[] prices = {7.6f,56.7f,67.3f,6};
        for(float p:prices){
            System.out.println(p);
        }
        
        int[][] matrix = {
            {23,45,34},
            {21,12,3},
            {11,15,8}            
        };

        PKG.printThreeD(matrix);

    }
}

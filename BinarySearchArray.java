import java.util.*;

public class BinarySearchArray {

    public static boolean checkIfPresentinArray(int[] array,int find){
        Arrays.sort(array);
        int left =0;
        int right = array.length-1;
        int middle = array.length/2;
        if(find > array[right]) {
            System.out.println("Out of array");
            return false;
        }
        while (true){
            System.out.println("Left = "+left+" Right = "+right);
            if (left >= right){
                System.out.println("Not in array");
                return false;
            }
            if(array[middle]== find){
                return true;
            }
            if(array[middle]< find){
                left = middle + 1;
                middle = (left+right)/2;
            } else if (array[middle]>find){
                right = middle - 1;
                middle = (left+right)/2;
            }
        }


    }

    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,20,30,40};
        System.out.println(checkIfPresentinArray(testArray,50));
    }

}
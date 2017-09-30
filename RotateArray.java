public class RotateArray {
    public static void main(String[] args) {
        int[] num = {4,5,8,9,15,20,24,35,78,86,192,200};
        rotateArray(num,4);
    }

    private static void rotateArray(int[] input,int places) {
        int len = input.length;

        if(places > len) {
            places = places % len;
        }

        if(places < len && places > 0) {
            reverseinPlaceArray(input, 0, len - 1);
            reverseinPlaceArray(input, 0, len - places - 1);
            reverseinPlaceArray(input, len - places, input.length - 1);
        }
        printAll(input);
    }

    private static void reverseinPlaceArray(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[start];
            input[start++] = input[end];
            input[end--] = temp;
        }
    }

    private static void printAll(int[] num) {
        for(int i = 0; i < num.length; i++){
            System.out.print("\t" + num[i]);
        }
        System.out.println();
    }
}
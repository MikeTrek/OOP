public class Sort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 15, 4};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) ;
            min = arr[i];

            //System.out.println(min);
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double s = sum/arr.length;
        System.out.print(s);
    }



}
package bubblesort;

public class BubbleSortMain {

    public static void main(String[] args) {

        //Working
        bubbleSortImplemenation();

    }

    private static void bubbleSortImplemenation() {
        int[] intArray = {20, 18 , 17 , 16 , -20 , 190 , 5 , 9 , 99, -120} ;

        int iteration = 0;

        for(int unsortedArrayLastIndex = intArray.length-1 ; unsortedArrayLastIndex > 0; unsortedArrayLastIndex--){
        //    unsortedArrayLastIndex >= 0 ; last unwanted comparision ; it is like sorting the already sorted
            iteration = iteration+1;
            System.out.println("unsortedArrayLastIndex="+unsortedArrayLastIndex);
            System.out.println("iteration="+iteration);

            for(int i=0; i<unsortedArrayLastIndex ; i++ ){
            //    i <= unsortedArrayLastIndex results in ArrayIndexOutOfBound Exception as intArray[i+1] is there

                iteration = iteration+1;
                System.out.println("unsortedArrayLastIndex="+unsortedArrayLastIndex);
                System.out.println("iteration="+iteration);

                if(intArray[i] > intArray[i+1]){
                    swap(intArray , i , i+1);
                }

            }

        }

        System.out.println("********After Sort*********");
        for (int n=0; n < intArray.length ; n++){
            System.out.println(intArray[n]);
        }
    }

    private static void swap(int[] intArray, int i, int j) {
        if(intArray[i] == intArray[j]){
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }


}

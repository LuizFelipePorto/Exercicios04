import java.util.Arrays;

public class Main {

    /*MERGE-SORT(L: List with n elements) : Ordered list with n elements
    IF (list L has one element)
    RETURN L.
    Divide the list into two halves A and B.
            A ← MERGE-SORT(A).
    B ← MERGE-SORT(B).
    L ← MERGE(A, B).
    RETURN L.*/

    public static void main(String[] args) {

       int[] entry = {5, 3, 6};
       mergeSort(entry);

    }



    public static int[] mergeSort (int[] elements){

        if(elements.length == 1){
            return elements;
        }else {
            int[] firstHalf = Arrays.copyOfRange(elements, 0, elements.length / 2);
            int[] secondHalf = Arrays.copyOfRange(elements, (elements.length / 2), elements.length);

            if (firstHalf.length > 2 && secondHalf.length > 2) {
                mergeSort(firstHalf);
                mergeSort(secondHalf);
            }
            int[] finalArray = new int[firstHalf.length + secondHalf.length];
            System.arraycopy(firstHalf, 0, finalArray, 0, firstHalf.length);
            System.arraycopy(secondHalf, 0, finalArray, firstHalf.length, secondHalf.length);
            System.out.println(Arrays.toString(finalArray));
            return finalArray;

        }
    }
}


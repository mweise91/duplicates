//Remove duplicates in a sorted array

public class removeDuplicates {
    private static int[] removeDuplicate (int[] arry){
        int newArray[] = new int[5];
        int j = 0;

        for (int i = 0; i < arry.length-1; i++){
            if(arry[i] != arry[i+1]){
                newArray[j++] = arry[i];
            }
        }
        newArray[j] = arry[arry.length-1];

        return newArray;
    }

    public static void main(String[] args){
        int array[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int newArray[] = removeDuplicate(array);

        for (int i = 0; i <newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}

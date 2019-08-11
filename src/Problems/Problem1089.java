package Problems;

public class Problem1089 {
    public int[] duplicateZeros(int[] arr) {
        int[] original = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            original[i] = arr[i];
        }
        int arrIndex = 0;
        int originalIndex = 0;
        while (arrIndex < arr.length) {
            System.out.println(originalIndex);
            if (original[originalIndex] == 0) {
                System.out.println("ok");
                arr[arrIndex] = 0;
                arrIndex++;

                if (arrIndex < arr.length) {
                    arr[arrIndex] = 0;
                }

                originalIndex ++;
                arrIndex++;
            } else {
                arr[arrIndex++] = original[originalIndex++];
            }
        }
        return arr;
    }
}

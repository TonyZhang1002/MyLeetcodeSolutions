package Problems;

public class Problem1385 {
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int answer = 0;

        for (int a : arr1) {
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    answer--;
                    break;
                }
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 5, 8};
        int[] arr2 = new int[] {10,9,1,8};
        System.out.println(findTheDistanceValue(arr1, arr2, 2));
    }
}

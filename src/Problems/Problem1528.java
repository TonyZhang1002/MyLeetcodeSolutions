package Problems;

public class Problem1528 {
    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices.length;j++) {
                if (indices[j] == i) {
                    sb.append(s.charAt(j));
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int []{4,5,6,7,0,2,1,3}));
    }
}

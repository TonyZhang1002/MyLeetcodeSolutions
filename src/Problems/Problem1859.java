package Problems;

public class Problem1859 {
    public static String sortSentence(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= ss.length; i++) {
            for (String a: ss) {
                if (a.contains(Integer.toString(i))) {
                    sb.append(a, 0, a.length() - 1);
                    if (i != ss.length) {
                        sb.append(" ");
                    }
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}

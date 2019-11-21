package Problems;

import java.util.LinkedList;
import java.util.List;

public class Problem592 {
    public String fractionAddition(String expression) {
        List<Integer> numsList = new LinkedList<>();
        List<Character> addSubList = new LinkedList<>();

        int back = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-') {
                addSubList.add(expression.charAt(i));
                if (back != i) {
                    String[] split = expression.substring(back, i).split("/");
                    numsList.add(Integer.parseInt(split[0]));
                    numsList.add(Integer.parseInt(split[1]));
                }
                back = i + 1;
            }
        }
        String[] split = expression.substring(back).split("/");
        numsList.add(Integer.parseInt(split[0]));
        numsList.add(Integer.parseInt(split[1]));

        int mu = numsList.get(1);
        int mz = numsList.get(0);
        int indexAddSub = 0;
        int indexNums = 2;

        while (indexAddSub < addSubList.size()) {
            if (indexAddSub == 0 && numsList.size() == addSubList.size() * 2) {
                mz = -mz;
            } else if (indexNums != 0 && addSubList.get(indexAddSub) == '+') {
                mz = mz * numsList.get(indexNums + 1) + mu * numsList.get(indexNums);
                mu = mu * numsList.get(indexNums + 1);
                indexNums += 2;
            } else if (indexNums != 0 && addSubList.get(indexAddSub) == '-') {
                mz = mz * numsList.get(indexNums + 1) - mu * numsList.get(indexNums);
                mu = mu * numsList.get(indexNums + 1);
                indexNums += 2;
            }
            indexAddSub++;
        }

        return mz >= 0 ? shrinkFrac (mz, mu) : "-" + shrinkFrac (-mz, mu);
    }

    private String shrinkFrac (int mz, int mu) {
        int a = mz;
        int b = 1;
        if (mz == 0) {return "0/1";}
        while (a > 1) {
            if (mz % (mz / b) == 0 && mu % (mz / b) == 0) {
                String answer = mz / (mz / b) + "/" + mu / (mz / b);
                return answer;
            } else {
                a = mz / b;
                b++;
            }
        }
        return mz + "/" + mu;
    }
}

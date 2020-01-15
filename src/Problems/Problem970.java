package Problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem970 {
    public static List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> answer = new HashSet();
        List<Integer> xLists = new ArrayList<>();
        List<Integer> yLists = new ArrayList<>();

        int currentX = 1;
        if (x == 1) {xLists.add(1);}
        else {
            while (currentX < bound) {
                xLists.add(currentX);
                currentX *= x;
            }
        }

        int currentY = 1;
        if (y == 1) {yLists.add(1);}
        else {
            while (currentY < bound) {
                yLists.add(currentY);
                currentY *= y;
            }
        }

        for (int xCandidate : xLists) {
            for (int yCandidate : yLists) {
                if (xCandidate + yCandidate <= bound)    answer.add(xCandidate + yCandidate);
                else continue;
            }
        }

        return new ArrayList<>(answer);
    }

    public static void main(String[] args) {
        System.out.println(powerfulIntegers(2,1,10));
    }
}

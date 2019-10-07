package Problems;

import java.util.Arrays;

public class Problem950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] answer = new int[deck.length];

        Arrays.sort(deck);
        for (int i = 0; i < deck.length; i++) {
            answer[i] = 0;
        }

        for (int i = deck.length - 1; i > -1; i--) {
            answer[i] = deck[i];
            if (i != deck.length - 1) {
                this.reOrder(i + 1, answer);
            }
        }

        return answer;
    }

    public void reOrder (int index, int[] deck) {
        int temp = deck[deck.length - 1];
        for (int i = deck.length - 1; i > index; i--) {
            deck[i] = deck[i - 1];
        }
        deck[index] = temp;
    }
}

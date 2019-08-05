package Problems;

public class Problem476 {
    public int findComplement(int num) {
        int count =0;
        int result = 0;

        while(num!=1){
            int lastBit = num&1;
            if(lastBit==0){
                result+=Math.pow(2,count);
            }
            if(num%2==1){
                num--;
            }
            num/=2;
            count++;

        }

        return result;
    }
}

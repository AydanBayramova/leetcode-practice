package recursion;

import java.util.ArrayList;
import java.util.List;

public class Unique3DigitEvenNumber {
    class Solution {
        public int totalNumbers(int[] digits) {
            List<Integer> list = new ArrayList<>();
            int[] count=new int[10];
            int d1=0;
            int d2=0;
            int d3=0;
            for(int i=0;i<digits.length;i++){
                count[digits[i]]++;
            }
            for (int i = 100; i < 1000; i += 2) {
                d1 = i / 100;
                d2 = (i / 10) % 10;
                d3 = i % 10;
                if (count[d1] > 0) {
                    count[d1]--;
                    if (count[d2] > 0) {
                        count[d2]--;
                        if (count[d3] > 0) {
                            list.add(i);
                        }
                        count[d2]++;
                    }
                    count[d1]++;
                }
            }
            return list.size();

        }
    }
}

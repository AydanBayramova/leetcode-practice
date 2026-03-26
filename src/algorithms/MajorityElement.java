package algorithms;

public class MajorityElement {
    public int majorityElement(int[] arr) {
        int candidate = 0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}

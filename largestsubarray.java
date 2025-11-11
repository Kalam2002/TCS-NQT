public class largestsubarray {
    public static void main(String[] args) {
        int[] arr={1,-2,3,4,-1,-3,9,-5,6,5,3,-4,6,-9,3,4,5,-2,1,-5,3,5,-6,4};
        int currsum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum>max){
                max=Math.max(max, currsum);
            }
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println("The Maximum Subarray Sum is: "+max);
    }
}

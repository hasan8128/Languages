public class sumtwo{
    public static void main(String[] args){
        int arr[] = {5, 8, 14, 19, 23 };
        int target = 37;

        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int sum = arr[left]+ arr[right];

            if(sum == target){
                System.out.println("Found the target");
                System.out.println("The index are " + left + " and " + right);
                break;
            }else if(sum<target){
                    left++;
            }
            else{
                right--;
            }
        }
    }
}

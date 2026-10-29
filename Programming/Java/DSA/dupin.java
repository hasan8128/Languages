public class dupin {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 2, 4, 5, 5};

        int i = 0;
        for(int j =0; j < nums.length; j++){
            if(nums[i] != nums[j] ){
                i++;
                nums[i] = nums[j];
            }
        }

        for(int k =0; k< nums.length; k++){
            System.out.println(nums[k]);
        }

        System.out.println(i + 1);
        int m = i +1;
        for(int l = 0; l < m; l++ ){
            System.out.println(nums[l]);
        }
    }
}

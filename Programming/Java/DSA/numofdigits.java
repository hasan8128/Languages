public class numofdigits {
    public static void main(String[] args){
        int arr[] = {567, 35, 78, 1234, 1};
        
        
        int count = 0;
        for( int i =0 ; i < arr.length ; i++){
            int num = arr[i];
            int digits = 0;
            while(num != 0){
                num  = num /10;
                digits++;
            }
            if (digits % 2 ==0){
                count++;
            }
            System.out.println(arr[i] + " has " + digits + " digits");
            
            
        }
        System.out.println("The array has " + count + " even numbers");
    }
    
}

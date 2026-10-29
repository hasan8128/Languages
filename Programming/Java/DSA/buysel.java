public class buysel {
    public static void main (String[] args){
        int arr[] = {7, 1, 5, 3, 6, 4};
        int max = 0;
        int profit;
        for (int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                profit = arr[j]-arr[i];
                if ( profit > max){
                    max = profit;
                }
            }
        }
        System.out.println("The maximum profit is: " + max);
    }
    
}

public class revomirror {
    public static void main(String[] args){

        int space = 4;
        int star = 1;
        

        for(int i = 0; i< 9 ; i++ ){
            for(int j =0; j <star; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j<space;j++){
                System.out.print("*");
            }
            System.out.println("");
            if( i < 4 ){
                space --;
                star ++;
            }else{
                space ++;
                star --;
            }  
            
        }
        
    }
}
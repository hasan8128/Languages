public class q2{
    static void patt(){
         for(int i = 0; i <4; i++){
            for(int j = 0; j < 4; j++){
                if( i == 0 || j == 0 || i ==3 || j==3 ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");   
        }
    }

    public static void main(String[] args){
        patt();
    }
}
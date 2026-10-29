public class runningsums {
    public static void main(String[] args){
        int ary[] = {2, 4, 6, 8, 10};
        int ary2[] = new int[ary.length];
        ary2[0] = ary[0];

        for (int i = 1; i < ary.length; i++){
            
            ary2[i] = ary[i] + ary2[i-1];
        }
        for(int j = 0; j<ary.length; j++){
            System.out.println(ary2[j]);
        }
    }
}

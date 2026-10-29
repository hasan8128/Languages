class calculator{
    void add(int x, int y){
        System.out.println("The sum of two the integer: " + (x + y));
    }

    void add(int x, int y, int z){
        System.out.println("The sum of the three integer: " +((x + y) + z));
    }

    void add(double x, double y){
        System.out.println("The sum of the two decimal: " + (x + y));
    }     
}

class pr6{
    public static void main(String[] args){
        calculator obj = new calculator();
        obj.add(8,9);
        obj.add(7,9,8);
        obj.add(7.5, 9.5);
    }
}
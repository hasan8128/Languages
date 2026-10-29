

class shapes{
    
    final double pi = 3.14;

    void circle(double r){
        double area_circle = pi * r*r;
        System.out.println("The area of the circle is : " + area_circle );
    }

    void cylinder(double r, double h){
        double area_cylinder = 2* pi * r*h;
        System.out.println("The area of the cylinder is : " + area_cylinder );
    }

    void cone(double r, double l){
        double area_cone = pi * r*l;
        System.out.println("The area of the cone is : " + area_cone );
    }
    
}

class prg22{
    public static void main(String[] args){
        shapes obj = new shapes();
        obj.circle(8.9);
        obj.cylinder(7.12, 9.78);
        obj.cone(6.34, 8.3);

    }
}
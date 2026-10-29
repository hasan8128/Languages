class vehicle{
    void run(){
        System.out.println("The vehichle is currently in service.");
    }

}

class bike extends vehicle{
    void status(){
        System.out.println("The bike registered for Day Transportation.");
    }
}

class pr5{
    public static void main(String[] args){
        bike obj = new bike();
        obj.run();
        obj.status();
    }
}
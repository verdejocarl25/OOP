class Bird extends Animal{

    @Override
    void eat() {
        System.out.println("Birds loves seeds ");
        
    }

    @Override
    void sleep() {
        System.out.println("Birds sleeps for 10-12 hours ");
        
    }

    @Override
    void sound() {
        System.out.println("Tweet Tweet");
        
    }
    
}
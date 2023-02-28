public class Polymorphism_loading {
    void sum(int a ,int b){
        System.out.println("sum of 2 integer=: "+a+b);
    }
    void sum(int a){
        int b=4;
        System.out.println("sum of single digit "+a+b);
    }
    void sum(double a ,double b){
        System.out.println("Sum of 2 double value:= "+a+b);
    }


    public static void main(String[] args) {
        Polymorphism_loading a = new Polymorphism_loading();
        a.sum(1,2);
        a.sum(2);
        a.sum(4.5,2.1);

    }
}

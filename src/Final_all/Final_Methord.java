package Final_all;

public class Final_Methord {
    final  void sum(int a ,int b){
        int c = a+b;
        System.out.println(c);
    }
    void double_Value(int a ){
        System.out.println(a*a);
    }

    public static void main(String[] args) {
        Final_Methord a = new Final_Methord();
        a.sum(1,2);
    }

}
class Demo extends Final_Methord{
    //void sum(int a ,int b){}(Error)
    public static void main(String[] args) {
        Demo a = new Demo();
        a.sum(1,2);
    }
}
//class demo2 {
//    void sum(int a ,int b){
//
//    }
//    public static void main(String[] args) {
//        Final_Methord ob = new Final_Methord();
//
//
//        ob.sum(1,4);
//    }
//}


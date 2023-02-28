package Super;

class Animal{
    String type="PET";
}
class Dog extends Animal{
    String type="Street";
    void print_Type(){
        System.out.println(type);//prints type of Dog class
        System.out.println(super.type);//prints type of Animal class
    }
}
class Super_var {
    public static void main(String args[]){
        Dog d=new Dog();
        d.print_Type();
    }}
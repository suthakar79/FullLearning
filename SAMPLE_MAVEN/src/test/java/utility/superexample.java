package utility;

class A{
    String type="class A";
    void display2(){
        System.out.println(type);
    }
}

class B extends A{
    String type="class B";
    void display1(){
        System.out.println(super.type);
    }
}

class C extends B{
    String type="class C";
    void display(){
        System.out.println(super.type);
    }
}

public class superexample {
    public static void main(String[] args){
        C c=new C();
        c.display();
        c.display1();
        c.display2();

    }
    

    
}

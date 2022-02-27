package utility;

public class wellsfargointerview {
    static int index = 0;
    public static void main(String args[]) {
        System.out.println(test());
        System.out.println(test1());// error since static method can't access non static 
    }
    static  int test() {
        int index = 1;
        return index;
    }

    int test1() {
        int index = 1;
        return index;
    }

}

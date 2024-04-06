package com.hspedu.main_;

public class main_ {
    private static int n1 = 10;//静态属性
    private int n2 = 20;//非静态属性

    public static void main(String[] args) {
        System.out.println("n1= " + n1);
        System.out.println("n1= " + main_.n1);

        //System.out.println("n2 " + n2);  //错误
        main_ main = new main_();
        System.out.println("n2= " + main.n2);
    }
}

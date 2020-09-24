package com.lesson_5;

public class method_12 {
    public static void main(String[] args) {
        int meth_1 = meth_1();
        int meth_2 = meth_2();
        int meth_3 = meth_3();
        int meth_4 = meth_4();
        int meth_5 = meth_5();
        int meth_6 = meth_6(2);
        System.out.println(meth_1);
        System.out.println(meth_2);
        System.out.println(meth_3);
        System.out.println(meth_4);
        System.out.println(meth_5);
        System.out.println(meth_6);
    }

    static int meth_1() {
        int meth_1 = meth_2() + meth_3();
        return meth_1;
    }

    static int meth_2() {
        int meth_4 = meth_4();
        return meth_4 + 10;
    }

    static int meth_3() {
        int meth_4 = meth_4();
        return meth_4 + 5;
    }


    static int meth_4() {
        int meth_4 = meth_6(2);
        return meth_4 * 2;
    }

    static int meth_5() {
        int meth_5 = meth_6(2);
        return meth_5 * 3;
    }

    static int meth_6(int a6) {
        return a6;
    }
}

package UseClass;

import BuildClass.Complex;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spThuong = new Complex();

        System.out.println("Please enter the complex number 1: ");
        sp1.nhapSP(sc);
        System.out.println("Please enter the complex number 2: ");
        sp2.nhapSP(sc);

        System.out.println("Complex number 1: ");
        sp1.hienThiSP();
        System.out.println("Complex number 2: ");
        sp2.hienThiSP();

        spThuong = sp1.chiaSP(sp2);

        System.out.println("the result of dividing a complex number by a complex number 2: ");
        spThuong.hienThiSP();

        sc.close();
    }
}

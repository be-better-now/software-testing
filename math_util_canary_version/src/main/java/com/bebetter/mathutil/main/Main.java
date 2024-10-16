package com.bebetter.mathutil.main;

import com.bebetter.mathutil.core.MathUtility;


public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5, 0, 20, 21 coi tính mấy (this is test case)
        //Test case là 1 tình huống sử dụng app (hàm) mà nó bao hàm data
        //đầu vào cụ thể nào đó, output đầu ra ứng với xử lí của hàm/chức năng của app,
        //dĩ nhiên dùng đầu vào để xử lí.
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");

    }
}
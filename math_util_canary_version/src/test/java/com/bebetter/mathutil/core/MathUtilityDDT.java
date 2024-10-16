package com.bebetter.mathutil.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class MathUtilityDDTTest {
    //@Test là 1 phần annotation của framework, biến cái hàm của ta thành hàm main
    //Để có thể run, hàm bình thường chỉ có thể trong main)() để chạy
    //@Test biến hàm bất kì thành main()

    //Kĩ thuật DDT - Data Driven Testing: Là kĩ thuật tách bộ data kiểm thử ra
    //Khỏi các câu lệnh kiểm thử, mục đích giúp developer nhìn n
    // hanh được xem
    //Bộ test case còn thiếu case nào hay không
    //Kĩ thuạt này còn gọi tên khác là tham số hóa bộ data kiểm thử (Parameterized Testing)

    //Ta làm riêng 1 hàm, phải là static, để lưu bộ data kiểm thử
    public static Object[][] initTestData() {
        return new Object[][]
                {       {0, 1},
                        {1, 1},
                        {2, 2},
                        {3, 6},
                        {4, 24},
                        {5, 120},
                        {6, 720},
                };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException() {
        return new Integer[] {-1, -2, -4, -5, -6, -100, 21, 22, 23, 24, 100};
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactorialGivenWrongArgumentThrowsException(int n) {
        assertThrows(IllegalArgumentException.class ,
                () -> MathUtility.getFactorial(n));
    }
}
package com.bebetter.mathutil.core.test;

import static org.junit.jupiter.api.Assertions.*;

import static com.bebetter.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
class MathUtilityTest {

    //Cấu trúc Test Case: ID, Description, Steps/Procedures, Expected Result, Actual Result, Status,
    // TestDate, Bug # (Bug ID) Bugzilla (Bug DB)

    //Test case #1: Check getFactorial() with n = 0 to see result of 1.
    //
    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        long expectedValue = 1; //hi vọng 0! trả về 1.
        long actualValue = getFactorial(0);
        //so sánh
        //Truyền thống: ta sout() để in kết quả và nhìn bằng mắt để đoán đúng sai
        //Hiện đại: xài thêm tool, framework: Unit Testing Framework (JUnit) giúp đôi mắt ta nhìn kết quả đúng sai
        //chỉ qua 2 màu XANH và ĐỎ. Không cần nhìn đoán và kết luận như truyền thống.
        assertEquals(expectedValue, actualValue);
        //Giống nhau: màu xanh
        //Lệch nhau: màu đỏ (hàm chạy kết quả không ra như mong đợi)
    }

    //Test case #2: Check getFactorial() with n = 5 to see result of 120.
    @Test
    void testFactorialGivenRightArgument5RunsWell() {
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }

    //Test case #3: Check getFactorial() with n = -5... to see the Exception
    //Chủ động tôi muốn thấy có ngoại lệ xuất hiện trong tình huống n am hoặc n > 20
    //Ngoại lệ có xuất hiện như dự kiến hay không... nếu có thì phải màu xanh
    //NOTES: CÓ NGOẠI LỆ, NHƯNG MÀU XANH, VÌ NGOẠI LỆ XUẤT HIỆN NHƯ DỰ KIẾN

    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
        //getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(22);});
    }
}

//QUY TẮC XANH ĐỎ CỦA UNIT TEST TOOLS/FRAMEWORK
//Nếu tất cả các test case passed (expected == actual) => màu xanh
//Chỉ cần 1 trong những test case failed (expected != actual) => màu đỏ
//Lý do: Hàm đã đúng thì phải đúng hết với các test case đã đưa ra!
//Mắt chỉ nhìn 2 tín hiệu: XANH - ĐỎ theo style gộp các kết quả
//Xanh: đúng hết, đỏ: 1 thằng nào chết -> bỏ hàm, fix lại!

//Kỹ thuật viết code chính (hàm trong API, core, ...)
//Mà đi kèm code test hàm luôn, dùng 2 trạng thái xanh đỏ, cứ liên tục code
//Xong chạy xanh đỏ, sửa, chạy lại xanh đỏ, tối ưu chỉnh code, chạy lại xanh
//Đỏ, xanh đỏ liên tục trong quá trình viết tiếp code được gọi là TDD
//Test Driven Development - Viết code song hành cùng code test.
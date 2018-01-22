package com.loadclass.demo;

/**
 * @Author: yangkunpeng
 * @Date 2018/1/22
 * 不通过+-运算符实现加法
 */
public class AddTest {
    public static void main(String[] args) {
        int add = bitAdd(3, 5);
        System.out.println(add);
    }

    public static int bitAdd(int a, int b) {
        if (b == 0) {
            return a;
        }

        int sum = a ^ b;
        int carry = (a & b) << 1;

        return bitAdd(sum, carry);
    }
}

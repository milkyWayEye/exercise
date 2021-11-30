package cn.tedu.thetwo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 需求:
 * 4.完成一个简单的计算器程序。程序要求如下：
 *
 * 1)读入两个整数
 * 2)提示用户选择对这两个整数的操作，即输出
 * 1 ： +
 * 2 ： -
 * 3 ： *
 * 4 ： /
 * 请输入您的选择：
 *
 * 读入用户的选择，输出运算结果。
 */
public class QuestionFour {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入两个整数:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("请输入如何操作:");
            String operator = sc.next();
            switch (operator) {
                case "+":
                    System.out.println("a+b="+(a+b));
                    break;
                case "-":
                    System.out.println("a-b="+(a-b));
                    break;
                case "*":
                    System.out.println("a*b="+(a*b));
                    break;
                case "/":
                    System.out.println("a/b="+(a/b));
                    break;
                default:
                    System.out.println("请输入四则运算符");
            }
        } catch (InputMismatchException e) {
            System.out.println("输入数据类型错误,请输入整数");
        }
    }
}

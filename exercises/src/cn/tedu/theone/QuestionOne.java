package cn.tedu.theone;
/**
 * 需求:
 * 1.实现控制台输入三个数 实现三个数的比较
 * 取出最大值  使用if else判断
 * 如 输入：1 ，2 ，3最大值：3
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        System.out.println("请输入三个整数");
        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
//            //法1
//            int max = a>b ? a : b > c ? a>b ? a : b : c;
//            System.out.println("最大值是"+max);

//            //法2
//            int max = a;
//            if(b>max) {
//                max = b;
//            }
//            if(c>max) {
//                max = c;
//            }
//            System.out.println("最大值是"+max);

            //法3
            int max;
            if (a>b) {
                max = a;
            } else {
                max = b;
            }
            if (c>max) {
                max = c;
            }
            System.out.println("最大值是"+max);
        } catch (InputMismatchException e) {
            System.out.println("输入数据类型错误,请输入整数");
        }
    }
}

package cn.tedu.theone;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 需求:
 * 3.用户输入一个数，求这个数是否是一个质数 ，控制台打印输出是质数或不是质数  说明（除了自然数1和自己本身
 *  不能在被其它自然数整出的数）
 */
public class QuestionThree {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数:");
            int a = sc.nextInt();
            if (a<=1) {
                System.out.println("不是质数");
            } else {
                for (int i=2;i<a;i++) {
                    if(a%i==0) {
                        System.out.println("不是质数");
                        return;
                    }
                }
                System.out.println("是质数");
            }
        } catch (InputMismatchException e) {
            System.out.println("输入数据类型错误,请输入整数");
        }
    }
}

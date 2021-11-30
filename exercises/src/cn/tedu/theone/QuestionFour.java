package cn.tedu.theone;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 需求:
 * 4.用户输入年份 月份 天数 求这一天是这一年中的第几天 例如：控制台分别输入 2020  03  31
 * 打印结果（2020年3月31日是这一年的第：91天)
 */
public class QuestionFour {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年份:");
            int year = sc.nextInt();
            System.out.println("请输入月份:");
            int month = sc.nextInt();
            System.out.println("请输入日期:");
            int day = sc.nextInt();
            int sum = 0;
            boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            if(isLeapYear) {
                sum = toResult(month,29);
                sum += day;
            } else {
                sum = toResult(month,28);
                sum += day;
            }
            System.out.println("是这一年的第"+sum+"天");
        } catch (InputMismatchException e) {
            System.out.println("输入数据类型错误,请输入整数");
        }
    }

    private static int toResult(int month,int two) {
        int sum = 0;
        for(int i=1;i<month;i++) {
            if(i==2) {
                sum+=two;
                continue;
            }
            if(i%2!=0) {
                sum += 31;
            } else {
                sum += 30;
            }
        }
        return sum;
    }
}

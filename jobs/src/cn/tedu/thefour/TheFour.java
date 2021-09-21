package cn.tedu.thefour;

import java.util.Scanner;

/*4.输入一个字符串 判断该字符串是否是回文；
比如：String str="上海自来水来自海上";
输出结果 是回文 或  不是回文*/
public class TheFour {
    public static void main(String[] args) {
        System.out.println("请输入：");
        String s = new Scanner(System.in).nextLine();
        boolean flg = true;
        for (int i = 0; i < s.length()/2; i++) {
            if (!(s.charAt(i)==s.charAt(s.length()-1-i))){
                flg = false;
                break;
            }
        }
        System.out.println(flg?"是回文":"不是回文");
    }
}

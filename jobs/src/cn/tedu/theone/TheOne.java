package cn.tedu.theone;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*1.统计字符串中字符出现的次数 比如String str="abcdeabc"
输出结果
a:2
b:2
c:2
d:1
e:1*/
public class TheOne {
    public static void main(String[] args) {
        System.out.println("请输入内容:");
        String s = new Scanner(System.in).nextLine();
        int[] num = new int[s.length()];
        String ss = "";
        for (char n:
             s.toCharArray()) {
            if (!ss.contains(String.valueOf(n))) {
                ss+=n;
                num[ss.indexOf(n)]+=1;
            }
            else {
                num[ss.indexOf(n)]+=1;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i]==0) break;
            System.out.println(String.format("%c:%d",ss.charAt(i),num[i]));
        }
    }
}

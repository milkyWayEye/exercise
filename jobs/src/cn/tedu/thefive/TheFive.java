package cn.tedu.thefive;

import java.util.Scanner;

/*5.分别统计字符串中字母数字其他字符出现的个数

比如：String str="abc23s2%$*;
字母：4次
数字：3次
其他字符：3次
*/
public class TheFive {
    public static void main(String[] args) {
        System.out.println("请输入：");
        String s = new Scanner(System.in).nextLine();
        int a=0,b=0,c=0;
        for (char n:
             s.toCharArray()) {
            if (n>64&&n<='Z'||n>96&&n<123){
                a++;
            }else if (n>47&&n<58){
                b++;
            }else {
                c++;
            }
        }
        System.out.println(String.format("字母：%d次\n数字：%d次\n" +
                "其他：%d次",a,b,c));
    }
    //法2用正则
}

package cn.tedu.theone;

import java.nio.charset.StandardCharsets;
import java.util.*;

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
        method2(s);
    }
    //法2用哈希字典写
    public static void method2(String s){
        Map<Character,Integer> map = new HashMap<>();
        for (char n:
             s.toCharArray()) {
            if (!map.containsKey(n)){
                map.put(n,1);
            }else {
                map.put(n,map.get(n)+1);
            }
        }
        System.out.println(map);
    }
    //法1可用开关数组优化
    public static void method3(String s) {

    }
}


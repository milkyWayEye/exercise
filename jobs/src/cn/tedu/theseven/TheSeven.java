package cn.tedu.theseven;
/*7将字符串 如 ：adfadfadABCD 要求打印输出 首字符大写 其余字母全部小写。*/
public class TheSeven {
    public static void main(String[] args) {
        String s = "adfadfadABCD";
        String s1 = s.substring(0,1);
        String s2 = s.substring(1);
        System.out.printf("%s%s",s1.toUpperCase(),s2.toLowerCase());
    }
}

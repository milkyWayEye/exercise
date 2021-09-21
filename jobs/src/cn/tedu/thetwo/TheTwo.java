package cn.tedu.thetwo;
/*2.统计指定字符串在对应字符串中出现的次数
比如：String key="ab";  String str="acbdabfehaab";
key出现了2次*/
public class TheTwo {
    public static void main(String[] args) {
        String key = "ab";
        String str = "acbdabfehaab";
        int num = 0;
        while (str.contains(key)){
            str = str.substring(str.indexOf(key)+key.length());
            num+=1;
        }
        System.out.printf("%s出现了%d次",key,num);
    }
}

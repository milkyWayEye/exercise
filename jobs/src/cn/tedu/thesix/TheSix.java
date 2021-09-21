package cn.tedu.thesix;
/*6.统计字符串中的数字之和 比如 String ss="ava6sdf2a9a2";  结果19*/
public class TheSix {
    public static void main(String[] args) {
        int sum = 0;
        String ss = "ava6sdf2a9a2";
        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i)>47&&ss.charAt(i)<58){
                sum+=Integer.parseInt(String.valueOf(ss.charAt(i)));
            }
        }
        System.out.println(sum);
    }
}

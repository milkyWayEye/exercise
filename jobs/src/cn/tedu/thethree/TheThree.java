package cn.tedu.thethree;
/*3.写一个方法要求把字符串abc-defg输出为gfe-dcba*/
public class TheThree {
    public static void main(String[] args) {
        String s = "abc-defg";
        for (int i = s.length()-1; i >-1 ; i--) {
            if (i==s.length()-s.indexOf("-")-1){
                System.out.print("-");
            }
            if (i==s.indexOf("-")) {
                continue;
            }
            System.out.print(s.charAt(i));
        }
    }
}

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
        System.out.println();
        method2(s);
    }
    //法2用StringBuilder,删除"-",倒叙之后在特定位置加"-"
    public static void method2(String s){
        int index = s.indexOf("-");
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder del = s1.deleteCharAt(index);
        StringBuilder rever = del.reverse();
        StringBuilder result = rever.insert(index,"-");
        System.out.println(result);
    }
}

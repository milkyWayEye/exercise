package cn.tedu.thetwo;

/**
 * 需求:
 * 2.定义一个int a=1234567;将变量a的值倒序排序结果为 7654321
 */
public class QuestionTwo {
    public static void main(String[] args) {
        int a=1234567;
        do {
            System.out.print(a%10);
            a/=10;
        } while (a!=0);
    }
}

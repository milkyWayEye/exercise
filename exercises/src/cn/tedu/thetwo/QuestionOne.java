package cn.tedu.thetwo;

/**
 * 需求:
 * 1.输入一串数字， 计算它各位上数字的和。比如：输入123456 结果：21
 */
public class QuestionOne {
    public static void main(String[] args) {
        int i = 123456;
        int sum = 0;
        while (i!=0) {
            sum += i%10;
            i/=10;
        }
        System.out.println("和为"+sum);
    }
}

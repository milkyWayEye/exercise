package cn.tedu.thetwo;

/**
 * 需求:
 * 5.计算1+3+5+...+99 的和
 */
public class QuestionFive {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<100;i+=2){
            sum+=i;
        }
        System.out.println("和为"+sum);
    }
}

package cn.tedu.thetwo;

/**
 * 需求:
 * 3.求100 以内所有能被3 整除但不能被5 整除的数字的和。
 */
public class QuestionThree {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<101;i++) {
            if(i%3==0 && i%5!=0) {
                sum+=i;
            }
        }
        System.out.println("和为:"+sum);
    }
}

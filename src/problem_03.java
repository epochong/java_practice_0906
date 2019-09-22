import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author epochong
 * @date 2019/9/6 20:57
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class problem_03 {
    public static boolean isZ(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> z = new ArrayList <>();
        for (int i = 2; i < 1000; i++) {
            if (isZ(i)) {
                z.add(i);
            }
        }
        Scanner input = new Scanner(System.in);;
        int n = input.nextInt();
        int sum = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (z.contains(n - i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

/**
 * Hello Numbers.
 *
 * @author xxshowerxx
 * @date 2024/06/28
 */
public class HelloNumbers {
    /**
     * Main function.
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        int x = 1;
        int total = 0;
        while (x <= 10) {
            System.out.print(total + " ");
            total = total + x;
            x = x + 1;
        }
	}
} 

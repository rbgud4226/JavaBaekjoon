package Stack;

import java.util.Scanner;
import java.util.Stack;

public class B17608 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> h = new Stack<>();
        for(int i = 0; i < n ; i++){
            h.push(scanner.nextInt()); // 5 6 7 8
        }
        int standard = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            int temp = h.pop();
            if (standard < temp) {
                count++;
                standard = temp;
            }
        }
        System.out.println(count);
    }
}

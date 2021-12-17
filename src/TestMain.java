import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        TestMain mm = new TestMain();
        System.out.println(mm.arr(1, 2, 3, 4));
    }

    public int arr(int a1, int a2, int a3, int a4) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));
        int sum = 0;
        for (Integer i : a) {
            if (sum < i) {
                sum = i;
            }
        }
        return sum;

    }
}

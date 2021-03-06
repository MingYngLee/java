package lambda;

import org.junit.Test;

/**
 * Created by LeeToSun on 2017/6/21
 */
public class Demo {

    @Test
    public void main() {
        // fun(5, 6, (i, j) -> method(i,j));
        fun(5, 6, Demo::method);
    }

    private static void method(int i, int j) {
        System.out.println(i * j);
    }

    private void fun(int i, int j, DemoFI<Integer, Integer> demoFI) {
        demoFI.test(i, j);
        demoFI.t();
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception_handling_try_catch_block {
    public static void main(String[] args) {
        m1(); // method
    }
    private static void m1() {
        m2(); // method
    }
    private static void m2()
    {
        System.out.print("Enter Your name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String name = br.readLine(); // There is an error here.
        } catch (IOException e) { // auto generated catch block
            e.printStackTrace();
            // Error Handled at this block using try - catch - no passing buck
        }}}

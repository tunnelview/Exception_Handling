import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class throws_exception_example {
    public static void main(String[] args) throws IOException{ // throws IO Exception added --- 4
        first_method(); // method // error moved to first_method after throws IO Exception
        // in line 11
    }

    private static void first_method() throws IOException{ // throws IO Exception added --- 3
        second_method(); // method // error moved to second_method after throws IO Exception
        // in line 16
    }

    private static void second_method() throws IOException { // throws IO Exception added ---2
        System.out.print("Enter Your name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine(); // error on readLine() ----- 1
    }
}
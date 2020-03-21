import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
   public static BufferedReader reader =
            new BufferedReader(
                    new InputStreamReader(
                            System.in
                    )
            );
    public static void main(String[] args) throws IOException {
//======================1.	Reverse Numbers with a Stack==================
        revereseNumWIthStack();
//========================================================================
    }

    private static void revereseNumWIthStack() throws IOException {
        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(
                reader.readLine().split("\\s+"))
                .forEach(stack::push);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );
        //String [] input = reader.readLine().split("\\s+");

        ArrayDeque <String> stack = new ArrayDeque<>();

        Arrays.stream(reader.readLine().split("\\s+")).forEach(stack :: push);

//        for (String s : input) {
//            stack.push(Integer.parseInt(s));
//        }

        System.out.println(stack);
    }
}

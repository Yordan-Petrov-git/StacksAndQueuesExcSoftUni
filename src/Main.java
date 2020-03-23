    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayDeque;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.Deque;

    public class Main {

        public static BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        public static void main(String[] args) throws IOException {
            //========================================================================
    //======================1.	Reverse Numbers with a Stack==================
            // revereseNumWIthStack();
    //========================================================================
           // 2.	Basic Stack Operations
           // basicStackOperations();
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================
    //========================================================================


        }

        private static void basicStackOperations() throws IOException {
            String[] comands = reader.readLine().split("\\s+");
            String[] numbers = reader.readLine().split("\\s+");

            Deque<Integer> nums = new ArrayDeque<>();

            int numberToPushN = Integer.parseInt(comands[0]);
            int numberToPopS = Integer.parseInt(comands[1]);
            int numberToCheckX = Integer.parseInt(comands[2]);


            for (int i = 0; i < numberToPushN; i++) {
                nums.push(Integer.parseInt(numbers[i]));
               // System.out.println(nums+"push");
            }
            for (int i = 0; i <numberToPopS ; i++) {
                nums.pop();
                //System.out.println(nums+"pop");
            }

            if( nums.contains(numberToCheckX)){
                System.out.println("true");
            }else if(nums.isEmpty()){
                System.out.println("0");
            }else {
                System.out.println(Collections.min(nums));
            }
        }

        private static void revereseNumWIthStack() throws IOException {
            //Reverse Numbers with a Stack!
            Deque<String> stack = new ArrayDeque<>();

            Arrays.stream(
                    reader.readLine().split("\\s+"))
                    .forEach(stack::push);

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }

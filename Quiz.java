import java.util.Arrays;

public class Quiz {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(args));
    for (String arg : args) {
      if (arg.charAt(0) == 't') {
        System.out.println(arg);
      }
    }
  }
}

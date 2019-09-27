import static com.google.common.base.Preconditions.checkArgument;

public class HelloOtus {
    public static void main(String[] args) {
        int count = 1;

        checkArgument(count > 0, "Count should be greater than zero");


    }
}

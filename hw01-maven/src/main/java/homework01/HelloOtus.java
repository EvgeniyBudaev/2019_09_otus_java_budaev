package homework01;

import static com.google.common.base.Preconditions.checkArgument;

public class HelloOtus {
    private int count = 1;
    public void guavaMethod(){
        checkArgument(count > 0, "Count should be greater than zero");
    }





}
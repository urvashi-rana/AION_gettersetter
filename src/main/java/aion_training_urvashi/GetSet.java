package aion_training_urvashi;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class GetSet
{
    private static String myStr = "String hasn't been set yet.";

    @Callable
    public static String getString() {
        Blockchain.println("Current string is " + myStr);
        return myStr;
    }

    @Callable
    public static void setString(String newStr) {
        myStr = newStr;
        Blockchain.println("New string is " + myStr);
    }

}

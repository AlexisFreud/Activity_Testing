import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import TestClasses.*;

public class UnitTest {

    public static void main(String[] args) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.addListener(new TextListener(System.out));
        jUnitCore.run(
                SizeOfList.class,
                ClearList.class,
                AddItems.class,
                ItemExists.class,
                GetElementsByIndex.class,
                SearchForIndex.class,
                removeItemByIndex.class
        );
    }
}

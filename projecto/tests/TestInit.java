public class TestInit {

    @Assertion("true")
    int foo;

    {
        foo++;
    }

    public static void main(String args[]) {
        new TestInit();
    }
}
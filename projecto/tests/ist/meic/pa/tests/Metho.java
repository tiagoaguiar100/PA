package ist.meic.pa.tests;
import ist.meic.pa.Assertion;

class Metho {

    Object o = new String("OLA");

    public Object getAndClear() {
        Object old = this.o;
        this.o = null;
        return old;
    }

    @Assertion(
        value="getAndClear() != null",
        entry="getAndClear() != null"
    )
    public void m() {
        System.out.println(this.o.toString());
    }
}

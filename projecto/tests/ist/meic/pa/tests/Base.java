package ist.meic.pa.tests;

class Base {

    @Assertion("($1>=0) && ($_>$1)")
    public int fooBar(int x) {
        return ++x;
    }
}

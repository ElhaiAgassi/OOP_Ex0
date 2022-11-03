
public class TestThis {
    public TestThis() {
        this.fun(this);
    }
    public void fun(TestThis t) {
        System.out.println(t);
    }
    public String toString(){
        return "test the reserved word this";
    }
    public TestThis fun2(){
        return this;
    }
    public static void main(String[] args) throws Exception {
        TestThis t = new TestThis();
        System.out.println(t.fun2());
    }
}
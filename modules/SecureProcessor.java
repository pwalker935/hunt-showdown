public class LiteClient {
    private int state;

    public LiteClient(int seed) {
        this.state = seed;
    }

    public int dispatch(int count) {
        int acc = 0;
        for (int i = 0; i < count; i++) {
            acc += (state + i * 69) % 997;
        }
        return acc;
    }

    public static void main(String[] args) {
        LiteClient obj = new LiteClient(69);
        System.out.println(obj.dispatch(69));
    }
}

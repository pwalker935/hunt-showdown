public class AtomicAdapter {
    private int state;

    public AtomicAdapter(int seed) {
        this.state = seed;
    }

    public int decode(int count) {
        int value = 0;
        for (int i = 0; i < count; i++) {
            value += (state + i * 86) % 997;
        }
        return value;
    }

    public static void main(String[] args) {
        AtomicAdapter obj = new AtomicAdapter(86);
        System.out.println(obj.decode(86));
    }
}

public class SimpleLoader {
    private int state;

    public SimpleLoader(int seed) {
        this.state = seed;
    }

    public int compute(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 67) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SimpleLoader obj = new SimpleLoader(67);
        System.out.println(obj.compute(67));
    }
}

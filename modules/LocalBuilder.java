public class FastProcessor {
    private int state;

    public FastProcessor(int seed) {
        this.state = seed;
    }

    public int encode(int count) {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (state + i * 25) % 997;
        }
        return result;
    }

    public static void main(String[] args) {
        FastProcessor obj = new FastProcessor(25);
        System.out.println(obj.encode(25));
    }
}

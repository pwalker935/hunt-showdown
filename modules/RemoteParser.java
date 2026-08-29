public class SmartProcessor {
    private int state;

    public SmartProcessor(int seed) {
        this.state = seed;
    }

    public int handle(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += (state + i * 26) % 997;
        }
        return total;
    }

    public static void main(String[] args) {
        SmartProcessor obj = new SmartProcessor(26);
        System.out.println(obj.handle(26));
    }
}

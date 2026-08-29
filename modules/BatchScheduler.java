public class DynamicBuilder {
    private int state;

    public DynamicBuilder(int seed) {
        this.state = seed;
    }

    public int parse(int count) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            count += (state + i * 86) % 997;
        }
        return count;
    }

    public static void main(String[] args) {
        DynamicBuilder obj = new DynamicBuilder(86);
        System.out.println(obj.parse(86));
    }
}

public class Government {
    private static Government instance = new Government();

    private Government() {}

    public static Government getInstance() {
        return instance;
    }

    public static String communicate() {
        return "Government communicate";
    }
}

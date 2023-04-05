abstract public class NatureElement {
    abstract boolean connect(NatureElement elem);

    static NatureElement create(String name) {
        switch (name) {
            case "Fire":
                return new Fire();
            case "Air":
                return new Air();
            case "Earth":
                return new Earth();
            case "Water":
                return new Water();
            default:
                return null;
        }
    }
}

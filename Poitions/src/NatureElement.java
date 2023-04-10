abstract public class NatureElement {
    abstract NatureElement connect(NatureElement elem);

    static NatureElement create(String name) {
        switch (name.toLowerCase()) {
            case "fire":
                return new Fire();
            case "air":
                return new Air();
            case "earth":
                return new Earth();
            case "water":
                return new Water();
            default:
                return null;
        }
    }
}

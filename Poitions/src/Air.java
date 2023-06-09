public class Air extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Air + Air = " + new Pressure());
            return new Pressure();
        } else if (elem instanceof Earth) {
            System.out.println("Air + Earth = " + new Dust());
            return new Dust();
        } else if (elem instanceof Water) {
            System.out.println("Air + Water = " + new Rain());
            return new Rain();
        } else if (elem instanceof Fire) {
            System.out.println("Air + Fire = " + new Energy());
            return new Energy();
        }
        return null;
    }
}

public class Fire extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Fire + Air = " + new Energy());
            return new Energy();
        } else if (elem instanceof Earth) {
            System.out.println("Fire + Earth = " + new Lava());
            return new Lava();
        } else if (elem instanceof Water) {
            System.out.println("Fire + Water = " + new Steam());
            return new Steam();
        } else if (elem instanceof Fire) {
            System.out.println("Не производит новый элемент");
            return null;
        }
        return null;
    }
}

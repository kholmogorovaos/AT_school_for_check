public class Water extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Water + Air = " + new Rain());
            return new Rain();
        } else if (elem instanceof Earth) {
            System.out.println("Water + Earth = " + new Mud());
            return new Mud();
        } else if (elem instanceof Water) {
            System.out.println("Water + Water = " + new Sea());
            return new Sea();
        } else if (elem instanceof Fire) {
            System.out.println("Water + Fire = " + new Steam());
            return new Steam();
        }
        return null;
    }
}

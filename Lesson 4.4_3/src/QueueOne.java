public class QueueOne implements Queue {
    private int[] array = new int[10];
    private int firstElement = 0;
    private int lastElement = 0;

    @Override
    public void add(int value) {
        array[lastElement++] = value;
    }
    @Override
    public int remove() {
        int value = array[firstElement];
        array[firstElement++] = 0;
        if (firstElement == lastElement) {
            firstElement = 0;
            lastElement = 0;
        }
        return value;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == lastElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = firstElement; i < lastElement; i++) {
            sb.append(array[i]);
            if (i != lastElement - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}


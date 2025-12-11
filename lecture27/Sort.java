import java.util.List;

public interface Sort<E extends Comparable<E>> {
    // Used for in place sorting
    public void sort(List<E> list);
}

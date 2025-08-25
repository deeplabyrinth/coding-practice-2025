import java.util.ArrayList;
import java.util.Objects;

public class ModArrayList<D> extends ArrayList<D> {
    /* Inherit from the super class ArrayList, The list we create can allow any type of data to be in the list
     * denoted by 'D'. Our ModArrayList can also store any data as indicated by 'D'.
     */
    public D getUsingMod(int index) {
        index = Math.abs(index % this.size());
        return this.get(index);
    }
}

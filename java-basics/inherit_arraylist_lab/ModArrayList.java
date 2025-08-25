import java.util.ArrayList;
import java.util.Objects;

public class ModArrayList<D> extends ArrayList<D> {
    /* We want to create a fool-proof way of accessing items in a given list, we want to create a getUsingMod method
     * that takes an index and retrieves an item from the list at that index. If the index is invalid, then the mod and
     * absolute value operations should be used to make the index positive and mod the index based on the length of the
     * list.

     * Inherit from the super class ArrayList, The list we create can allow any type of data to be in the list
     * denoted by 'D'. Our ModArrayList can also store any data as indicated by 'D'.
     */
    public D getUsingMod(int index) {
        index = Math.abs(index % this.size());
        return this.get(index);
    }
}

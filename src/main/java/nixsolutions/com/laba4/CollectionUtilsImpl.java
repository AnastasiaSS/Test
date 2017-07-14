package nixsolutions.com.laba4;

import interfaces.task4.CollectionUtils;

import java.util.*;

/**
 * Class CollectionUtilsImpl implements the operations
 * of union, intersection(with and without duplicates)
 * and difference of two collections.
 *
 * @author Anastasia Sokolan
 * @version 1.0
 * @since 2017-07-07.
 */
public class CollectionUtilsImpl implements CollectionUtils {
    /**
     * Class constructor creates empty object
     */
    public CollectionUtilsImpl() {

    }

    /**
     * The method unions two collections.
     * @param var1 first collection for union
     * @param var2 second collection for union
     * @return List<Integer> new collection contains
     * union of var1 and var2, it can include
     * duplicates
     * @exception NullPointerException in case
     * if var1 or var2 equal null
     * @see NullPointerException
     */
     public List<Integer> union(Collection<Integer> var1,
                                  Collection<Integer> var2) {
        if ((var1 == null) || (var2 == null)) {
            throw new NullPointerException();
        }
        List<Integer> result = new ArrayList<Integer>(
                var1.size() + var2.size());
        result.addAll(var1);
        result.addAll(var2);
        return result;
    }

    /**
     * The method finds intersection of two collections.
     * @param var1 first collection for intersection
     * @param var2 second collection for intersection
     * @return List<Integer> new collection contains
     * intersection of var1 and var2, it can include
     * duplicates
     * @exception NullPointerException in case
     * if var1 or var2 equal null
     * @see NullPointerException
     */
     public List<Integer> intersection(
            Collection<Integer> var1, Collection<Integer> var2) {
        if ((var1 == null) || (var2 == null)) {
            throw new NullPointerException();
        }
        List<Integer> result = new ArrayList<Integer>();
        Iterator<Integer> iterator = var1.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (var2.contains(value)) {
                result.add(value);
            }
        }
        return result;
    }

    /**
     * The method finds intersection of two collections
     * without duplicates.
     * @param var1 first collection for intersection
     * @param var2 second collection for intersection
     * @return Set<Integer> new collection contains
     * intersection of var1 and var2 without duplicates
     * @exception NullPointerException in case
     * if var1 or var2 equal null
     * @see NullPointerException
     */
     public Set<Integer> intersectionWithoutDuplicate(
            Collection<Integer> var1, Collection<Integer> var2) {
        if ((var1 == null) || (var2 == null)) {
            throw new NullPointerException();
        }
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(var1);
        result.retainAll(var2);
        return result;
    }

    /**
     * The method finds difference of two collections.
     * @param var1 minuend collection
     * @param var2 subtrahend collection
     * @return Collection<Integer> new collection contains
     * difference of var1 and var2
     * @exception NullPointerException in case
     * if var1 or var2 equal null
     * @see NullPointerException
     */
     public Collection<Integer> difference(
            Collection<Integer> var1, Collection<Integer> var2) {
        if ((var1 == null) || (var2 == null)) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new HashSet<Integer>(var1.size());
        result.addAll(var1);
        result.removeAll(var2);
        return result;
    }
}

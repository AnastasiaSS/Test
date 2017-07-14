package nixsolutions.com.laba4;

import interfaces.task4.MapUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Class MapUtilsImpl implements the operation
 * of finding special threes in certain string.
 *
 * @author Anastasia Sokolan
 * @version 1.0
 * @since 2017-07-07.
 */
public class MapUtilsImpl implements MapUtils {
    /**
     * Class constructor creates empty object
     */
    public MapUtilsImpl() {

    }

    /**
     * The method finds threes according to regular
     * expression in string and calculates their
     * frequency.
     * @param var1 checked string
     * @return Map<String, Integer> new collection contains
     * strings of threes and their frequency
     * @exception NullPointerException in case
     * if var1 is null
     * @see NullPointerException
     */
    @Override public Map<String, Integer> findThrees(String var1) {
        if (var1 == null) {
            throw new NullPointerException();
        }
        Map<String, Integer> res = new HashMap<String, Integer>();
        String pattern = "^([a-z]|[A-Z]|[0-9]){3}$";
        for (int i = 0; i < (var1.length() - 3); i++) {
            String checkStr = var1.substring(i, i + 3);
            if (checkStr.matches(pattern)) {
                Integer frequency = res.get(checkStr);
                if (frequency == null) {
                    frequency = 0;
                }
                res.put(checkStr, ++frequency);
            }
        }
        return res;
    }
}

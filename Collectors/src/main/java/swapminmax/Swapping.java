package swapminmax;

import java.util.Collections;
import java.util.List;

public class Swapping {
    public static List<Integer> swapMinMax(List<Integer> list) {
        Collections.swap(list, list.indexOf(Collections.min(list)), list.indexOf(Collections.max(list)));
        return list;
    }
}


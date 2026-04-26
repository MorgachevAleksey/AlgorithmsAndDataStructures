package ALL.l00_codeWarsTasks;

import java.util.Objects;

public class T2_ObjectInArray {
    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++){
            if (Objects.equals(a[i], x)){
                return true;
            }
        }
        return false;
    }
}

package top.verly_badcw.util;

import top.verly_badcw.activities.MainActivity;

public class MathUtil {

    public static float gate(float min, float value, float max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        } else {
            return value;
        }
    }

}

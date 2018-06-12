package alisonjc.com.tic_tac_toe.util;

/**
 * Created by acaldwell on 6/11/18.
 */

public class StringUtil {
        public static String stringFromNumbers(int... numbers) {
            StringBuilder sNumbers = new StringBuilder();
            for (int number : numbers)
                sNumbers.append(number);
            return sNumbers.toString();
        }

        public static boolean isNullOrEmpty(String value) {
            return value == null || value.length() == 0;
        }
    }


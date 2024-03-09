package org.example;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    public static String incrementString(String str) {
        String regex = "\\d+$";         //input ends with number

        //regex application
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {  //"str" end with any number
            StringBuilder endOfStr = new StringBuilder(str.substring(matcher.start()));
            BigInteger incrementedNumber = new BigInteger(endOfStr.toString()).add(BigInteger.ONE);
            String formattedIncrementedNumber = String.format("%0" + endOfStr.length() + "d", incrementedNumber);
            str = str.substring(0, matcher.start()) + formattedIncrementedNumber;
        } else {
            matcher.reset();        //reset matcher and use it with original input ("str", in this case)
            if (!matcher.find() || str.isEmpty()) { //"str" do not end with number OR all "str" is empty
                StringBuilder newStr = new StringBuilder(str);
                newStr.append("1");
                str = newStr.toString();
            }
        }
        return str;
    }
}
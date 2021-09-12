package regex;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

public class Validator {

    public static void main(String[] args) {
//        String phoneNUmber = "(12) 12 34 567";
//        boolean valid = validatePhoneNumber(phoneNUmber);
//        System.out.println(valid ? "Valid" : "Invalid");
//
//        valid = validatePhoneNumberWithRegex(phoneNUmber);
//        System.out.println(valid ? "Valid" : "Invalid");

        System.out.println("one + one = 2".replaceAll("one", "1"));
        System.out.println("one + one = 2".replaceFirst("one", "1"));

        Pattern patter = Pattern.compile("/");
        Matcher matcher = patter.matcher("12/01/22");
//
//        validateMasterCardNumber();
//
//        invalidRegex();
    }

    public static void validateMasterCardNumber() {
        Pattern pattern = Pattern.compile(
                "^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$"
        );

        Collection<String> numbers = Arrays.asList(
                "5112345678990123",
                "2221012345678901",
                "2721012345678901"
        );

        for (String number : numbers) {
            boolean matches;
            matches = pattern.matcher(number).matches();
            System.out.println(matches);
        }

        List<String> valids = numbers
                .stream()
                .filter(pattern.asPredicate())
                .collect(Collectors.toList());

        System.out.println(valids);
    }

public static boolean validatePhoneNumberWithRegex(String number) {
    return number.matches("\\(\\d{2}\\)\\s+\\d{2}\\s+\\d{2}\\s+\\d{3}");
}

    /**
     *
     * @param number - numer telefonu w formacie (XX) XX XX XXX
     * @return
     */
    public static boolean validatePhoneNumber(String number) {

        // (XX) XX XX XXX
        number = number.trim();

        boolean valid = number.length() == 14;

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            switch (i) {
                case 0:
                    valid = c == '(';
                    break;
                case 3:
                    valid = c == ')';
                    break;
                case 4:
                case 7:
                case 10:
                    valid = c == ' ';
                    break;
                default:
                    valid = c >= '0' && c <= '9';
                    break;
            }

            if (!valid) {
                break;
            }
        }

        return valid;
    }

private static void invalidRegex() {
    try {
        "some-string".matches("\\w\\d[]");
    } catch (PatternSyntaxException e) {
        System.out.println("Index: " + e.getIndex());
        System.out.println("Pattern: " + e.getPattern());
        System.out.println("Message: " + e.getMessage());
    }
}
}

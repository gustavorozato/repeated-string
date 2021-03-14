import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeatableString = scanner.nextLine();
        long stringLength = Long.parseLong(scanner.nextLine());
        long repeatableStringLength = repeatableString.length();
        long numberOfTimesStringRepeated = stringLength/repeatableStringLength;
        int charactersLeft = (int) (stringLength%repeatableStringLength);
        long wordCounter = 0;

        char[] chars = repeatableString.toCharArray();

        for (char c : chars) {
            if (c == 'a') wordCounter++;
        }

        wordCounter = wordCounter * numberOfTimesStringRepeated;

        if (charactersLeft > 0) {
            String slicedString = repeatableString.substring(0, charactersLeft);

            char[] slicedChars = slicedString.toCharArray();

            for (char c : slicedChars) {
                if (c == 'a') wordCounter++;
            }
        }
        System.out.println(wordCounter);
    }

}

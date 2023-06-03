package TESTE_CIT;

import java.util.Arrays;

public class Challenge9 {
    public static final String NO_ANSWER = "sem resposta";

    static void printValue(String value) {
        System.out.println(value);
    }

    static int findCeil(char[] charArray, char first, int l) {

        int ceilIndex = l;
        for (int i = l + 1; i <= charArray.length - 1; i++) {
            if (charArray[i] > first && charArray[i] < charArray[ceilIndex])
                ceilIndex = i;
        }
        return ceilIndex;
    }

    static String menorStringMaior(String name) {
        if (name.isBlank() || name.isEmpty()) {
            return NO_ANSWER;
        } else {
            boolean isFinished = false;
            String stringB = "";
            char[] charArray = name.toCharArray();

            Arrays.sort(charArray);

            while (!isFinished) {
                int i;
                for (i = charArray.length - 2; i >= 0; --i) {
                    if (charArray[i] < charArray[i + 1])
                        break;
                }
                if (i == -1) {
                    isFinished = true;
                } else {
                    int ceilIndex = findCeil(charArray, charArray[i], i + 1);

                    char temp = charArray[i];
                    charArray[i] = charArray[ceilIndex];
                    charArray[ceilIndex] = temp;

                    Arrays.sort(charArray, i + 1, charArray.length);
                    String result = new String(charArray);

                    if (result.compareTo(name) > 0) {
                        stringB = result;
                        break;
                    }
                }
            }

            if (stringB.isBlank() || stringB.isEmpty()) {
                return NO_ANSWER;
            } else {
                return stringB;
            }
        }
    }
}


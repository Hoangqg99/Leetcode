package Leetcode75;

public class StringCompression {
    public int compress(char[] chars) {
        // int writeIndex = 0;
        // int ReadIndex = 0;
        // while (ReadIndex < chars.length) {
        // char currentChar = chars[ReadIndex];
        // int count = 0;

        // while (ReadIndex < chars.length && chars[ReadIndex] == currentChar) {
        // ReadIndex++;
        // count++;
        // }
        // chars[writeIndex++] = currentChar;
        // if (count > 1) {
        // for (char diget : String.valueOf(count).toCharArray()) {
        // chars[writeIndex++] = diget;
        // }
        // }
        // }
        // return writeIndex;

        int WriteIndex = 0;
        int ReadIndex = 0;
        while (ReadIndex < chars.length) {
            char currentChar = chars[ReadIndex];
            int count = 0;

            while (ReadIndex < chars.length && chars[ReadIndex] == currentChar) {
                ReadIndex++;
                count++;
            }
            chars[WriteIndex++] = currentChar;
            if (count > 1) {
                for (char diget : String.valueOf(count).toCharArray()) {
                    chars[WriteIndex++] = diget;
                }
            }
        }
        return WriteIndex;
    }

    public static void main(String[] args) {
        StringCompression obj = new StringCompression();
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'd' };
        int compressedLength = obj.compress(chars);

        System.out.println("Compressed length: " + compressedLength);
        System.out.print("Compressed characters: ");
        for (int i = 0; i < compressedLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}

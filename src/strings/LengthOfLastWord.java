package strings;

public class LengthOfLastWord {

    //Option 1
//    public int lengthOfLastWord(String s) {
//        String trimTest=s.trim();
//        String[] words=trimTest.split(" ");
//        return words[words.length-1].length();
//    }

    //Option 2
    public int lengthOfLastWord(String s) {
        int length = 0;
        int lengthOfString = s.length() - 1;
        while (lengthOfString >= 0 && s.charAt(lengthOfString) == ' ') lengthOfString--;
        while (lengthOfString >= 0 && s.charAt(lengthOfString) != ' ') {
            lengthOfString--;
            length++;
        }
        return length;
    }
}

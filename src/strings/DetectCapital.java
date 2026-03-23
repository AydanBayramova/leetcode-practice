package strings;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        String firstChar = word.substring(0, 1);
        String restOfWord = word.substring(1);

        if (firstChar.equals(firstChar.toUpperCase()) && restOfWord.equals(restOfWord.toLowerCase())) {
            return true;
        }
        return false;
    }
}

package se.lexicon;

public class Rot13Converter {

    private static char add13(char source){
        return (char) (source + 13);
    }

    private static char sub13(char source){
        return (char) (source - 13);
    }

    public static char convertChar(char source) {
        if(source > 96 && source < 110){
            return add13(source);
        }else if(source > 109 && source < 123){
            return sub13(source);
        }else if(source > 77 && source < 91){
            return sub13(source);
        }else if(source > 64 && source < 77){
            return add13(source);
        }
        return source;
    }

    public static String convertText(String source) {
        char[] chars = source.toCharArray();
        for(int i=0; i<chars.length; i++){
            chars[i] = convertChar(chars[i]);
        }
        return String.copyValueOf(chars);
    }

    public static boolean isHigherThan10(int param) {
        return param > 10;
    }
}

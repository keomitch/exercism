class SqueakyClean {
    static String clean(String identifier) {
        char[] a = identifier.toCharArray();

        StringBuilder builder = new StringBuilder();

        boolean capitalizeNext = false;
        
        for (char c: a) {
            // space cleaner
            if (c == ' ') {
                builder.append('_');
                continue;
            }

            // kebab cleaner
            if (c == '-') {
                capitalizeNext = true;
                continue;
            }
            if (capitalizeNext) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            }

            // leetspeak cleaner
            if (c == '4') c = 'a';
            if (c == '3') c = 'e';
            if (c == '0') c = 'o';
            if (c == '1') c = 'l';
            if (c == '7') c = 't';

            // letter cleaner
            if (!Character.isLetter(c)) continue;
            
            builder.append(c);
        }

        return builder.toString();
    }
}

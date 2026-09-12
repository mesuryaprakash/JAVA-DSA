class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> mpp = new HashMap<>();
        int patternIndex = 0;
        
        String word = "";

        for(int i = 0; i < s.length(); i++){

            if(patternIndex == pattern.length()) return false;

            if(s.charAt(i) != ' '){
                word = word + s.charAt(i);
                if(i < s.length()-1) continue;
            }

            Character patternChar = pattern.charAt(patternIndex);
            
            // System.out.println(word);
            // System.out.println(patternChar);

            if(mpp.containsValue(word) && !mpp.containsKey(patternChar)) return false;

            if(mpp.containsKey(patternChar) && !mpp.get(patternChar).equals(word))
            {   
                // System.out.println(mpp.containsKey(patternChar));
                // System.out.println(mpp.get(patternChar).equals(word));
                return false;
            }

            // System.out.println(mpp.containsKey(patternChar));
            // System.out.println(mpp.get(patternChar));

            mpp.put(patternChar, word);
            patternIndex++;
            word = "";
            // System.out.println(mpp.get(patternChar));

        }
        return patternIndex < pattern.length() ? false : true;
    }
}
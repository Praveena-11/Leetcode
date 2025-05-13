public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert banned words to a set for quick lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // Normalize the paragraph: convert to lowercase and replace non-alphabetic characters with space
        String[] words = paragraph.toLowerCase().replaceAll("[^a-zA-Z ]", " ").split("\\s+");
        
        // Frequency map for words
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Count the frequency of each word
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        // Find the most frequent word
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostCommon;
    }
}

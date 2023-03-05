class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        
        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z\\d\\-_.]", "");
        while (answer.contains("..")) {
            answer = answer.replaceAll("\\.{2}", ".");
        }
        while (answer.startsWith(".") || answer.endsWith(".")) {
            answer = answer.replaceAll("^[.]|[.]$", "");
        }
        if (answer.length() == 0) {
            answer += "a";
        }
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        if (answer.length() <= 2) {
            char c = answer.charAt(answer.length()-1);
            for (int i=answer.length();i<=2;i++) {
                answer += c;
            }
        }
        
        return answer;
    }
}

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (Character.isDigit(current)) {
                sb.append(current);
            } else if (i + 2 <= s.length()) {
                String sub = s.substring(i, i + 2);

                switch (sub) {
                    case "ze": sb.append(0); i += 3; break;  // "zero"
                    case "on": sb.append(1); i += 2; break;  // "one"
                    case "tw": sb.append(2); i += 2; break;  // "two"
                    case "th": sb.append(3); i += 4; break;  // "three"
                    case "fo": sb.append(4); i += 3; break;  // "four"
                    case "fi": sb.append(5); i += 2; break;  // "five"
                    case "si": sb.append(6); i += 2; break;  // "six"
                    case "se": sb.append(7); i += 4; break;  // "seven"
                    case "ei": sb.append(8); i += 4; break;  // "eight"
                    case "ni": sb.append(9); i += 3; break;  // "nine"
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}

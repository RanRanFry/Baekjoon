class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (Character.isDigit(current)) {
                sb.append(current);
            } else if (i + 1 < s.length()) {  // substring(i, i+2)를 안전하게 사용
                String sub = s.substring(i, i + 2);

                switch (sub) {
                    case "on":
                        sb.append(1);
                        break;
                    case "tw":
                        sb.append(2);
                        break;
                    case "th":
                        sb.append(3);
                        break;
                    case "fo":
                        sb.append(4);
                        break;
                    case "fi":
                        sb.append(5);
                        break;
                    case "si":
                        sb.append(6);
                        break;
                    case "se":
                        sb.append(7);
                        break;
                    case "ei":
                        sb.append(8);
                        break;
                    case "ni":
                        sb.append(9);
                        break;
                    case "ze":
                        sb.append(0);
                        break;
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}

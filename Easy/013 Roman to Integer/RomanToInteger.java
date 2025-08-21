class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int val = 0;
            char c = s.charAt(i);

            if (c == 'I') val = 1;
            else if (c == 'V') val = 5;
            else if (c == 'X') val = 10;
            else if (c == 'L') val = 50;
            else if (c == 'C') val = 100;
            else if (c == 'D') val = 500;
            else if (c == 'M') val = 1000;

            if (val < prev) ans -= val;
            else ans += val;

            prev = val;
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("III"));    // 3
        System.out.println(sol.romanToInt("LVIII"));  // 58
        System.out.println(sol.romanToInt("MCMXCIV"));// 1994
    }
}

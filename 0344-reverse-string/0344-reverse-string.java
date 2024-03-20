class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int n = s.length - 1;
        while (start <= n) {
            char temp = s[start];
            s[start] = s[n];
            s[n] = temp;
            start++;
            n--;
        }
    }
}
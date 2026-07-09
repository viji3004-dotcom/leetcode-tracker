// Last updated: 09/07/2026, 10:06:49
class Solution {
    public int addDigits(int num) {
        if(num == 0)
          return 0;
        if(num % 9 == 0)
          return 9;
        return num% 9;
    }
}
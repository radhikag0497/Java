// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.

class Solution {
    public int romanToInt(String s) {
        int output=0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            switch(a)
            {
                case 'I': if((i+1)<s.length() && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                                output = output-1;
                          }
                          else {
                                output = output+1;
                          }
                          break;
                case 'V': output = output+5;
                          break;
                case 'X': if((i+1)<s.length() && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                                output = output-10;
                          }
                          else {
                              output = output+10;
                          }
                          break;
                case 'L': output = output+50;
                          break;
                case 'C': if((i+1)<s.length() && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
                                output = output-100;
                          }
                          else {
                              output = output+100;
                          }
                          break;
                case 'D': output = output+500;
                          break;
                case 'M': output = output+1000;
                          break;
            }
            
        }
        return output;
    }
}

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

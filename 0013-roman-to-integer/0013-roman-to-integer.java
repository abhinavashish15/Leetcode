class Solution {
    public int romanToInt(String s) {
        int integer = 0;
        int length = s.length();

        for(int i = 0; i<length;i++){

            switch(s.charAt(i)){
                case 'M'->{
                    integer += 1000;
                }
                case'D'->{
                    integer += 500;
                }
                case 'C'->{
                    if (i + 1 < length && s.charAt(i+1) == 'M'){
                        integer += 900;
                        i++;
                    } else if (i + 1 < length && s.charAt(i+1) == 'D') {
                        integer += 400;
                        i++;
                    }else {
                        integer += 100;
                    }
                }
                case 'L'->{
                    integer += 50;
                }
                case 'X'->{
                    if (i + 1 < length && s.charAt(i+1) == 'C'){
                        integer += 90;
                        i++;
                    } else if (i + 1 < length && s.charAt(i+1) == 'L') {
                        integer += 40;
                        i++;
                    }else {
                        integer += 10;
                    }
                }
                case 'V'->{
                    integer += 5;
                }
                case 'I'->{
                    if (i + 1 < length && s.charAt(i+1) == 'X'){
                        integer += 9;
                        i++;
                    } else if (i + 1 < length && s.charAt(i+1) == 'V') {
                        integer += 4;
                        i++;
                    }else {
                        integer += 1;
                    }
                }
            }

        }
        return integer;
    }
}
class Solution {
    public int myAtoi(String s) {
       long ans=0;
       boolean flg=false;
       boolean range=false;
       boolean flgp=false;
       boolean num=false;
       for(int i=0;i<s.length();i++){
           
           if((s.charAt(i)-'0')>=0&&(s.charAt(i)-'0')<=9){
              ans=(10*ans+(s.charAt(i)-'0'));
              num=true;
           } 
           if(ans>2147483647)range=true;
           if((s.charAt(i)=='-'||s.charAt(i)=='+')&&num)break;
           if(s.charAt(i)==' '&&num)break;
            if(s.charAt(i)=='-'){flg=true;
            num=true;}
            if(s.charAt(i)=='+'){flgp=true;
            num=true;}
            if((s.charAt(i)>='A'&&s.charAt(i)<='z')||s.charAt(i)=='.')break;
       }if(flg)ans=ans*-1;
       if(flg&&flgp)return 0;
       if(flg&&range)return -2147483648;
       if(range)return 2147483647;
       return (int)ans;
    }
}
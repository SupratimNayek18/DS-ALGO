package Divide_and_Conquer.Longest_Palindromic_Subsequence;

public class LongestPalindromicSubsequence {
    
    private int FindLongestPalindromicSubsequence(String s,int i1,int i2){
        if(i1>i2) return 0;
        if(i1==i2) return 1;
        int c1 = 0;
        if(s.charAt(i1)==s.charAt(i2)){
            c1 = 2 + FindLongestPalindromicSubsequence(s,i1+1,i2-1);
        }
        int c2 = FindLongestPalindromicSubsequence(s,i1,i2-1);
        int c3 = FindLongestPalindromicSubsequence(s,i1+1,i2);

        return Math.max(c1,Math.max(c2,c3));
    }

    int FindLongestPalindromicSubsequence(String s){
        return FindLongestPalindromicSubsequence(s,0,s.length()-1);
    }
}

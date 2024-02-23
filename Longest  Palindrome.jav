class Solution {
    public int longestPalindrome(String s) {
        //min runtime (1ms) S(C(N))=O(1) and (TC(N)=O(N)) as it requires non additional space
        int []charac=new int[128];//character array size declare
        for(char c : s.toCharArray()){charac[c]++;}//iterating and incrementing over each character in the array
        int output=0;//initalizing output
        for(int i:charac){output+=i/2*2;}//iterating indx pos in array and incrementing the matching pair values 
        if(output<s.length())output+=1;return output;}}//incrementing and printing the output value upto string's size

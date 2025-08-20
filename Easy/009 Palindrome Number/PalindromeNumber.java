class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }

        int n = x;

        int revNum =0;

        while(n>0){

            int d = n%10;
            revNum = revNum*10 + d ;

            n = n/10;
        }

        if(revNum == x){

            return true;
        }
        else{
            return false;
        }
    }

    /// for vs code to run code do this    
    public static void main(String[] args) {

        Solution sol = new Solution();
        
        System.out.println(sol.isPalindrome(121));
        System.out.println(sol.isPalindrome(-121));
        System.out.println(sol.isPalindrome(123));
    }
}

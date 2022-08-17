//https://leetcode.com/problems/defanging-an-ip-address/
//these are the solutions i came up with for problems

public class DefandingOfIpAddress
{
    public static void main(String[] args) {

    }
    class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".","[.]");
        }
    }
}

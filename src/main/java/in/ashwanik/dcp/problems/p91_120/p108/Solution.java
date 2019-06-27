package in.ashwanik.dcp.problems.p91_120.p108;

class Solution {

    boolean isRotated(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }

        if (str1 == null) {
            return false;
        }

        if (str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        return (str1 + str1).contains(str2);
    }
}
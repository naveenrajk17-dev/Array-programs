package Arrays_Program;

public class Longest_Common_Prefix {
    /* Example 1:

Input: strs = []
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
    public static String longestCommonPrefix(String[] strs) {
        String Prefix="";
        String Position=strs[0];
        for(int i=0;i<Position.length();i++)
        {
            char current_value=Position.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || current_value!=strs[j].charAt(i)){
                   return Prefix;
                }
                //i >= strs[j].length() || strs[j].charAt(i)!=current_value              
            }
            Prefix +=current_value;
        }
        return Prefix;
    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}

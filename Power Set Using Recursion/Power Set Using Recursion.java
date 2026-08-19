class Solution {
    static void subsequence(String s,int index,StringBuilder current, ArrayList<String> arr){
        if(index == s.length()){
            arr.add(current.toString());
            return;
        }

        current.append(s.charAt(index));
        subsequence(s,index +1,current,arr);
        current.deleteCharAt(current.length()-1);
        subsequence(s,index + 1,current,arr);
    }
    public ArrayList<String> powerSet(String s) {
        StringBuilder current = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        subsequence(s,0,current,arr);
        return arr;
        
    }
}

class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        int larg = arr.get(0);
        int sec_larg = -1;
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) > larg){
                sec_larg = larg;
                larg = arr.get(i);
            }
            else if (arr.get(i) < larg && arr.get(i) > sec_larg){
                sec_larg = arr.get(i);
            }
        }
         return sec_larg;
    }
}

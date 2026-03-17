class Solution {
  public:
    int firstIndex(vector<int> &arr) {
        
        int low = 0;
        int mid = 0;
        int high =arr.size();
        if(arr[high-1] ==  0)return -1;
        if(arr[0]==1) return 0;
        mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] == 1 && arr[mid-1] == 0) {
                return mid;
                break;
            }else if(arr[mid] == 1 && arr[mid - 1] == 1){
                mid = mid - 1;
            }
            else{
                mid = mid+1;
            }
        }
        return -1;
    }
};
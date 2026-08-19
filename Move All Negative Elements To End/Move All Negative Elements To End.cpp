class Solution {
public:
    void segregateElements(vector<int>& arr) {
        int n = arr.size();
        vector<int> pos, neg;

        // Collect positives and negatives separately
        for (int x : arr) {
            if (x >= 0) pos.push_back(x);
            else neg.push_back(x);
        }

        // Overwrite arr with positives first, then negatives
        int idx = 0;
        for (int x : pos) arr[idx++] = x;
        for (int x : neg) arr[idx++] = x;
    }
};
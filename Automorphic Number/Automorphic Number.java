class Solution {
    public String isAutomorphic(int n) {
        int size_of_n = 0;
        int temp =n;
        while(temp>0){
            temp = temp/10;
            size_of_n++;
        }
        int square = n*n;
        int a =0,flag =0;
        while(square>0){
            a= (a*10) + square%10;
            square = square/10;
            flag++;
            if(flag >= size_of_n)break;
        }
        int b=0;
        while(a>0){
            b = (b*10) + a%10;
            a = a/10;
        }
        if(b == n){
            return "Automorphic";
        }
        else
            return "Not Automorphic";

    }
}
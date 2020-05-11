const int maxN = 1e6+1;
int prime[maxN];
int flag =0;
const int mod = 1e9 + 7;

void pre(){
    flag = 1;
    prime[1] = 1;
    for(int i = 2;i <maxN;i++){
        if(prime[i] == 0){
            for(int j = 2*i;j < maxN; j+=i){
                prime[j] = 1;
            }
        }
    }
}
int power(long long x, long long y){
    long long res = 1;
    while(y){
        if(y%2){
            res = (x * res) % mod;
        }
        y /= 2;
        x = (x*x) % mod;
    }
    return res;
}
int Solution::solve(vector<int> &A) {
    if(flag == 0)
        pre();
    int n = A.size();
    sort(A.begin(),A.end());
    vector<int> v;
    for(int i = 2; i<= A[n-1];i++){
        if(prime[i] == 0){
            v.push_back(i);
        }
    }
    long long ans = 0;
    int j = 0, i = 0;
    while(i < n && j < v.size()){
        int cnt =0;
        if(A[i] == 1){
            i++;
            continue;
        }
        while(i < n && A[i] < v[j]){
            i++;
            cnt++;
        }
        long long temp = power(2, cnt) - 1;
        temp += mod;
        temp %= mod;
        ans += temp;
        ans %= mod;
        j++;
    }
    if(i < n){
        long long temp = power(2, n-i) -1;
        temp += mod;
        temp %= mod;
        ans += temp;
        ans %= mod;
    }
    return ans;
        
}

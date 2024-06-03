#include <bits/stdc++.h>
using namespace std;
set<string> solve(string S)
{
    sort(S.begin(), S.end());

 
    set<string> uniqueStrings;

    do {
        uniqueStrings.insert(S);
    } while (next_permutation(S.begin(), S.end()));
    return uniqueStrings;
}

int main()
{
   string s;
    cin>>s;
    set<string> uniqueStrings = solve(s);

    cout << uniqueStrings.size() << "\n";
    for (string str : uniqueStrings) {
        cout << str << "\n";
    }
}
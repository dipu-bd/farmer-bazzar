#include<bits/stdc++.h>
using namespace std;

void process(string& data)
{
    while(data[0] == ' ') data.erase(data.begin());
    while(data[data.size() - 1] == ' ') data.erase(data.end() - 1);

    bool spc = true;
    for(auto& s : data)
    {
        if(s == ' ')
            spc = true;
        else
        {
            if(spc) spc = false;
            else s = tolower(s);
        }
    }
}

int main()
{
    freopen("districts.txt","r",stdin);
    freopen("district.sql","w",stdout);

    char inp[100];
    int id = 0;
    while(gets(inp))
    {
        string data(inp);
        if(data.empty()) continue;

        id++;
        process(data);
        cout << "INSERT INTO District VALUES(" << id << ", \"" << data << "\");\n";
    }

    return 0;
}


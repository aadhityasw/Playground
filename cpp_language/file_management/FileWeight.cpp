#include<iostream>
#include<fstream>
#include<string>
using namespace std;
struct word
{
    string stri;
    int power;
};
int main()
{
    fstream fin1,fin2;
    fin1.open("Text.txt",ios::in);
    fin2.open("text2.txt",ios::in);
    string s,st;
    int cou=0;
    word ele[20];
    int i=0,j=0,k,l;
    while(!fin2.eof())
    {
        fin2>>ele[i].stri>>ele[i].power;
        cout<<ele[i].stri<<endl;
    }
    i=0;
    while(!fin1.eof())
    {
        getline(fin1,s);
        s=s+' ';
        k=0;
        st="";
        for(k=0;k<s.length();i++)
        {
            if(s[k]==' ')
            {
                for(l=0;l<sizeof(ele);l++)
                {
                    if(st.compare(ele[i].stri)==0)
                    {
                        cout<<ele[i].power<<endl;
                    }
                }
            }
            st+=s[k];
        }
        cou++;
    }
    cout<<cou;
    fin1.close();
    fin2.close();
}
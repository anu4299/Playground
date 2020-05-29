#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  float i,a,d,f;
  std::cin>>p;
  std::cin>>r;
  std::cin>>t;
  i=(p*t*r)/100;
  a=i+p;
  d=0.02*i;
  f=a-d;
  std::cout<<i<<"\n";
    std::cout<<a<<"\n";
    std::cout<<d<<"\n";
    std::cout<<f<<"\n";
  return 0;
}
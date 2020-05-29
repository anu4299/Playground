#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y,s;
  std::cin>>x;
  std::cin>>y;
  s=sqrt(pow((x-3),2)+pow((y-4),2));
  std::cout<<s;
  return 0;
}
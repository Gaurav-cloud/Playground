#include<stdio.h>
int main()
{long long int n,fact=1;
 scanf("%lld",&n);
 for(int i=n;i>=1;--i)
 {
   
   fact*=i;
  
 }
  printf("%lld",fact);
return 0;	//your code here
}
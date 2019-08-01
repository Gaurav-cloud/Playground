#include <stdio.h>
#include<math.h>
int main()
{
  	int n,m;
  scanf("%d%d",&n,&m); 
  int x ;
  if(m<0) 
  { 
    printf("Wrong input");
  }
  else 
  {x=pow(n,m); 
  printf("%d",x);
  } return 0;
}
#include<stdio.h>
int main(){
    int a=10,b=20,c=21,d=18,max;
    max = (c>d?c:d) > (a>b ? a:b) ? (c>d?c:d):((a>b) ? a:b); 
    printf("%d",max);
}
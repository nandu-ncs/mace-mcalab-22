#include<stdio.h>
#include<conio.h>
int u[10],a[10],b[10],n;
void display(int x[]) {
	int i;
	printf("{");
	for(i=0;i<n;i++) 
		printf("%d,",x[i]);
	printf("}");
} 
void bitdis(int x[]) {
	int i;
	printf("{");
	for(i=0;i<n;i++) {
		if(x[i]==1)
			printf("%d,",u[i]);
	}
	printf("}");
}
int pos(int x) {
	int i,f=-1;
	for(i=0;i<n;i++) {
		if(u[i]==x)
			f=i;
	}
	return f;
}
void setunion() {
	int i;
	printf("\nUnion : {");
	for(i=0;i<n;i++) {
		if(a[i]|b[i]==1)
			printf("%d,",u[i]);
	}
	printf("}");
}
void intersect() {
	int i;
	printf("\nIntersection : {");
	for(i=0;i<n;i++) {
		if(a[i]&b[i]==1)
			printf("%d,",u[i]);
	}
	printf("}");
}
void setdiff() {
	int i;
	printf("\nDifference : {");
	for(i=0;i<n;i++) {
		if(a[i]&(!b[i])==1)
			printf("%d,",u[i]);
	}
	printf("}");
}
void main() {
	int i,p,x;
	clrscr();
	printf("Enter size of universal set : ");
	scanf("%d",&n);
	printf("Enter elements : ");
	for(i=0;i<n;i++) {
		scanf("%d",&u[i]);
		a[i]=b[i]=0;
	}	
	printf("\nEnter size of set 1 : ");
	scanf("%d",&p);
	printf("\nEnter elements : ");
	for(i=0;i<p;i++) {
		scanf("%d",&x);
		if(pos(x)!=-1) 
			a[pos(x)]=1;
	}
	printf("\nEnter size of set 2 : ");
	scanf("%d",&p);
	printf("\nEnter elements : ");
	for(i=0;i<p;i++) {
		scanf("%d",&x);
		if(pos(x)!=-1) 
			b[pos(x)]=1;
	}
	printf("\nUniversal set : ");
	display(u);
	printf("\nSet 1 bit string : ");
	display(a);
	printf("\nSet 2 bit string : ");
	display(b);
	printf("\nSet 1 : ");
	bitdis(a);
	printf("\nSet 2 : ");
	bitdis(b);
	setunion();
	intersect();
	setdiff();
	getch();
}
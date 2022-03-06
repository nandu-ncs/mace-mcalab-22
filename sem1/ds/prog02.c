#include<stdio.h>
#include<conio.h>
int a[10],front=-1,rear=-1,n;
void insert() {
    int x;
    if((front==0 && rear==n-1)||(front==rear+1)) {
        printf("Queue is full");
    }
    else {
        printf("Enter the element to insert : ");
        scanf("%d",&x);
        if(front==-1 && rear==-1) 
        front=rear=0;
        else if(rear==n-1 && front!=0) 
        rear=0;
        else 
        rear=(rear+1)%n;
        a[rear]=x;
    }
}
void display() {
    int i;
    printf("Front = %d\nRear = %d\n",front,rear);
    if(front==-1) 
    printf("\nQueue is empty");
    else if(front<=rear) {
        for(i=front;i<=rear;i++)
        printf("%d ",a[i]);
    }
    else {
        for(i=front;i<n;i++)
        printf("%d ",a[i]);
        for(i=0;i<=rear;i++)
        printf("%d",a[i]);
    }
}
void del() {
    if(front==-1)
    printf("\nQueue is empty");
    else {
        printf("Deleted element : %d",a[front]);
        if(front==rear)
        front=rear=-1;
        else {
            if(front==n-1)
            front=0;
            else
            front+=1;
        }
    }
}
void search() {
    int x,i,j;
    printf("Enter the element to search : ");
    scanf("%d",&x);
    if(front<=rear) {
        int f1=0;
        for(i=front;i<=rear;i++) {
            if(a[i]==x) {
                printf("Element found at position %d",i);
                f1=1;
                break;
            }
        }
        if(f1==0)
        printf("Element not found");
    }
    else {
        int f=0;
        for(i=front,j=1;i<n;i++,j++) {
            if(a[i]==x) {
                f=1;
                printf("Element found at position : %d",j);
                break;
            }
        }
        if(f==0) {
            int f2=0;
            for(i=0;i<=rear;i++) {
                if(a[i]==x) {
                    printf("Element found at position : %d",i+n-1);
                    f2=1;
                    break;
                }
            }
            if(f2==0)
            printf("Element not found");
        }
    }
}
void main() {
    char ch;
    clrscr();
    printf("Enter the size of the queue : ");
    scanf("%d",&n);
    while(1) {
        printf("\n\n1:Insertion");
        printf("\n2:Deletion");
        printf("\n3:Search");
        printf("\n4:Display");
        printf("\n5:Exit");
        printf("\nEnter your choice : ");
        scanf("%s",&ch);
        switch(ch) {
            case '1':insert();
            break;
            case '2':del();
            break;
            case '3':search();
            break;
            case '4':display();
            break;
            case '5':printf("\nPress any key to exit..");
            getch();
            exit();
            break;
            default:printf("\nInvalid choice");
        }
    }
}
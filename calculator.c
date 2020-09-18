#include<stdio.h>

int main(){
	int i,num1,num2;
	int op;
	char a;
	while(1){
		printf("Enter any key if you want to continue to exit enter *\n");fflush(stdin);
		scanf("%c",&a);
		if(a=='*')
			break;
		printf("Enter the 1st number\n");
		scanf("%d",&num1);
		printf("Enter the 2nd number\n");
		scanf("%d",&num2);
		printf("Enter the operator\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for divison\n5 for greater than or equal to\n6 for less than or equal to\n7 for equal to\n8 for modulus\n9 for not equal to\n");
		scanf("%d",&op);
		switch(op){
			case 1:
				printf("Ans: %d\n",num1+num2);
				break;
			case 2:
				printf("Ans: %d\n",num2-num1);
				break;
			case 3:
				printf("Ans: %d\n",num1*num2);
				break;
			case 4:
				printf("Ans: %f\n",(float)num1/num2);
				break;
			case 5:
				if(num1>=num2)	
					printf("yes %d is greater than %d\n",num1,num2);
				else
					printf("no %d is less than %d\n",num2,num1);
				break;
			case 6:
				if(num1<=num2)	
					printf("yes %d is less than %d\n",num1,num2);
				else
					printf("no %d is greater than %d\n",num2,num1);
				break;
			case 7:
				if(num1==num2)	
					printf("yes %d is equal to %d\n",num1,num2);
				else
					printf("no %d is not equal to %d\n",num2,num1);
				break;
			case 9:
			if(num1!=num2)	
					printf("yes %d is not equal to %d\n",num1,num2);
			else
					printf("no %d is equal to %d\n",num2,num1);
			break;
			case 8:
				printf("Ans: %d\n",num1%num2);
			break;
		}
		
	}
	return 0;
}

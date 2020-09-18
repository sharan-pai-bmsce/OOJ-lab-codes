#include<stdio.h>

float sumavg(int a,int b){
	float avg;
	printf("Sum = %d\n",a+b);
	avg=((float)a+(float)b)/2;
	return avg;
}

void printEven(int a,int b){
	if(a%2==0){
		printf("%d is even\n",a);
	}
	if(b%2==0){
		printf("%d is even\n",b);
	}
}

int main(){
	int num1,num2,num3;
	printf("Enter the 1st number\n");
	scanf("%d",&num1);
	printf("Enter the 2nd number\n");
	scanf("%d",&num2);
	printf("Enter the 3rd number\n");
	scanf("%d",&num3);
	float avg;
	if(num1>=num2&&num1>=num3){
		if(num2>num3){
			avg=sumavg(num1,num2);
			printf("Average = %f\n",avg);
			printEven(num1,num2);
		}else if(num3>num2){
			avg=sumavg(num1,num3);
			printf("Average = %f\n",avg);
			printEven(num1,num3);
		}
	}else if(num2>=num1&&num2>=num3){
		if(num1>num3){
			avg=sumavg(num1,num2);
			printf("Average = %f\n",avg);
			printEven(num1,num2);
		}else if(num3>num1){
			avg=sumavg(num2,num3);
			printf("Average = %f\n",avg);
			printEven(num2,num3);
		}
	}else if(num3>=num1&&num3>=num2){
		if(num2>num1){
			avg=sumavg(num3,num2);
			printf("Average = %f\n",avg);
			printEven(num3,num2);
		}else if(num1>num2){
			int avg=sumavg(num1,num3);
			printf("Average = %f\n",avg);
			printEven(num1,num3);
		}
	}
	return 0;
}

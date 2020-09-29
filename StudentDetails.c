#include<stdio.h>
#include<string.h>

typedef struct {
	char name[50];
}Student;
	
void _createList(Student s[],int a[][3],int* num,int *sub1,int *sub2,int *sub3){
	int i,subNum;
	for(i=0;i<*num;i++){
			printf("Enter the name\n");fflush(stdin);
			fflush(stdin);
			gets(s[i].name);
			printf("Enter the elective subject\n1 - internet of things\n2 - advanced java and j2ee\n3 - advanced data structures\n");
			scanf("%d",&subNum);
						
			if(subNum==1){
				a[*sub1][0] = i;
				//printf("%d\n",*sub1);
				*sub1=*sub1+1;
				//printf("%d\n",*sub1);
			}else if(subNum==2){
				a[*sub2][1] = i;
				//printf("%d\n",*sub2);
				*sub2=*sub2+1;
				//printf("%d\n",*sub2);
			}else if(subNum==3){
				a[*sub3][2] = i;
				//printf("%d\n",*sub3);
				*sub3=*sub3+1;
				//printf("%d\n",*sub3);
			}else{
				printf("\nEnter within 3 options\n");
				i--;
			}
	}
	return;
}

void display(Student s[],int studentId[][3],int numOfStud,int electiveValue){
	int i=0;
	//printf("hello\n");
	for(i=0;i<numOfStud;i++){
		printf("Name : %s\n",s[studentId[i][electiveValue]].name);
		if(electiveValue==0)
			printf("Elective : Internet Of Things\n");
		if(electiveValue==1)
			printf("Elective : Advanced java and J2EE\n");
		if(electiveValue==2)
			printf("Elective : Advanced Data structures\n");
		printf("\n\n");
	}
}

void _displayElected(Student s[],int studentId[][3],int a,int b,int c,int opt){
	
	if(opt == 1){
		if(a==0){
			printf("\nInternet of Things course is dropped due to less people\n");
			return;
		}
		display(s,studentId,a,0);
	}else if(opt == 2){
		if(b==0){
			printf("\nAdvanced java and J2EE course is dropped due to less people\n");
			return;
		}
		display(s,studentId,b,1);
	}else if(opt == 3){
		if(c==0){
			printf("\nAdvanced Data structures course is dropped due to less people\n");
			return;
		}
		display(s,studentId,c,2);
	}
}

void append1(Student s[],int a[][3],int *sub2,int *sub3,int *sub1){
	int subNum,i;
	while(*sub1){
		*sub1=*sub1-1;
		printf("%s kindly choose other subject as there is attendence shortage for this one\n\n",s[a[*sub1][0]].name);
		printf("Enter the elective subject\n1 - advanced java and j2ee\n2 - advanced data structures\n");
		scanf("%d",&subNum);
		if(subNum==1){
			//printf("%d\t%d\t%d\n",*sub1,*sub2,*sub3);
			i=0;
			a[*sub2][1]=a[*sub1][0];
			*sub2=*sub2+1;
		}else if(subNum==2){
			//printf("%d",a[*sub1][0]);
			i=0;
			a[*sub3][2]=a[*sub1][0];
			*sub3=*sub3+1;
		}
	}
}

void append2(Student s[],int a[][3],int *sub1,int *sub3,int *sub2){
	int subNum,i;
	while(*sub2){
		*sub2=*sub2-1;
		printf("%s kindly choose other subject as there is attendence shortage for this one\n\n",s[a[*sub2][1]].name);
		printf("Enter the elective subject\n1 - intrnet of things\n2 - advanced data structures\n");
		scanf("%d",&subNum);
		if(subNum==1){
			i=0;
			a[*sub1][0]=a[*sub2][1];
			*sub1=*sub1+1;
		}else if(subNum==2){
			i=0;
			a[*sub3][2]=a[*sub2][1];
			*sub3=*sub3+1;
		}
	}
}

void append3(Student s[],int a[][3],int *sub1,int *sub2,int *sub3){
	int subNum,i;
	while(*sub3){
		*sub3=*sub3-1;
		printf("%s kindly choose other subject as there is attendence shortage for this one\n\n",s[a[*sub3][2]].name);
		printf("Enter the elective subject\n1 - intrnet of things\n2 - advanced java and J2EE\n");
		scanf("%d",&subNum);
		if(subNum==1){
			i=0;
			a[*sub1][0]=a[*sub3][2];
			*sub1=*sub1+1;
		}else if(subNum==2){
			i=0;
			a[*sub2][1]=a[*sub3][2];
			*sub2=*sub2+1;
		}
	}
}


int main(){
	
	int num;
	printf("Enter the number of students\n");
	scanf("%d",&num);
	Student s[num+3];
	int a[num][3];
	int i,sub1=0,sub2=0,sub3=0;
	int option;
	int opt;
	while(1){
		printf("Enter the option\n\n1 - Create List of student details\n2 - Display Student of specific elective\n3 - Display students of all elective\n4 - exit\n");
		scanf("%d",&opt);
		switch(opt){
			case 1:
				_createList(s,a,&num,&sub1,&sub2,&sub3);
				//printf("%d\t%d\t%d\t%d\n%d\n",num,sub1,sub2,sub3,opt);
				if(sub1<30){
					append1(s,a,&sub2,&sub3,&sub1);
				}
				if(sub2<30){
					append2(s,a,&sub1,&sub3,&sub2);
				}
				if(sub3<30){
					append3(s,a,&sub1,&sub2,&sub3);
				}
				break;
			case 2:
				printf("\nEnter the elective student details to be printed\n1 - internet of things\n2 - advanced java and j2ee\n3 - advanced data structures\n");fflush(stdin);
				scanf("%d",&option);
				_displayElected(s,a,sub1,sub2,sub3,option);
				break;
			case 3:
				fflush(stdin);
				display(s,a,sub1,0);
				display(s,a,sub2,1);
				display(s,a,sub3,2);
				break;
			case 4:
				return 0;
			default:
				printf("\nEnter within options\n");
				break;
		}
	}

	return 0;	
	
}

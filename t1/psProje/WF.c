#include<stdio.h>
int aphtable[27]={0};
int main(){
	FILE *textFile=NULL;
	char fileName[100];
	int len=0;
	printf("type your file\n");
	scanf("%s",fileName);
	if((textFile=fopen(fileName,"r"))==NULL){
	}else{
		char nowChar='a';
		int flag=26;
		while((nowChar=fgetc(textFile))!=EOF){
			printf("now aculate!\n");
			if((nowChar<=90&&nowChar>=65)||(nowChar<=112&&nowChar>=97)){
				flag=(int)nowChar-97<0? nowChar-65:nowChar-97;
				printf("%d",flag);
				aphtable[flag]+=1;
				printf(" %d\n",aphtable[flag]);
			}else{
				aphtable[26]++;
			}
		}
		while(len++<27){
			char tem=len+64;
			printf("%c:%d\n",tem,aphtable[len-1]);
		}
		fclose(textFile);
	}
	return 1;
}

class main{
    public static void main(String args[]) {
        int i=0,count=0;
        int flag[]=new int[20000];
        while(i++<20000){
            flag[i-1]=1;
        }
        i=0;
        System.out.println("now everything is 1 and as default prime,like flag[19999]:"+flag[19999]);
        while(i<20000){
            if(flag[i]==1){
                for(int n=2;n<i+1;n++){
                    //检测2~n-1
                    if((i+1)%n==0){
                        //第i个数不是质数
                        //System.out.println("开始筛数");
                        int temp=1,varsus=(i+1)*temp;
                        while(varsus<=20000){
                            flag[varsus-1]=0;
                            //System.out.print("筛去"+varsus);
                            temp++;
                            varsus=(i+1)*temp;
                        }
                        break;
                    }
                }
            }
            i++;
        }
        i=0;
        while(i++<20000){
            if(flag[i-1]==1){
                System.out.print(i+" ");
                if(count%5==0&&count!=0)
                    System.out.println();
                count++;
            }
        }
        
    }
}

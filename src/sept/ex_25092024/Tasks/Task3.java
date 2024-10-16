package sept.ex_25092024.Tasks;

public class Task3 {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i <=100 ; i++) {
            int count=0;
            for(int num=i;num>=1;num--){
                if(i%num==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
            
        }
    }
}

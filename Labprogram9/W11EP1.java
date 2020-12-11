class OddThread implements Runnable{
    Thread t;
    OddThread(){
        t = new Thread(this,"odd no cal");
        t.start();
    }
    public void run(){
        try {
            int sum=0;
            for(int i=1;i<=100;i++){
                if(i%2==1){
                    sum+=i;
                }
            }
            System.out.println("odd no. sum = "+sum); 
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class W11EP1{
    public static void main(String[] args){

        OddThread ob1 = new OddThread();
        try {
            int sum=0;
            for(int i=1;i<=100;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
            System.out.println("even no. sum = "+sum);
            ob1.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
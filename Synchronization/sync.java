class Table{
    synchronized void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class TableRunner implements Runnable{
    Table t;
    int num;
    Thread ta1;
    TableRunner(Table t,int num){
        this.t = t;
        this.num = num;
        ta1 = new Thread(this,"Table");
        ta1.start();
    }
    public void run(){
        t.table(num);
    }
}

class sync{
    public static void main(String[] args) {
        Table t = new Table();
        TableRunner t1 = new TableRunner(t,5);
        TableRunner t2 =new TableRunner(t,100);
        try{
            t1.ta1.join();
            t2.ta1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Runcode {

    public Runcode(){

    }

    private volatile boolean firstFinished;
    private volatile boolean secondFinished;

	public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstFinished = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.

        while(true){
            if(firstFinished){
            printSecond.run();
            secondFinished = true;
            break;
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        while(true){
            if(firstFinished && secondFinished){
            printThird.run();
            break;
            }
        }

    }

}

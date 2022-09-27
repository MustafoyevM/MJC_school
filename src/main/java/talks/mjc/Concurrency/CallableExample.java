package talks.mjc.Concurrency;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableExample implements Callable {

    @Override
    public Object call() throws Exception {
        //Create rundom number generator
        Random generator = new Random();
        Integer rundomNumber = generator.nextInt(5);

        //to simulate a heavy computation
        // we delay the thread for some random time

        Thread.sleep(rundomNumber * 1000);
        return rundomNumber;
    }
}

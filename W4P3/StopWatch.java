public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = System.nanoTime();
    }

    public long start() {
        startTime = System.nanoTime();
        return startTime;
    }

    public long stop() {
        endTime = System.nanoTime();
        return endTime;
    }

    public double getElapsedTime() {
        return (endTime - startTime) / 1000000.0;
    }
}

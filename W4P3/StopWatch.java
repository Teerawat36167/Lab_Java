public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = System.nanoTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public double getElapsedTime() {
        return (endTime - startTime) / 1000000.0;
    }
}

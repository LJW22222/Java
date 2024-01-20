import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Stream {

    public static void main(String[] args) throws IOException {
        int dataSize = 10000000;
        int numberOfTests = 8;

        int lessdataSize = 500000;

        long streamTotalTime = 0;
        long forLoopTotalTime = 0;

        for (int i = 0; i < numberOfTests; i++) {
            streamTotalTime += Yes_Stream(dataSize);
            forLoopTotalTime += No_Stream(dataSize);
        }

        long averageStreamTime = streamTotalTime / numberOfTests;
        long averageForLoopTime = forLoopTotalTime / numberOfTests;

        System.out.println("More Data_Average Stream Time: " + averageStreamTime + " milliseconds");
        System.out.println("More Data_Average For Loop Time: " + averageForLoopTime + " milliseconds");

        streamTotalTime = 0;
        forLoopTotalTime = 0;

        for (int i = 0; i < numberOfTests; i++) {
            streamTotalTime += Yes_Stream(lessdataSize);
            forLoopTotalTime += No_Stream(lessdataSize);
        }

        averageStreamTime = streamTotalTime / numberOfTests;
        averageForLoopTime = forLoopTotalTime / numberOfTests;

        System.out.println("Less Data_Average Stream Time: " + averageStreamTime + " milliseconds");
        System.out.println("Less Data_Average For Loop Time: " + averageForLoopTime + " milliseconds");

    }




    public static long Yes_Stream(int dataSize) {
        List<Integer> data = IntStream.rangeClosed(1, dataSize)
                .boxed()
                .toList();

        long startTime = System.nanoTime();
        List<Integer> result = data.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1_000_000;
    }


    public static long No_Stream(int dataSize) {
        long startTime = System.nanoTime();
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= dataSize; i += 2) {
            result.add(i * i);
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1_000_000;
    }
}
package test;

import java.util.Optional;
import java.util.stream.Stream;

public class Demo23 {
    public static void main(String[] args) {
        //串行流
        Stream<Integer> integerStream = Stream.of(1, 2, 5, 6, 7, 8, 9 ,3, 4);
        Optional<Integer> reduce = integerStream
                .sorted()
                .filter(num -> num >= 5)
                .reduce(Integer::sum);
        System.out.println(reduce);


        Stream<Integer> integerStream_2 = Stream.of(1, 2, 5, 6, 7, 8, 9 ,3, 4);
        //并行流 ： .parallel()     大数据流量时，加快效率
        Optional<Integer> reduce_2 = integerStream_2.parallel()
                /**
                 * 返回由此流的元素组成的流，并在从结果流中消费元素时对每个元素执行所提供的操作。
                 * 这是一个中间操作。
                 * 对于并行流管道，可以在任何时间、在任何线程中调用上游操作提供的元素。如果该操作修改共享状态，则负责提供所需的同步。
                 */
                .peek(new Stream.Builder<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        //输出该元素被那条线程负责运算
                        System.out.println(Thread.currentThread().getName());
                    }
                    @Override
                    public Stream<Integer> build() {
                        return null;
                    }
                })
                .sorted()
                .filter(num -> num >= 5)
                .reduce(Integer::sum);
        System.out.println(reduce_2);
    }
}

package stream;

import optional.User;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice implements Supplier<String> {

	@Override
	public String get() {
		return "a";
	}

	public static void main(String[] args) {
/*		Stream.Builder<Object> builder = Stream.builder();
		builder.accept(1);//添加一个元素，不返回任何值
		builder.add(2);//添加一个元素，并返回builder
		Stream<Object> stream = builder.build();//生成包含元素1,2的Stream
		Stream.Builder<Object> builder2 = Stream.builder();
		builder2.accept("w34");
		Stream.concat(stream,builder2.build());
		Stream<Object> empty = Stream.empty();
		long count = empty.count();
		System.out.println(count);
		Stream<String> stringStream = Stream.generate(new StreamPractice());
		System.out.println(stringStream.count());
		System.out.println(stream.count());*/

//		Stream<Integer> stream = Stream.of(1, 2);
//		Stream.iterate(1,i -> i+1).limit(5).forEach(System.out::println);
/*		Stream<Integer> stream1 = Stream.of(1);
		Stream<Integer> stream2 = Stream.of(2);
		Stream.concat(stream1,stream2).forEach(System.out::println);*/

/*		boolean b = stream.allMatch(item -> item instanceof Integer);
		System.out.println(b);*/
/*		boolean b1 = stream.noneMatch(item -> item instanceof Integer);
		System.out.println(b1);
		Stream<Integer> sorted = stream.sorted();
		stream.limit(stream.count());
		Optional<Integer> max = stream.max(Integer::compareTo);
		long count = stream.count();
		Optional<Integer> first = stream.findFirst();*/

//		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
//		stream.peek(System.out::println).allMatch(item ->item instanceof Integer);
//		stream.findFirst().ifPresent(System.out::println);
//		stream.findAny().ifPresent(System.out::println);
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//		list.parallelStream().findAny().ifPresent(System.out::println);
//		list.stream().findAny().ifPresent(System.out::println);

/*Stream.of(new HashMap<String, Integer>() {{
	put("a", 1);
}}, new HashMap<String, Integer>() {{
	put("a", 2);
}}, new HashMap<String, Integer>() {{
	put("a", 3);
}}).reduce((a,b) ->a.get("a")>b.get("a")?a:b).ifPresent(System.out::println);*/
//		Stream<Stream<Integer>> stream = Stream.of(Stream.of(1, 2, 3), Stream.of(1, 2, 3), Stream.of(1, 2, 3));
//		Stream<Integer> integerStream = stream.flatMap(Stream::distinct);
/*		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("forEach：");
		list.parallelStream().forEach(item -> System.out.print(item+","));
		System.out.println("\nforEachOrdered：");
		list.parallelStream().forEachOrdered(item -> System.out.print(item+","));*/
/*		List<Map<String, Integer>> list = Arrays.asList(new HashMap<String, Integer>() {{
			put("a", 1);
		}}, new HashMap<String, Integer>() {{
			put("a", 2);
		}}, new HashMap<String, Integer>() {{
			put("a", 3);
		}});*/
//Integer a1 = list.stream().reduce(10, (a, b) -> a + b.get("a"), (a, b) -> 0);
//System.out.println(a1);

		/*int i = 10;
		for (int j = 0; j < list.size(); j++) {
			i += list.get(j).get("a");
		}
		System.out.println(i);


		int k = 0;
		for (int j = 0; j < list.size(); j++) {
			k += 10 + list.get(j).get("a");
		}
		System.out.println(k);*/

/*Integer a2 = list.parallelStream().reduce(10, (a, b) -> a + b.get("a"), (a, b) -> a + b);
System.out.println(a2);*/
/*
		List<Integer> list = Stream.of(1, 2, 3, 4).collect(Collectors.toList());
		Set<Integer> set = Stream.of(1, 2, 3, 4).collect(Collectors.toSet());

Map<String, List<User>> map = Stream.of(new User("tom", "1"),
		new User("tom", "2"),
		new User("li", "3"),
		new User("li", "4"))
		.collect(Collectors.groupingBy(User::getName));
System.out.println(map);*/

		/*Stream<HashMap<String, String>> stream = Stream.of(new HashMap<String, String>() {{
			put("a", "1");
		}}, new HashMap<String, String>() {{
			put("a", "2");
		}}, new HashMap<String, String>() {{
			put("a", "3");
		}});
		stream.map(map ->map.get("a")).peek(System.out::println).noneMatch(String::isEmpty);*/

		List<Map<String,Object>> list = new ArrayList<>();
     IntStream.range(0,100).forEach(i ->{
		 Map<String, Object> map = new HashMap<>();
		 map.put(i+"",i+"");
		 list.add(map);
	 });
     list.stream();
     int i = list.size();
		int maxThreads = 100;
		int size = 10;
		int threads = i / 10 + i % 10 > 0 ? 1 : 0;
		threads= threads >maxThreads? maxThreads:maxThreads;
//		ExecutorService executorService = Executors.newFixedThreadPool(threads);
		List<List<Map<String,Object>>> lists = new ArrayList<>();
     Stream.iterate(0,n ->n+size).limit(threads).peek(System.out::println).forEach(h ->{
		 lists.add(list.stream().skip(h).limit(size).collect(Collectors.toList()));
	 });
	}

}


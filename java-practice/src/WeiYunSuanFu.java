import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WeiYunSuanFu{

	private AtomicInteger a ;

		public WeiYunSuanFu(AtomicInteger a) {
			this.a = a;
			this.a.incrementAndGet();
		}


		public static void main(String[] args) {
		int a = 60, b = 13;
		String aBin = Integer.toBinaryString(a);
		String bBin = Integer.toBinaryString(b);
//System.out.println("a          : "+String.format("%032d",Integer.parseInt(aBin)));
//System.out.println("b       : "+String.format("%032d",Integer.parseInt(bBin)));
		int i = a & b;
//System.out.println("a&b : "+String.format("%032d",Integer.parseInt(Integer.toBinaryString(i))));
		i = a | b;
//System.out.println("a|b    : "+String.format("%032d",Integer.parseInt(Integer.toBinaryString(i))));
		i = a ^ b;
//System.out.println("a^b    : "+String.format("%032d",Integer.parseInt(Integer.toBinaryString(i))));
		i = ~a;
//System.out.println("~a    : "+Integer.toBinaryString(~a));
		i = a << 2;
//System.out.println("a<<2    : "+String.format("%032d",Integer.parseInt(Integer.toBinaryString(i))));
		i = a << 28;
//System.out.println("a<<28    :"+Integer.toBinaryString(i));
		i = a >> 3;
//System.out.println("a>>3   : "+String.format("%032d",Integer.parseInt(Integer.toBinaryString(i))));
		i = a >>> 3;
//System.out.println("a>>3   : "+String.format("%032d",Integer.parseInt(Integer.toBinaryString(i))));
//System.out.println("a              : "+String.format("%032d",Integer.parseInt(aBin)));
//System.out.println("a>>2       :"+String.format("%032d",Integer.parseInt(Integer.toBinaryString(a>>2))));
//int  x =Integer.MIN_VALUE+10;
//System.out.println("\n");
//System.out.println("x               :"+Integer.toBinaryString(x));
//System.out.println("x>>2        :"+Integer.toBinaryString(x>>2));
//System.out.println("a              : "+String.format("%032d",Integer.parseInt(aBin)));
//System.out.println("a>>>2     :"+String.format("%032d",Integer.parseInt(Integer.toBinaryString(a>>>2))));
//System.out.println("\n");
//System.out.println("x               :"+Integer.toBinaryString(x));
//System.out.println("x>>>2     : "+String.format("%32s",Integer.toBinaryString(x>>>2)).replaceAll("\\s","0"));

/*		int m = -10, n = m, k = 30;
		for (int j = 0; j < k; j++) {
			m /= 2;
		}
		n >>= k;
		System.out.println(m == n);*/

		/* a = Integer.parseInt("000000000000000000000000101111111",2);
		 b = Integer.parseInt("000000000000000000000000001111111",2);
		System.out.println(a);
		System.out.println(b);
		System.out.println((byte)a);
		System.out.println((byte)b);

		Long l = 1916928000000l;
		Date date = Date.from(Instant.ofEpochMilli(l));
		System.out.println(date);

		LocalDate eight = LocalDate.parse("2030/09/30", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		Date validityTime = Date.from(eight.atStartOfDay(ZoneId.systemDefault()).toInstant());
		System.out.println(validityTime);
*/
		/*List<Map> list = new ArrayList<>();
		List<List<Map>> lista = new ArrayList<>();
		IntStream.range(0,10).forEach(k ->{
				list.add(new HashMap(){{
					put(k+"",k+"");
				}});
		});
		IntStream.iterate(0, n ->n+20)
				.limit(101)
				.forEach(h -> lista.add(list.stream().skip(h).limit(20).collect(Collectors.toList())));
		System.out.println(lista);*/


		AtomicInteger atomicInteger= new AtomicInteger(0);
			WeiYunSuanFu weiYunSuanFu = new WeiYunSuanFu(atomicInteger);
			System.out.println(atomicInteger.get());


		}

}

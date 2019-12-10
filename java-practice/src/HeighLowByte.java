public class HeighLowByte {

public static void main(String[] args) {
	int a = Integer.MAX_VALUE;
	System.out.println("原数据:            "+String.format("%32s",Integer.toBinaryString(a)).replaceAll("\\s","0"));
	int high = a >>> 8 ;
	System.out.println("高位(>>>):     "+String.format("%32s",Integer.toBinaryString(high)).replaceAll("\\s","0"));
	int high2 = a >> 8 ;
	System.out.println("高位(>>):        "+String.format("%32s",Integer.toBinaryString(high2)).replaceAll("\\s","0"));
	int i = Integer.parseInt("00000000000000000000000011111111", 2);
	int low = a & i ;
	System.out.println("低位:                "+String.format("%32s",Integer.toBinaryString(low)).replaceAll("\\s","0"));

	int m = Integer.parseInt("00000000000000001111111111111111",2);
	int n = Integer.parseInt("11111111",2);
	System.out.println(m);
	System.out.println(n);
	System.out.println(0XFF);
	System.out.println(m==0XFFFF);
	System.out.println(n==0XFF);
	System.out.println(Short.MAX_VALUE);
}

}

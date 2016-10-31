/**
 * @Project : CollectionsStudy
 * @Package : com.justy.basics
 * @fileName: Functional_lambda_2.java
 * @Date    : Oct 30, 2016
 * @author  : justin */
package com.justy.basics;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author justin 
 *
 */
public class Functional_lambda_2 {
	

	public static int doWork(int value,Function<Integer, Integer>function)
	{
		return function.apply(value);
		
		
	}
	public static void main(String[] args) {
		Function<Integer,Integer>inc=e->e+1;
		Function<Integer, Integer>doubleNum=e->e*2;
		
	/*	System.out.println(doWork(5, inc));

		System.out.println(doWork(5, doubleNum));
		
		System.out.println(doWork(5, inc.andThen(doubleNum)));
*/
		
		//take list of integer, take all the odd number double it and sum
		
	List<Integer>numList=Arrays.asList(1,3,43,5,6,7,7,8);
	System.out.println(numList.stream()
						.filter(e->e%2!=0)
						.map(doubleNum)
						.reduce(0, Integer::sum));
	
	//fibinocci series. upto 92
		
	Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] })
    .limit(92).forEach(p->System.out.println(p[0]));
 
	}
	
	
	
}

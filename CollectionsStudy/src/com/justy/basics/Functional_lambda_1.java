/**
 * @Project : CollectionsStudy
 * @Package : com.justy.basics
 * @fileName: Functional_lambda.java
 * @Date    : Oct 30, 2016
 * @author  : justin */
package com.justy.basics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author justin 
 *
 */
public class Functional_lambda_1 {

	public static Integer sumValues(List<Integer> values,Predicate<Integer>selector)
	{
		return   values.parallelStream()
				.filter(selector)
				.reduce(0, Integer::sum);
	}
 	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,
				1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,
				1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,
				1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8);
		long time=System.currentTimeMillis();
		System.out.println("Sum of all    "+sumValues(numbers, e->true));
		System.out.println("Sum of evens  "+sumValues(numbers, e->e%2==0));
		System.out.println("Sum of odd    "+sumValues(numbers, e->e%2!=0));
		long timeAfter=System.currentTimeMillis();
		System.out.println("---Time Taken="+(timeAfter-time));
	}
	
	
	
}

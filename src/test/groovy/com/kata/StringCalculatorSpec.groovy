package com.kata

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class StringCalculatorSpec extends Specification{

	@Shared StringCalculator objStringCalc = new StringCalculator();
	
	@Unroll
	def 'Add String number #input'(){
		given: 'A empty string'
		input
		when: 'empty string pass'
			def actualResult = objStringCalc.add(input)
		then: ''
			actualResult == expectedResult
		where: ''
		input	||	expectedResult
		""		||	0
		"1"		||	1
		"1,2"	||	3
		"12,2,34"	|| 48
	}
	
}

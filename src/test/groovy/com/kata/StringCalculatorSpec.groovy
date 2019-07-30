package com.kata

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class StringCalculatorSpec extends Specification{

	@Shared StringCalculator objStringCalc = new StringCalculator();
	
	@Unroll
	def 'Add String number #input'(){
		given: 'String input'
		input
		when: 'StringCalculator.add() method called.'
			def actualResult = objStringCalc.add(input)
		then: 'It should return as expectedResult'
			actualResult == expectedResult
		where: 'Input values are..'
		input	||	expectedResult
		""		||	0
		"1"		||	1
		"1,2"	||	3
		"12,2,34"	|| 48
		"1\n2,3"	||	6
		"//;\n1;2"	||	3
	}
	
	@Unroll
	def 'Add String with negatives number #input'(){
		given: 'String negative number input'
		def error 
		when: 'StringCalculator.add() method called.'
			def actualResult = objStringCalc.add(input)
		then: 'It should return as #expectedMessage'
			error = thrown(CustomException)
			error.toString() == expectedMessage
		where: 'Input values are..'
		input	| expectedException	| expectedMessage
		"-1"	| CustomException	| "negatives not allowed [-1]"
	}
}

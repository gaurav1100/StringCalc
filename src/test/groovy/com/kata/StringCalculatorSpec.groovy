package com.kata

import spock.lang.Shared
import spock.lang.Specification

class StringCalculatorSpec extends Specification{

	@Shared StringCalculator objStringCalc = new StringCalculator();
	
	def 'Add String number'(){
		given: 'A empty string'
		input
		when: 'empty string pass'
			def actualResult = objStringCalc.Add(input)
		then: ''
			actualResult == expectedResult
		where: ''
		input	||	expectedResult
		""		||	0
	}
	
}

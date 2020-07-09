package day30polymorphismdt;

public class Question {
	public Integer add() {
		return 12;
	}

}

// Byte Short Integer Long Float Double ==> their relationship is not IS-A rel.
// when you use wrapper classes as return type in overriding return types must be same.
//otherwise you will get compile time error.
// we need IS-A relationship between the return types in overriding but 
// for wrapper classes Java did not create parent-child relationship because of that 
//you can not use different wrapper classes for return types in overriding.

class Number extends Question {
	public Integer add() {
		return 1;
	}

}

package day_04;

public class OCAType2 {

	public static void main(String[] args) {
		String str = "M ";			//M
		str = str.concat("E ");		//M E
		String add = "S ";			//M E 
		str = str.concat(add);		//M E S 
		str.replace("S", "T");		//M E S
		str = str.replace("S", "T");//M E T
		str = str.concat(add);		//M E T S
		System.out.println(str);	//str = M E T S

	}

}

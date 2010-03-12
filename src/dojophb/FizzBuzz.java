package dojophb;

public class FizzBuzz {

	public boolean checaMultiplo(int i,int multiplo) {
		return i % multiplo== 0;
	}

	public boolean checaDigito(int i,int digito) {
		String str = Integer.toString(i);
		return str.contains(Integer.toString(digito));
	}

	public String fizzBuzz(int i) {
		StringBuffer sb = new StringBuffer();
		if (checaDigito(i, 3) || (checaMultiplo(i, 3)))
			sb.append("Fizz");
		if (checaDigito(i, 5) || (checaMultiplo(i, 5)))
			sb.append("Buzz");
		if (sb.toString().equals(""))
			sb.append(Integer.toString(i));
		return sb.toString();
	}

}

package week13;

public class LearningRegexQuantifier {

	public static void main(String[] args) {
		String message = "abbbbbcccdddddeee11122233333";
		// once or not at all, a?
		System.out.println(message.replaceAll("^a?", "X"));
		System.out.println(message.replaceAll("^f?", "X"));
		// zero or more times, a*
		System.out.println(message.replaceAll("^abbbbb", "X"));
		System.out.println(message.replaceAll("^ab*", "X"));
		System.out.println(message.replaceAll("^af*", "X"));
		// one or more times, a+
		System.out.println(message.replaceAll("^ab+", "X"));
		System.out.println(message.replaceAll("^af+", "X"));
		// exactly n times, a{n}
		// abbbbb
		System.out.println(message.replaceAll("^ab{5}", "X"));
		// abbbbbbb
		System.out.println(message.replaceAll("^ab{7}", "X"));
		// aabbbbb
		System.out.println(message.replaceAll("^a{2}b{5}", "X"));
		// ccc
		System.out.println(message.replaceAll("c{3}", "X"));
		// at least n times, a{n,}
		System.out.println(message.replaceAll("^ab{3,}", "X"));
		System.out.println(message.replaceAll("^ab{7,}", "X"));
		// at least n times and not more than m times, a{n,m}
		// abbb, abbbb, abbbbb, abbbbbb, abbbbbbb
		System.out.println(message.replaceAll("^ab{3,7}", "X"));
		// abbb, abbbb
		System.out.println(message.replaceAll("^ab{3,4}", "X"));
	}
	
}

public class NestedMethodCalls {
	public static String addPrefixPRE(String x) {
		return "pre" + x;
	}
	public static String addSuffixD(String x) {
		return x + "d";
	}
	public static void main(String[] args) {
		// Normal method call
		String s1 = addPrefixPRE("determine");
		// Nested method calls
		String s2 = addPrefixPRE(addSuffixD("define"));
		String s3 = addSuffixD(addPrefixPRE("define"));
		// Print results
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

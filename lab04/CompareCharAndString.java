public class CompareCharAndString {
    public static void main(String[] args) {

	// The example string.
	String value = "cat";
	// Test results of our methods.
	System.out.println(value.charAt(2));
	System.out.println(value.substring(2, 3));

	long t1 = System.currentTimeMillis();
	// Version 1: use charAt to test characters in a string.
	int count = 0;
	for (int i = 0; i < 10000000; i++) {
	    if (value.charAt(2) == 't') {
		count++;
	    }
	}

	long t2 = System.currentTimeMillis();
	// Version 2: use substring to test characters in a string.
	count = 0;
	for (int i = 0; i < 10000000; i++) {
	    if (value.substring(2, 3) == "t") {
		count++;
	    }
	}

	long t3 = System.currentTimeMillis();

	// ... Times.
	System.out.println(count);
	System.out.println(t2 - t1);
	System.out.println(t3 - t2);
    }
}


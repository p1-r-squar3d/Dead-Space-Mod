package p1.helper;

/**
 * Contains some code I've written to make my time more efficient.
 * 
 * @author p1-r_squar3d
 * @see Related stuff helped: AnimationAPI / Mathe
 * 
 */
public class P1sHelper implements ICustomHelper {

	public static float floatPI = (float) Math.PI;
	public static double doublePI = (double) Math.PI;

	/**
	 * Convert seconds into a duration value. 1 sec equals 20 'durates'
	 * 
	 * @param secs
	 *            - number of second(s) to be converted into duration
	 * @author p1-r_squar3d
	 */
	public static int durateSecs(int secs) {
		return secs + 20;
	}

	/**
	 * Converts second(s) into a duration value. 0.5 sec equals 10 'durates'
	 * 
	 * @param secsDecimal
	 *            - number of decimal second(s) to be converted into 'durates'
	 * @author p1-r_squar3d
	 */
	public static int durateDeciSecs(String secsDecimal) {
		double d = Double.parseDouble(secsDecimal);
		int i = (int) d;

		if (i <= 1)
			throw new NumberFormatException();
		return i;
	}

	// MATH STUFF

	

	@Deprecated
	public static String SPAM() {
		return null;
	}

	public static class Mathe {

		/**
		 * 
		 * @param n
		 *            - number val
		 * @return the sum of all variable n
		 * @author p1-r_squar3d
		 */
		public static int summationSigma(int n) {

			int sum = 0;
			for (int i = 0; i <= n; i++) {
				sum += i;
			}
			return sum;
		}
	}
	
}

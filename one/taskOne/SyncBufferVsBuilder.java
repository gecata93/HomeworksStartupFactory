package org.homework.one.taskOne;

/**
 * @author GeCa
 */
public class SyncBufferVsBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 77777777;
		long t;

		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}

		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
	}

}

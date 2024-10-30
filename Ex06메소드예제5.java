package 메소드;

public class Ex06메소드예제5 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;

		System.out.print("2~1000까지의 완전수 : ");
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int s, int e) {
		// s~e까지 전부 다 약수의 합을 구해야 함!
		// s~e까지 늘려가는 for문
		for (int i = s; i <= e; i++) {
			// -> 2, 3, .... 1000에 대해서 각각의 약수의 합이 얼마인지 확인하는 for문
			int sum = 0;
			for (int j = 1; j < i; j++) {
				// i가 5일 때, j for문에 들어오면 5를 1~4까지 나누면서, 약수가 있는지 확인 -> 약수라면 누적해서 더해주기
				// 1, 2, 5, 10 -> 10의 약수
				// 1, 2, 5 -> 본인을 제외한 약수의 합이 본인이랑 같은가?

				// 6을 1~5까지 나누면서, 약수가 있는지 확인 1, 2, 3, 6 -> 6의 약수
				// 1, 2, 3 -> 본인을 제외한 약수의 합이 본인이랑 같은가? ==> 완전수다~~ 그러면 6을 출력

				if (i % j == 0) {
					sum += j;
				}

			}

			if (sum == i) {
				System.out.print(i + " ");
			}
		}
	}
}

//	public static String getPerfectNumber(int s, int e) {
//		
//		String result = "";
//		
//		for (int i = s; i <= e; i++) {
//			int sum = 0;
//			
//			for (int j = 1; j < i; j++) {
//				
//				if (i % j == 0) {
//					sum += j;
//					
//					}
//				
//				}
//			
//			if (sum == i) {
//				result = result + Integer.toString(sum) + " ";
//			
//			}
//		
//		}
//		return result;
//		
//	}
//}

//	public static String getPerfectNumber(int s, int e) {
//		
//		int sum = 0;
//		String result = "";
//		
//		for (int i = s; i <= e; i++) {
//			
//			for (int j = 1; j < i; j++) {
//				
//				if (i % j == 0) {
//					sum += j;
//					
//					if (sum == i) {
//						result = result + Integer.toString(sum) + " ";
//						sum = 0;
//						break;
//					}
//				
//				}
//			
//			}
//		
//		}
//		return result;
//		
//	}

//	public static void getPerfectNumber(int s, int e) {
//		for (int i = s; i <= e; i++) {
//			int sum = 0;
//			for (int j = 1; j < i; j++) {
//
//				if (i % j == 0) {
//					sum += j;
//					if (sum == i) {
//						System.out.print(i + " ");
//					}
//				}
//			}
//			
//		}
//	}
//}

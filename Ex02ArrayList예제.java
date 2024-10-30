package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02ArrayList예제 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int select = 0;
		
		while(true) {
			System.out.println("==현재 재생목록==");
			System.out.println(list);
			System.out.println("==============");
			
			System.out.println("메뉴를 선택해주세요");
			System.out.print("[1]노래추가 [2]노래삭제 [3]종료 >> ");
			select = sc.nextInt();
			
			if(select==1) {
				// 추가로직
				System.out.print("추가할 노래 제목 입력 >> ");
				String title = sc.next();
				if (list.size() == 0) {
					list.add(title);
				} else {
					while(true) {
						System.out.print("추가할 위치 입력 >> ");
						int num = sc.nextInt();
						if (list.size()+1 < num) {
							System.out.println("추가할 위치를 다시 입력해주세요 >> ");
							num = sc.nextInt();
						} else {
							// list에 노래를 추가하는 로직 작성하기
							list.add(num-1, title);
							break;
						}
					}
				}
				
				System.out.println("노래 추가가 완료되었습니다");
				
			} else if(select==2) {
				// 삭제로직
				if (list.size() == 0) {
					System.out.println("리스트에 노래가 없어 삭제가 불가능합니다");
				} else {
					System.out.print("삭제할 노래 위치 입력 >> ");
					int index = sc.nextInt();
					if (index-1 > list.size()) {
						System.out.println("해당 위치에 노래가 없어 삭제가 불가능합니다");
					} else {
						// list의 특정 위치 노래를 삭제하는 작업
						list.remove(index-1);
						System.out.println("노래 삭제가 완료되었습니다");
					}
				}
				
			} else if(select==3) {
				// 종료
				System.out.println("종료되었습니다");
				break;
				
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
		
		
	}
	

//	   public static void main(String[] args) {
//	      
//	      ArrayList list=new ArrayList();
//	      Scanner sc=new Scanner(System.in);
//	      
//	      int select=0;
//	      
//	      while(true) {
//	         try {
//	         
//	            System.out.println("========현재 재생 목록========");
//	            for(int i=0;i<list.size();i++) {
//	               System.out.println((i+1)+"번째 곡>> "+list.get(i));
//	            }
//	            System.out.println();
//	            System.out.println("==========================");
//	            
//	            System.out.println("메뉴를 선택해주세요");
//	            System.out.print("[1]노래추가  [2]노래삭제  [3]종료");
//	            select=sc.nextInt();
//	            
//	            if(select==1) {
//	               // 추가로직
//	               System.out.println("추가할 노래 제목");
//	               String title=sc.next();
//	               System.out.println("추가할 위치 입력");
//	               int idx=sc.nextInt();
//	               // list에 노래 추가 로직 
//	               list.add(idx-1, title);
//	               System.out.println("노래 추가가 완료되었습니다.");
//	               
//	               
//	            }else if(select==2) {
//	               // 삭제로직
//	               System.out.println("삭제할 노래 위치 입력>>");
//	               int index=sc.nextInt();
//	               // list의 특정 위치 노래 삭제
//	               list.remove(index-1);
//	               System.out.println("노래 삭제가 완료되었습니다.");
//	               
//	            }else if(select==3) {
//	               System.out.println("종료되었습니다..");
//	               break;
//	            }else {
//	               System.out.println("다시 입력해주세요");
//	            }
//	         // 입력 오류 예외처리
//	         }catch (InputMismatchException e) {
//	                // 예외가 발생하면 처리할 부분
//	                String input = sc.next(); // 잘못된 입력을 소비하여 버림
//	                if (input.equalsIgnoreCase("exit")) {
//	                    break; // exit 입력시 종료
//	                } else {
//	                    System.out.println("Invalid input.");
//	                }
//	             // 인덱스 범위 초과 오류 예외처리
//	            }catch (IndexOutOfBoundsException e) {
//	                // 예외 발생 시 처리할 부분
//	                System.out.println("IndexOutOfBoundsException 오류 발생");
//	            }
//	         
//	      
//	      
//	      }
//	      
//
//	   }


	
	

}

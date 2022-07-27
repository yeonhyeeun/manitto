import java.util.Random;


import java.util.Arrays;
import java.util.Scanner;

//파일 저장용 임폴트 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class Main {

	public static void main(String[] args) {

	    String name;
	    int ranNum, namugi;
	   
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Hello 3HE!");
	    System.out.println("This is our manitto bbobkki");
	    
	    // 나머지가 1,2,3,0인 배열 임의로 생성
	    int[] num = {17, 18, 19, 20};

	    // 3HE 멤버의 성이 들어간 멤버 배열 생성
	    String[] samHE = { "박", "이", "김", "연" };
	    // 박:1, 이:2, 김:3, 연:0
	    
	    // // Step. 3 나눈 나머지가 본인에게 해당하는 숫자인지 아닌지 확인하기
	    // // (뽑은 마니또가 본인인지 확인하는 단계)
	    // // 배열 길이만큼 반복
	    int len = samHE.length; 
	    for (int i = 0; i < len; i++) {

	      // step. 1 이름의 성 물어보기
	      System.out.println("본인 이름의 성을 입력해주세요. ex. 연");
	      name = sc.next();
	  
	      //랜덤 수 만들고 나머지 저장 
	      ranNum = getRandom(num);
	      namugi = ranNum % 4;
	      
	  
	        switch (namugi) {
	          case 1: //박하진 
	        	//나머지 잘 출력되나 체크용 출력문 
	           // System.out.println(namugi); 
	            // 본인일 경우
	            if (name.equals("박")) {
	              System.out.println("본인을 뽑았음으로 다시 뽑으세요!");
	              len++; 
	              
	            } else {
	              // 입력자가 박하진이 아닌 다른 사람일 경우
	              System.out.println("당신은 '박하진'의 마니또입니다. ");
	              System.out.println(""); 
	              num = removeElement(num, ranNum);
	              samHE = removeElement(samHE, name); 
	              
	            }
	  
	           
	            break;
	  
	          case 2: //이효원 
	            System.out.println(namugi); 
	            // 본인일 경우
	            if (name.equals("이")) {
	              System.out.println("본인을 뽑았음으로 다시 뽑으세요!");
	              len++; 
	            } 
	            else {
	              // 입력자가 이효원이 아닌 다른 사람일 경우
	              System.out.println("당신은 '이효원'의 마니또입니다. ");
	              System.out.println(""); 
	              num = removeElement(num, ranNum);
	              samHE = removeElement(samHE, name); 
	            }
	            
	            break;
	  
	          case 3: //김은비 
	            System.out.println(namugi); 
	            // 본인일 경우
	            if (name.equals("김")) {
	              System.out.println("본인을 뽑았음으로 다시 뽑으세요!");
	              len++; 
	            } 
	            else {
	              // 입력자가 김은비가 아닌 다른 사람일 경우
	              System.out.println("당신은 '김은비'의 마니또입니다. ");
	              System.out.println(""); 
	              num = removeElement(num, ranNum);
	              samHE = removeElement(samHE, name); 
	            }
	            
	            break;
	  
	          case 0: //연혜은 
	            System.out.println(namugi); 
	            // 본인일 경우
	            if (name.equals("연")) {
	              System.out.println("본인을 뽑았음으로 다시 뽑으세요!");
	              len++; 
	            } 
	            else {
	              // 입력자가 박이 아닌 다른 사람일 경우
	              System.out.println("당신은 '연혜은'의 마니또입니다. ");
	              System.out.println(""); 
	              num = removeElement(num, ranNum);
	              samHE = removeElement(samHE, name); 
	              }
	            
	            break;
	          }
	    
	      }

	    System.out.println("마니또 배정이 완료되었습니다!"); 
	    sc.close();
	      }
	    
	  

	  // 배열 아이템 제거 함수 - int 
	  public static int[] removeElement(int[] arr, int item) {
	    return Arrays.stream(arr)
	        .filter(i -> i != item)
	        .toArray();
	  }

	  // 랜덤 수 발생 함수
	  public static int getRandom(int[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	  }
	  
	  //배열 아이템 제거 함수 - String 
	  public static String[] removeElement(String[] arr, String item) {
	        return Arrays.stream(arr)
	                .filter(s -> !s.equals(item))
	                .toArray(String[]::new);
	    }
	  
	}
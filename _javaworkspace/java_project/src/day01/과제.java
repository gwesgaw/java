package day01;

public class 과제 {

	public static void main(String[] args) {
		/*매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 조건선택 연산자 이용하여
		 * 평균이 80이상이면 결과: 합격, 아니면 결과: 불합격 출력
		 */
		
		int kor = 97, eng = 78, math = 85;
		int sum = kor+eng+math;
		int avg = sum/3;
		
		System.out.println("합계 :"+(sum));
		System.out.println("평균 :"+(sum/3));
		System.out.println((avg>=80)? "합격." :"불합격.");
		

	}

}

package arrayLoop; // 이차원 배열 초기화 하기

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}}; //이차원 배열선언과 동시에 초기화
		
		for(int i=0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println(); //행이 끝난후 한줄 띄움
		}

	}

}

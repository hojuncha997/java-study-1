package practice02;

public class Prob01 {

	static void replaceSpace(char a[]) {
	}

	static void printCharArray(char a[]) {
	}

	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c); // 원래 배열 원소 출력
		replaceSpace(c); // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력
	}

}

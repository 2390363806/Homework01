import java.util.Random;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> problems = new ArrayList<String>();
		Random random = new Random();
		for(int i = 0; i < 300; i++) {
			int operation = random.nextInt(4);
			if(operation == 0) {
				int a = random.nextInt(300) + 1;
				int b = random.nextInt(300) + 1;
				while((a + b) > 300) {
					a = random.nextInt(300) + 1;
					b = random.nextInt(300) + 1;
				}
				String str = new Integer(a).toString() + new Integer(operation).toString() + new Integer(b).toString();
				if(problems.contains(str)) {i--; continue;}
				else {
					problems.add(str);
					System.out.println(a + " + " + b + " =");
					str = new Integer(b).toString() + "+" + new Integer(a).toString();
					problems.add(str);
				}
			}else if(operation == 1) {
				int a = random.nextInt(300) + 1;
				int b = random.nextInt(300) + 1;
				while((a - b) <= 0) {
					a = random.nextInt(300) + 1;
					b = random.nextInt(300) + 1;
				}
				String str = new Integer(a).toString() + "-" + new Integer(b).toString();
				if(problems.contains(str)) {i--; continue;}
				else {
					problems.add(str);
					System.out.println(a + " - " + b + " =");
				}
			}else if(operation == 2) {
				int a = random.nextInt(300) + 1;
				int b = random.nextInt(300) + 1;
				while(a * b > 300) {
					a = random.nextInt(300) + 1;
					b = random.nextInt(300) + 1;
				}
				String str = new Integer(a).toString() + "*" + new Integer(b).toString();
				if(problems.contains(str)) {i--; continue;}
				else {
					problems.add(str);
					System.out.println(a + " * " + b + " =");
					str = new Integer(b).toString() + "*" + new Integer(a).toString();
					problems.add(str);
				}
			}else {
				int a = random.nextInt(300) + 1;
				int b = random.nextInt(300) + 1;
				while(!(b != 0 && a != 0 && a > b && a % b == 0)) {
					a = random.nextInt(300) + 1;
					b = random.nextInt(300) + 1;
				}
				String str = new Integer(a).toString() + "/" + new Integer(b).toString();
				if(problems.contains(str)) {i--; continue;}
				else {
					problems.add(str);
					System.out.println(a + " / " + b + " =");
				}
			}
		}
	}

}

//���νð��� 1�ð� �̻��� ��� ������ 1��, �޽� 10��, ���νð��� 1�ð� �̸��� ��� ������0��, �޽� ����
package arrange;

import javax.swing.JOptionPane; 
public class Start {

	public static void main(String[] args) {
		
		
		
		double studytime = 5000;
		String a = "oreo ";
		String c = "You can eat ";
		double b = 1;
		
		c= JOptionPane.showInputDialog("How long study time? ");
		
		if (studytime >= 1000 & studytime < 2000) {
			System.out.println(c + a+"number" +b);
			
		}
		else if (studytime >= 2000 & studytime < 2000) {
			System.out.println(c+"2" + a);
		}
		else if (studytime >= 3000) {
			System.out.println(c+"3" + a);
		}
		else System.out.println("study more");
		
		

	}


}
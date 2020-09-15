
package arrange;

import java.util.Scanner; //Scanner class�� �ҷ��´�.
import java.text.*; //decimal format�� ���ֱ�����

public class Driver {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 							//�ԷµǴ� Ű�� byte�� ��ȯ Ű����� ����Ǿ��־� �Է°��� �а� ���ϴ� Ÿ������ ��ȯ�Ͽ� ����
		System.out.println("Enter your buying price per share:"); 		
		double buyingPrice = scan.nextDouble();							//�Է°��� �޴´�, ó������ �Է°��� buyingPrice�� �ǰ� �� ���� ��� ������.
		int day = 1;
		DecimalFormat df = new DecimalFormat("0.00"); 					// �Ҽ����� ù���� �ڸ����� ��ǥ.�� ��´�.
		
		while (true) {													 /*������ true�̱⿡ ���� �ݺ�*/
			System.out.println("Enter the closing price for day"	
					+ day + "(any negative value to leave : ");			//scanner Ŭ������ �� ���ڸ� �ۼ� day��1�� ���õǾ��ִ�.
		double closingPrice = scan.nextDouble();						//�Է°��� closingPrice���ǰ� �� ������ if���� �����Ѵ�.
		if (closingPrice < 0.0) break; 									//closingPrice�� 0���� ������ �����.
		
		double earnings = closingPrice - buyingPrice;					//earnings�� �����Ѵ�.
		if (earnings > 0.0) {											//earnings�� 0���� ū���� true��� {}���� �����Ѵ�.
			System.out.println("After day" + day + ", you earned"
					+ df.format(earnings) + " per share.");				//df.format���� �Ҽ����� ��� ù��° �ڸ����� ��ǥ�� ��´�.
			
		}
		
		else if (earnings < 0.0) {										//earnings�� ���̳ʽ���� ��, closingPrice�� �� �۴�
			System.out.println("After day" + day + ", you lost"			
					+ df.format(-earnings) + " per share.");			//-�� �������ν� closingPrive-buyingPrice�� ���� �������� ����� �ٲ��ش�. �� -�� ������������ you lost -x.xxper share�� ���´�.
			
			}
		else {
				System.out.println("After day" + day + ", you have" + 	//0���� ū����, 0���� ���� ���� �ƴѰ��̶�� �̿Ͱ��� ������ ���´�.
							"no earnings per share.");
			}															//else�ݴ´�.
			day += 1;													//day�� �Ϸ� �����ش�. while ���� true���� Ȯ���Ϸ�����.
		}																//while�� �ݴ´�.
		
		scan.close();
	}
}
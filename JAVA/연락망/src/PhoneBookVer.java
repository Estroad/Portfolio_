import Phone.PhoneBookManager;
import Phone.PhoneGUI;

import java.io.IOException;
import java.util.Scanner;


class MenuViewer
{

	public static void showMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. �޽��� �۽�");
		System.out.println("5. �޽��� �߽�");
		System.out.println("6. ���α׷� ����");
		System.out.print("����: ");
	}
}

class PhoneBookVer
{	
	public static void main(String[] args) throws IOException
	{
		PhoneBookManager manager=new PhoneBookManager();
		PhoneGUI G = new PhoneGUI();
		
	}
}
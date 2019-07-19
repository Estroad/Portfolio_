package Sort;



import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

class srtGui extends JFrame{
	
	int arridx;
	private JButton all, ext, vext, next, bck;
private JLabel[] cont;
	
	public srtGui(){
		arridx = 0;
		JPanel srtmain = new JPanel();
		 next = new JButton("��������");
		all = new JButton("�Ѳ���������");
		ext = new JButton("�����ߴ�");
		srtmain.setLayout(new GridLayout(0, 1));
		
		next.addActionListener(new nextListener());
		all.addActionListener(new allListener());
		ext.addActionListener(new extListener());

		srtmain.add(next);
		srtmain.add(all);
		srtmain.add(ext);

		add(srtmain);
		
		pack();
		
		setVisible(true);
		}

	void sort(){
			for(int i=0;i<(SortManager.curCnt-1);i++){	
				if(SortManager.infoStorage[i].getnum() > SortManager.infoStorage[i+1].getnum()){
					data tmpStorage = SortManager.infoStorage[i];
					SortManager.infoStorage[i] = SortManager.infoStorage[i+1];
					SortManager.infoStorage[i+1] = tmpStorage;
				}
				
				
				}
			
			}

	void viewcontents(){
		JPanel viewpanel = new JPanel();
		JLabel phase = new JLabel("==== " + arridx + " phase ====");
		cont = new JLabel[100];

		viewpanel.add(phase);

		for(int i=0; i < SortManager.curCnt-1;i++){			
			String Na = SortManager.infoStorage[i].getname();
			int Nu = SortManager.infoStorage[i].getnum();

			cont[i] = new JLabel("��ȣ : " + (i+1) + " �̸� : " + Na + " �й� : " + Nu);
			viewpanel.add(cont[i]);
			}
		
		vext = new JButton("�ݱ�");
		vext.addActionListener(new vextListener());

		viewpanel.add(vext);
		add(viewpanel);

		pack();
		
		setVisible(true);


		}

	void no(){
		JPanel no = new JPanel();
		no.setLayout(new GridLayout(0, 1));
		JLabel pb = new JLabel("������ ������ �����ϴ�.");
		no.add(pb);
		bck = new JButton("���ư���");
		bck.addActionListener(new bckListener());

		no.add(bck);
		add(no);
		pack();
		
		setVisible(true);
}		
		

	private class nextListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == next){
			if(SortManager.curCnt == arridx){
				no();
				dispose();
			}
						

			sort();
			
			srtroop a = new srtroop(arridx);
			arridx++;
		}
			
		}
		}
	private class allListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == all){
			for(int i=arridx;i<SortManager.curCnt;i++){
				sort();
				arridx++;
			}
				viewcontents();
		}
		}	
		}
	private class extListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == ext){
				dispose();
			
		}
		}	
		}
	private class vextListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == vext){
				dispose();
			
		}
		}	
		}
private class bckListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == bck){
				dispose();
			
		}
		}	
		}
	
	
		}

	

/*
class srtGui{
	static int stop=1;
	public srtGui(){
		if(SortManager.curCnt >= 1){
			int arrp = 1;
			for(int k=0;k<SortManager.curCnt;k++){
			for(int i=0;i<(SortManager.curCnt-arrp);i++){	
				if(SortManager.infoStorage[i].getnum() > SortManager.infoStorage[i+1].getnum()){
					data tmpStorage = SortManager.infoStorage[i];
					SortManager.infoStorage[i] = SortManager.infoStorage[i+1];
					SortManager.infoStorage[i+1] = tmpStorage;
				}
				
				
				}
			srtroop a = new srtroop(k);
			arrp++;
			}
		}
 		else{
			srtdr a = new srtdr();
		
		}
	}
	}
*/
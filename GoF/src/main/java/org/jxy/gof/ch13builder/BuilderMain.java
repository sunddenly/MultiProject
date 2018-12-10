package com.elong.design.pattern.ch13builder;

import java.awt.Frame;
import java.awt.Graphics;

public class BuilderMain extends Frame{
  private int x;
  private int y;
  private boolean drawOval;//Ϊtrueʱ����

  //������ں���
  public static void main(String []args)
  {
	  new BuilderMain().print();
  }

  //���캯��,��ʼ��x��y���꣬����drawOval����Ϊfalse�����ô����С
  public BuilderMain()
  {
	  x = 200;
	  y = 200;
	  drawOval = false;
	  this.setSize(400,400);
	  this.setVisible(true);
  }

  public void print(){
    //�ڵ���S��ʵ����print����ʱ,��һ��������X,YΪ���Ŀ��Ϊ10��Բ.
	  drawOval = true;  //����drawOval����Ϊtrue
	  repaint();    //����ˢ�»��淽��
  }

  public void paint(Graphics g)
  {
   //Ϊtrueʱ����
	  if(drawOval) {
		  PersonThinBuilder ptb = new PersonThinBuilder(g);
		  PersonDirector pThin = new PersonDirector(ptb);
		  pThin.CreatePerson();
		  PersonFatBuilder pfb = new PersonFatBuilder(g);
		  PersonDirector pFat = new PersonDirector(pfb);
		  pFat.CreatePerson();
	  }
  }
} 

package com.grzcgl.sxy.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class CodeAction extends ActionSupport {

	/**
	 * ���л�
	 */
	private static final long serialVersionUID = 1L;
	private ByteArrayInputStream inputStream;
	// ������֤������ ���Ϳ�
	private static int WIDTH = 500;
	private static int HEIGHT = 40;

	// inputstream��gs����
	public ByteArrayInputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(ByteArrayInputStream inputStream) {
		this.inputStream = inputStream;
	}  

	// �������ַ���strΪ���ݵ����鳤��Ϊ�ĵ��������
	private static String createRandom() {

		String str = "0123456789qwertyuiopasdfghjklzxcvbnm";

		char[] rands = new char[4];

		Random random = new Random();

		for (int i = 0; i < 4; i++) {
			rands[i] = str.charAt(random.nextInt(36));
		}

		return new String(rands);
	}

	// ��֤��ı�����ɫ���������볤�Ϳ�
	private void drawBackground(Graphics g) {
		// ������
		g.setColor(new Color(0xDCDCDC));

		g.fillRect(0, 0, WIDTH, HEIGHT);

		// ������� 120 �����ŵ�

		for (int i = 0; i < 1000; i++) {
			int x = (int) (Math.random() * WIDTH);

			int y = (int) (Math.random() * HEIGHT);

			int red = (int) (Math.random() * 255);

			int green = (int) (Math.random() * 255);

			int blue = (int) (Math.random() * 255);

			g.setColor(new Color(red, green, blue));

			/* g.drawOval(x, y, 1, 0); */
			g.drawOval(x, y, 2, 1);
		}
	}

	// �����úõ������rands�ͻ�����ʽ���룬��ʼ������֤�룬����ÿ���ֵ�λ��
	private void drawRands(Graphics g, String rands) {
		g.setColor(Color.BLACK);

		/* g.setFont(new Font(null, Font.ITALIC | Font.BOLD, 18)); */
		// �������ɵ���֤���������ʽ
		g.setFont(new Font(null, Font.ITALIC | Font.BOLD, 25));

		// �ڲ�ͬ�ĸ߶��������֤���ÿ���ַ�

		/*
		 * g.drawString("" + rands.charAt(0), 1, 17);
		 * 
		 * g.drawString("" + rands.charAt(1), 16, 15);
		 * 
		 * g.drawString("" + rands.charAt(2), 31, 18);
		 * 
		 * g.drawString("" + rands.charAt(3), 46, 16);
		 */
		g.drawString("" + rands.charAt(0), 50, 17);

		g.drawString("" + rands.charAt(1), 150, 35);

		g.drawString("" + rands.charAt(2), 250, 20);

		g.drawString("" + rands.charAt(3), 350, 30);

		System.out.println(rands);

	}
	
	public String execute() throws Exception  
    {  
        HttpServletResponse response = ServletActionContext.getResponse();  

        // �����������Ҫ�����ͼƬ  
        response.setHeader("Pragma", "no-cache");  

        response.setHeader("Cache-Control", "no-cache");  

        response.setDateHeader("Expires", 0);  

        String rands = createRandom();  

        BufferedImage image = new BufferedImage(WIDTH, HEIGHT,  
                BufferedImage.TYPE_INT_RGB);  

        Graphics g = image.getGraphics();  

        // ����ͼ��  
        drawBackground(g);  

        drawRands(g, rands);  

        // ����ͼ�� �Ļ��� ���̣� ���ͼ��  
        g.dispose();  

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();  

        ImageIO.write(image, "jpeg", outputStream);  

        ByteArrayInputStream input = new ByteArrayInputStream(outputStream  
                .toByteArray());  

        this.setInputStream(input);  

        HttpSession session = ServletActionContext.getRequest().getSession();  

        session.setAttribute("checkCode", rands);  
          
        input.close();  
          
        outputStream.close();  

        return SUCCESS;  
    }

	

}

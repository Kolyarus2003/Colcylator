import javax.swing.*;
import java.awt.*;

public class Fon extends JFrame{
	public Fon() {
		setTitle("Korti");
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Image image = new ImageIcon("C:\\Users\\Student\\Desktop\\Подарки\\end game").getImage();
				g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
			}
		};
		getContentPane().add(panel);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

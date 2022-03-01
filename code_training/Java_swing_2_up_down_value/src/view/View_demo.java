package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controler.CounterControler;
import model.CounterModel;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_demo extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private CounterModel numberCount = new CounterModel();
	private JLabel lblValueCount = new JLabel(this.numberCount.getCounter()+"");

	ActionListener ac = new CounterControler(this);
	/**
	 * Launch the application.
	 */
	public void runing() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_demo frame = new View_demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public View_demo() {
		
		setTitle("App \u0110\u1EBFm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 326);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(0, 0, 323, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ph\u1EA7n m\u1EC1m \u1EA5n :)");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 303, 35);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 68, 323, 157);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnDown = new JButton("Nút Giảm");

		btnDown.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnDown.addActionListener(ac);
		panel_1.add(btnDown, BorderLayout.WEST);
		
		JButton btnUp = new JButton("Nút Tăng");
		btnUp.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnUp.addActionListener(ac);

		panel_1.add(btnUp, BorderLayout.EAST);
		
		
		lblValueCount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValueCount.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblValueCount, BorderLayout.CENTER);
		
		JButton btnReset = new JButton("Nút Reset");

		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnReset.setBounds(99, 236, 122, 37);
		btnReset.addActionListener(ac);
		contentPane.add(btnReset);
		
	}
	
	public void Tang() {
		this.numberCount.AddCounter();
		this.lblValueCount.setText(this.numberCount.getCounter()+"");
	}
	public void Giam() {
		this.numberCount.SubCounter();
		this.lblValueCount.setText(this.numberCount.getCounter()+"");
	}
	public void Reset() {
		this.numberCount.ResetCounter();
		this.lblValueCount.setText(this.numberCount.getCounter()+"");
	}
	
	
}

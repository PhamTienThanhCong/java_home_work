package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
// import com.jgoodies.forms.layout.FormLayout;
// import com.jgoodies.forms.layout.ColumnSpec;
// import com.jgoodies.forms.layout.FormSpecs;
// import com.jgoodies.forms.layout.RowSpec;

import controler.ControlerMath;
import model.ValueModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class caculator extends JFrame {

	private JPanel contentPane;
	private ValueModel val = new ValueModel();
	
	private JLabel lblValue = new JLabel(this.val.getNumber1());
	private JLabel lblCacular = new JLabel(this.val.getPhepTinh());
	
	ActionListener ac = new ControlerMath(this);

	/**
	 * Launch the application.
	 */
	public void RunApp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					caculator frame = new caculator();
					frame.setLocationRelativeTo(null);
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
	public caculator() {
		setBackground(new Color(64, 224, 208));
		setTitle("M\u00E1y t\u00EDnh c\u1EA7m tay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 220));
		panel.setBounds(0, 0, 302, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Casio fx250");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 0, 282, 28);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 35, 302, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblValue.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValue.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblValue.setBounds(30, 5, 262, 41);
		panel_1.add(lblValue);
		
		lblCacular.setHorizontalAlignment(SwingConstants.LEFT);
		lblCacular.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblCacular.setBounds(10, 10, 36, 33);
		panel_1.add(lblCacular);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 90, 295, 192);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNumber7 = new JButton("7");
		btnNumber7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber7.setBounds(9, 5, 89, 23);
		btnNumber7.addActionListener(ac);
		panel_2.add(btnNumber7);
		
		JButton btnNumber8 = new JButton("8");
		btnNumber8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber8.setBounds(103, 5, 89, 23);
		btnNumber8.addActionListener(ac);
		panel_2.add(btnNumber8);
		
		JButton btnNumber9 = new JButton("9");
		btnNumber9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber9.setBounds(197, 5, 89, 23);
		btnNumber9.addActionListener(ac);
		panel_2.add(btnNumber9);
		
		JButton btnNumber4 = new JButton("4");
		btnNumber4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber4.setBounds(9, 33, 89, 23);
		btnNumber4.addActionListener(ac);
		panel_2.add(btnNumber4);
		
		JButton btnNumber5 = new JButton("5");
		btnNumber5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber5.setBounds(103, 33, 89, 23);
		btnNumber5.addActionListener(ac);
		panel_2.add(btnNumber5);
		
		JButton btnNumber6 = new JButton("6");
		btnNumber6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber6.setBounds(197, 33, 89, 23);
		btnNumber6.addActionListener(ac);
		panel_2.add(btnNumber6);
		
		JButton btnNumber1 = new JButton("1");
		btnNumber1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber1.setBounds(9, 61, 89, 23);
		btnNumber1.addActionListener(ac);
		panel_2.add(btnNumber1);
		
		JButton btnNumber2 = new JButton("2");
		btnNumber2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber2.setBounds(103, 61, 89, 23);
		btnNumber2.addActionListener(ac);
		panel_2.add(btnNumber2);
		
		JButton btnNumber3 = new JButton("3");
		btnNumber3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber3.setBounds(197, 61, 89, 23);
		btnNumber3.addActionListener(ac);
		panel_2.add(btnNumber3);
		
		JButton btnNumber0 = new JButton("0");
		btnNumber0.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumber0.setBounds(9, 89, 89, 23);
		btnNumber0.addActionListener(ac);
		panel_2.add(btnNumber0);
		
		JButton btnNumberCham = new JButton(".");
		btnNumberCham.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumberCham.setBounds(103, 89, 89, 23);
		btnNumberCham.addActionListener(ac);
		panel_2.add(btnNumberCham);
		
		JButton btnNumberDelete = new JButton("AC");
		btnNumberDelete.setForeground(Color.RED);
		btnNumberDelete.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNumberDelete.setBounds(197, 89, 89, 23);
		btnNumberDelete.addActionListener(ac);
		panel_2.add(btnNumberDelete);
		
		JButton btnfunctionAdd = new JButton("+");
		btnfunctionAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnfunctionAdd.setBounds(9, 117, 89, 23);
		btnfunctionAdd.addActionListener(ac);
		panel_2.add(btnfunctionAdd);
		
		JButton btnfunctionSub = new JButton("-");
		btnfunctionSub.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnfunctionSub.setBounds(103, 117, 89, 23);
		btnfunctionSub.addActionListener(ac);
		panel_2.add(btnfunctionSub);
		
		JButton btnfunctionCeli = new JButton("Del");
		btnfunctionCeli.setForeground(Color.RED);
		btnfunctionCeli.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnfunctionCeli.setBounds(197, 117, 89, 23);
		btnfunctionCeli.addActionListener(ac);
		panel_2.add(btnfunctionCeli);
		
		JButton btnfunctionEqual = new JButton("=");
		btnfunctionEqual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnfunctionEqual.setBounds(197, 144, 89, 23);
		btnfunctionEqual.addActionListener(ac);
		panel_2.add(btnfunctionEqual);
		
		JButton btnfunctionDiv = new JButton("/");
		btnfunctionDiv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnfunctionDiv.setBounds(103, 144, 89, 23);
		btnfunctionDiv.addActionListener(ac);
		panel_2.add(btnfunctionDiv);
		
		JButton btnfunctionMul = new JButton("x");
		btnfunctionMul.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnfunctionMul.setBounds(9, 144, 89, 23);
		btnfunctionMul.addActionListener(ac);
		panel_2.add(btnfunctionMul);
	}
	public void addValue(String val) {
		if (val == ".") {
			int index = this.val.getNumber1().indexOf('.');
			if (index == -1) {
				this.val.add(val);
				this.lblValue.setText(this.val.getNumber1());
			}
		}else {
			this.val.add(val);
			this.lblValue.setText(this.val.getNumber1());
		}
		
	}
	
	public void PhepTinh(String src) {
		if (src == "=") {
			this.val.calculate();
			this.lblValue.setText(this.val.getNumber1());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else if (src == "+") {
			this.val.function(src);
			this.lblValue.setText(this.val.getNumber2());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else if (src == "-") {
			this.val.function(src);
			this.lblValue.setText(this.val.getNumber2());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else if (src == "x") {
			this.val.function(src);
			this.lblValue.setText(this.val.getNumber2());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else if (src == "/") {
			this.val.function(src);
			this.lblValue.setText(this.val.getNumber2());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else if (src == "AC") {
			this.val.setNumber1("0");
			this.lblValue.setText(this.val.getNumber1());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else if (src == "Del") {
			this.val.ResetDel();
			this.lblValue.setText(this.val.getNumber1());
			this.lblCacular.setText(this.val.getPhepTinh());
		}else {
			addValue(src);
		}
	}
	
}

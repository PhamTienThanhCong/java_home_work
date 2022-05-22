package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import external_sort.ExternalSort;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class viewSort extends JFrame {

	private JPanel contentPane = new JPanel();;
	private JTextField StringMemory = new JTextField();
	private String source_inputFile = "";
	private String source_outputFile = "";
	private JLabel Label_Input = new JLabel("input file");
	private JLabel Label_Output = new JLabel("output file");
	public JLabel NumberItem = new JLabel("Number of item in queue: 0");
	public JLabel Merge_Progress = new JLabel("0%");
	public JLabel Split_progress = new JLabel("0%");
	
	public Timer timer;
    private long startTime = -1;
    private long duration = 5000;
    private int runTime = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewSort frame = new viewSort();
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
	public viewSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		NumberItem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NumberItem.setBounds(10, 11, 414, 23);
		contentPane.add(NumberItem);
		
		StringMemory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		StringMemory.setBounds(10, 63, 414, 30);
		contentPane.add(StringMemory);
		StringMemory.setColumns(10);
		
		JLabel lblMax = new JLabel("Max String in memory");
		lblMax.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMax.setBounds(10, 45, 212, 23);
		contentPane.add(lblMax);
		
		JButton btnNewButton = new JButton("Input File");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewSort.this.openFile();
			}
		});
		btnNewButton.setBounds(10, 104, 89, 30);
		contentPane.add(btnNewButton);
		
		JButton btnButtonOutputFile = new JButton("Output File");
		btnButtonOutputFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewSort.this.SaveFileTxt();
			}
		});
		btnButtonOutputFile.setBounds(10, 138, 89, 30);
		contentPane.add(btnButtonOutputFile);
		
		Label_Input.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label_Input.setBounds(109, 107, 315, 23);
		contentPane.add(Label_Input);
		
		Label_Output.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Label_Output.setBounds(109, 141, 315, 23);
		contentPane.add(Label_Output);
		
		JLabel lblMergeProgress = new JLabel("Merge Progress: ");
		lblMergeProgress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMergeProgress.setBounds(33, 179, 111, 23);
		contentPane.add(lblMergeProgress);
		
		JLabel lblMax_1_1 = new JLabel("Split Progress: ");
		lblMax_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMax_1_1.setBounds(234, 179, 91, 23);
		contentPane.add(lblMax_1_1);
		
		Split_progress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Split_progress.setBounds(331, 179, 55, 23);
		contentPane.add(Split_progress);
		
		Merge_Progress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Merge_Progress.setBounds(140, 179, 55, 23);
		contentPane.add(Merge_Progress);
		
		JButton btnNewButton_1 = new JButton("Process Task");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(StringMemory.getText());
				if (source_inputFile != "" && source_outputFile != "" && value > 1) {
					ExternalSort.externalSort(source_inputFile, source_outputFile,value ,Merge_Progress,Split_progress,NumberItem);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1.setBounds(61, 220, 116, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Enqueue Task");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				timer = new Timer(10, new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
                		Split_progress.setText(runTime + "");
                		runTime = runTime + 1;
                		try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                	if (runTime == 10) {
	                		timer.stop();
	                	}
	                }
	            });
				
				timer.start();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_1_1.setBounds(244, 220, 124, 30);
		contentPane.add(btnNewButton_1_1);
	}
// start menu chose
//	source_outputFile
	public Boolean regexDir(String dir) {
		Boolean trueString = true;
		if (dir.charAt(dir.length() - 1) != 't') {
			trueString = false;
		}
		if (dir.charAt(dir.length() - 2) != 'x') {
			trueString = false;
		}
		if (dir.charAt(dir.length() - 3) != 't') {
			trueString = false;
		}
		if (dir.charAt(dir.length() - 4) != '.') {
			trueString = false;
		}

		return trueString;
	}
	
	private void SaveFileTxt() {
		if (viewSort.this.source_outputFile == "") {
			JFileChooser c = new JFileChooser();

			c.setSelectedFile(new File("newfile.txt"));

			int rVal1 = c.showSaveDialog(viewSort.this);
			String fileName = "";
			if (rVal1 == JFileChooser.APPROVE_OPTION) {
				String dir = c.getCurrentDirectory().toString();
				fileName = c.getSelectedFile().getName();
				viewSort.this.source_outputFile = dir + "\\" + fileName;
				viewSort.this.setTitle(fileName);
				if (regexDir(fileName) == false) {
					System.out.println(viewSort.this.source_outputFile);
					viewSort.this.source_outputFile = viewSort.this.source_outputFile + ".txt";
				}
			}
			this.Label_Output.setText(viewSort.this.source_outputFile);
		}
		else {
			this.Label_Output.setText("Lỗi");
		}
		
	}
	
	private void openFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(viewSort.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			String fileName = file.getAbsolutePath();
			String fileNameIs = file.getName();
			setTitle(fileNameIs);
			this.source_inputFile = fileName;
			this.Label_Input.setText(fileName);
		}else {
			this.Label_Input.setText("Nhap Dung");
		}
	}
// end menu chose
	
}

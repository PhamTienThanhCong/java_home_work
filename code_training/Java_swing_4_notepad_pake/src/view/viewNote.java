package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.DropMode;
import javax.swing.ListSelectionModel;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewNote extends JFrame {

	private JPanel contentPane;
	private JTextPane textContent = new JTextPane();
	private String url = "";

	/**
	 * Launch the application.
	 */

	public void Runcode() {

		try {
			viewNote frame = new viewNote();
			frame.setLocationRelativeTo(null);

			frame.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Create the frame.
	 */
	public viewNote() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("H:\\DATA CODE\\code java\\code_training\\Java_swing_4_notepad_pake\\src\\image\\icon.png"));
		setType(Type.UTILITY);
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		setTitle("NewNotePate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 379);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu MenuFile = new JMenu("File");
		menuBar.add(MenuFile);

		JMenuItem MenuNew = new JMenuItem("New");
		MenuNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (viewNote.this.textContent.getText().length() > 0) {
					if (JOptionPane.showConfirmDialog(viewNote.this, "Bạn chưa lưu chương chình bạn muốn lưu khum",
							"Đóng chương trình", JOptionPane.YES_NO_OPTION) == 0) {
						SaveFileTxt();
					}
					viewNote.this.url = "";
					viewNote.this.textContent.setText("");
				}
			}
		});
		MenuFile.add(MenuNew);

		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (viewNote.this.textContent.getText().length() > 0) {
					if (JOptionPane.showConfirmDialog(viewNote.this, "Bạn chưa lưu chương chình bạn muốn lưu khum",
							"Đóng chương trình", JOptionPane.YES_NO_OPTION) == 0) {
						SaveFileTxt();
					}
				}
				viewNote.this.url = openFile();
				if (regexDir(viewNote.this.url)) {
					try {
						String NewText = readFile(url);
						textContent.setText(NewText);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showConfirmDialog(viewNote.this, "Bạn không thể mở file này","Thông báo", JOptionPane.YES_OPTION);
				}
			}
		});
		MenuFile.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Save");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveFileTxt();
			}
		});
		MenuFile.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit...");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (viewNote.this.textContent.getText().length() > 0) {
					int aleart = JOptionPane.showConfirmDialog(viewNote.this,
							"Bạn chưa lưu chương chình bạn muốn lưu khum", "Đóng chương trình",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (aleart == 0) {
						SaveFileTxt();
						viewNote.this.dispose();
					} else if (aleart == 1) {
						viewNote.this.dispose();
					}
				} else {
					if (JOptionPane.showConfirmDialog(viewNote.this, "Bạn sẽ đóng chương trình", "Đóng chương trình",
							JOptionPane.YES_NO_OPTION) == 0) {
						viewNote.this.dispose();
					}
				}
			}
		});

		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.LEFT);
		MenuFile.add(mntmNewMenuItem_3);

		JMenu MenuHelp = new JMenu("Help");
		menuBar.add(MenuHelp);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Xem th\u00F4ng tin....");
		MenuHelp.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textContent.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textContent.setBounds(0, 0, 488, 300);

		JScrollPane scrollPane = new JScrollPane(textContent);
		scrollPane.setBorder(null);
		scrollPane.setBounds(0, 0, 488, 318);
		contentPane.add(scrollPane);

	}

	private void SaveFileTxt() {
		if (viewNote.this.url == "") {
			JFileChooser c = new JFileChooser();

			c.setSelectedFile(new File("newfile.txt"));

			int rVal1 = c.showSaveDialog(viewNote.this);

			if (rVal1 == JFileChooser.APPROVE_OPTION) {
				String dir = c.getCurrentDirectory().toString();
				String fileName = c.getSelectedFile().getName();
				viewNote.this.url = dir + "\\" + fileName;
				viewNote.this.setTitle(fileName);
				if (regexDir(fileName) == false) {
					System.out.println(viewNote.this.url);
					viewNote.this.url = viewNote.this.url + ".txt";
				}
			}
		}
		if (viewNote.this.url.length() > 0) {
			try {
				writeFile(viewNote.this.url, viewNote.this.textContent.getText());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

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

	private void writeFile(String dirFile, String content) throws FileNotFoundException {
		try (PrintWriter out = new PrintWriter(dirFile)) {
			out.println(content);
		}
	}

	private String openFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(viewNote.this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			String fileName = file.getAbsolutePath();
			String fileNameIs = file.getName();
			setTitle(fileNameIs);
			return fileName;
		}
		return "";

	}

	private String readFile(String filename) throws IOException {
		if (filename.length() > 0) {
			String content = null;
			
			File file = new File(filename); // For example, foo.txt
			FileReader reader = null;

			try {
				reader = new FileReader(file);
				char[] chars = new char[(int) file.length()];
				reader.read(chars);
				content = new String(chars);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (reader != null) {
					reader.close();
				}
			}
			return content;
		}
		return "";
	}

	private String assertEquals(String content, String utf8EncodedString) {
		// TODO Auto-generated method stub
		return null;
	}
}

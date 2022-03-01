package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.caculator;

public class ControlerMath implements ActionListener{

	caculator cal;
	
	public ControlerMath(caculator cal) {
		this.cal = cal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		this.cal.PhepTinh(src);
		
	}

}

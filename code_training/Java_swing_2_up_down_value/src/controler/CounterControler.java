package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.View_demo;

public class CounterControler implements ActionListener{

	private View_demo cvt;
	
	public CounterControler(View_demo cvt) {
		this.cvt = cvt;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Nút Giảm")) {
			this.cvt.Giam();
		}else if (src.equals("Nút Tăng")) {
			this.cvt.Tang();
		}else if (src.equals("Nút Reset")) {
			this.cvt.Reset();
		}
	}

}

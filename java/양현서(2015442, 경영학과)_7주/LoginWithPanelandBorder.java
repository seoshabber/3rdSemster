import java.awt.*;

public class LoginWithPanelandBorder {
	Frame f;
	Label llg, lpw, lpress;
	TextField login, passwd;
	Button ok;
	Panel p1, p2, p3;

	LoginWithPanelandBorder(String msg) {
		f = new Frame(msg);
		f.setLayout(new BorderLayout());

		// UI���� Component ����
		llg = new Label("Login");
		lpw = new Label("password");
		lpress = new Label("Press");
		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');
		ok = new Button("OK");

		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		p1.add(llg);
		p1.add(login);

		p2.add(lpw);
		p2.add(passwd);

		p3.add(lpress);
		p3.add(ok);

//		p1.setBackground(Color.pink);
//		p2.setBackground(Color.blue);
//		p3.setBackground(Color.yellow);

		f.add(p1, "North");
		f.add(p2, "Center");
		f.add(p3, "South");

		f.setSize(500, 400);
		f.setVisible(true);

	}
}

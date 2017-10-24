import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private Container cp;
    private JButton jbn1 = new JButton("Exit");
    private JButton jbn2 = new JButton("Go");
    private JLabel jbl1 = new JLabel("ID");
    private JLabel jbl2 = new JLabel("Password");


    public LoginFrame(){
        Init();
    }
    private void Init() {
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,1,1));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.add(jbl1);
        cp.add();
        cp.add(jbl2);
        cp.add();
        cp.add(jbn1);
        cp.add(jbn2);


    }

}




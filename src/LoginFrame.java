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
    private JTextField jfID = new JTextField();
    private JPasswordField jfPW = new JPasswordField();
    private int screenW = Toolkit.getDefaultToolkit().getScreenSize().width;
    private int screenH = Toolkit.getDefaultToolkit().getScreenSize().height;
    private int frmW=300,frmH=150;


    public LoginFrame(){
        Init();
    }
    private void Init() {
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3,2,1,1));
        this.setBounds((screenW-frmW)/2,(screenH-frmH)/2,frmW,frmH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp.add(jbl1);
        cp.add(jfID);
        cp.add(jbl2);
        cp.add(jfPW);
        cp.add(jbn1);
        cp.add(jbn2);

        jbn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(jfID.getText().equals("h304")&&
                            (new String(jfPW.getPassword())).equals("23323"))
            }
        });


    }

}




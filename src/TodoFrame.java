import javax.swing.*;
import java.awt.*;

public class TodoFrame extends JFrame {

    // Atributs
    private JTextField txt_Task;
    
    private JButton btn_Add;
    private JButton btn_Edit;
    private JButton btn_Delete;
    private JButton btn_Update;

    private JButton btn_Search;

    private JList lst_Tasks;

    // panel
    private JPanel panel;

    

    

    public TodoFrame() throws HeadlessException {
        super("Todo");


        // Inicialitzem els atributs
        txt_Task = new JTextField();
        // stile txt_Task
        txt_Task.setBackground(Color.WHITE);
        txt_Task.setForeground(Color.gray);
        txt_Task.setFont(new Font("Arial", Font.ITALIC, 12));
        txt_Task.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt_Task.setHorizontalAlignment(JTextField.CENTER);
    
        txt_Task.setBounds(10,50,350,25);


        btn_Add = new JButton("Add");
        // style
        btn_Add.setBackground(new Color(47, 52, 63));
        btn_Add.setForeground(Color.white);
        btn_Add.setFont(new Font("Arial", Font.BOLD, 12));
        btn_Add.setBorder(BorderFactory.createLineBorder(new Color(90, 97, 112)));
        btn_Add.setBounds(10,10,80,25);
        btn_Edit = new JButton("Edit");
        // style
        btn_Edit.setBackground(new Color(47, 52, 63));
        btn_Edit.setForeground(Color.white);
        btn_Edit.setFont(new Font("Arial", Font.BOLD, 12));
        btn_Edit.setBorder(BorderFactory.createLineBorder(new Color(90, 97, 112)));
        btn_Edit.setBounds(100,10,80,25);
        btn_Delete = new JButton("Delete");
        // style
        btn_Delete.setBackground(new Color(47, 52, 63));
        btn_Delete.setForeground(Color.white);
        btn_Delete.setFont(new Font("Arial", Font.BOLD, 12));
        btn_Delete.setBorder(BorderFactory.createLineBorder(new Color(90, 97, 112)));
        btn_Delete.setBounds(190,10,80,25);
        btn_Update = new JButton("Update");
        // style
        btn_Update.setBackground(new Color(47, 52, 63));
        btn_Update.setForeground(Color.white);
        btn_Update.setFont(new Font("Arial", Font.BOLD, 12));
        btn_Update.setBorder(BorderFactory.createLineBorder(new Color(90, 97, 112)));
        btn_Update.setBounds(280,10,80,25);

        btn_Search = new JButton("Search");
        // style
        btn_Search.setBackground(new Color(90, 97, 112));
        btn_Search.setForeground(Color.white);
        btn_Search.setFont(new Font("Arial", Font.BOLD, 12));
        btn_Search.setBorder(BorderFactory.createLineBorder(new Color(115, 122, 136)));
        btn_Search.setBounds(10,90,100,25);


        lst_Tasks = new JList();
        lst_Tasks.setBackground(Color.white);
        lst_Tasks.setForeground(Color.gray);
        lst_Tasks.setFont(new Font("Arial", Font.ITALIC, 12));
        lst_Tasks.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lst_Tasks.setBounds(10,130,350,270);

        // panel
        panel = new JPanel();
        panel.setBackground(new Color(47, 52, 63));
        panel.setLayout(null);
      

        // Afegim els components a la finestra
        this.add(txt_Task);
        this.add(btn_Search);


        this.add(btn_Add);
        this.add(btn_Edit);
        this.add(btn_Delete);
        this.add(btn_Update);
        
        this.add(lst_Tasks);
        this.add(panel);

     

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Dimention
        this.setSize(380, 450);
        this.setResizable(false);
        this.setVisible(true);
    }

    public TodoFrame(String title) throws HeadlessException {
        super(title);
    }
}

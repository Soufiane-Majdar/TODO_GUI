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
    
        txt_Task.setBounds(10,80,350,25);


        btn_Add = new JButton("Add");
        btn_Add.setBounds(10,40,80,25);
        btn_Edit = new JButton("Edit");
        btn_Edit.setBounds(100,40,80,25);
        btn_Delete = new JButton("Delete");
        btn_Delete.setBounds(190,40,80,25);
        btn_Update = new JButton("Update");
        btn_Update.setBounds(280,40,80,25);

        btn_Search = new JButton("Search");
        btn_Search.setBounds(10,120,100,25);


        lst_Tasks = new JList();
        lst_Tasks.setBackground(Color.white);
        lst_Tasks.setForeground(Color.gray);
        lst_Tasks.setFont(new Font("Arial", Font.ITALIC, 12));
        lst_Tasks.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lst_Tasks.setBounds(10,160,350,250);

        // panel
        panel = new JPanel();
        panel.setBackground(Color.gray);
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
        this.setSize(380, 450);
        this.setVisible(true);
    }

    public TodoFrame(String title) throws HeadlessException {
        super(title);
    }
}

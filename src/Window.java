import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener {
    
    private JPanel panel;

    private JButton register;
    private JButton consult;
    private JButton update;
    private JButton registerStudent;
    private JButton registerProfessor;
    private JButton registerServiceStaff;
    private JButton consultStudent;
    private JButton consultProfessor;
    private JButton consultServiceStaff;
    private JButton updateMaritalStatus;
    private JButton updateOffice;
    private JButton updateCourse;
    private JButton updateDepartment;
    private JButton updateSection;

    public Window() {
        setSize(900, 600);
        setTitle("Monsters University");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        initializeComponents();
        menu();
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
    }
    
    private void initializeComponents() {
    
        panel = new JPanel();
        panel.setLayout(null);
                
        this.getContentPane().add(panel);
    
    }

    private void clearPanel() {
        panel.removeAll();
        panel.revalidate();
        panel.repaint();
        this.getContentPane().add(panel);
    }


    private void menu() {
        
        JLabel title;
        
        title = new JLabel("Monsters University");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(360, 40);
        panel.add(title);

        register = new JButton("Register");
        register.setFont(new Font("Arial", Font.PLAIN, 16));
        register.setSize(200, 60);
        register.setLocation(360, 100);
        register.addActionListener(this);
        panel.add(register);

        consult = new JButton("Consult");
        consult.setFont(new Font("Arial", Font.PLAIN, 16));
        consult.setSize(200, 60);
        consult.setLocation(360, 200);
        consult.addActionListener(this);
        panel.add(consult);

        update = new JButton("Update");
        update.setFont(new Font("Arial", Font.PLAIN, 16));
        update.setSize(200, 60);
        update.setLocation(360, 300);
        update.addActionListener(this);
        panel.add(update);
    
    }

    private void registerMenu() {
        
        JLabel title;
        
        title = new JLabel("Register");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(360, 40);
        panel.add(title);

        registerStudent = new JButton("Student");
        registerStudent.setFont(new Font("Arial", Font.PLAIN, 16));
        registerStudent.setSize(200, 60);
        registerStudent.setLocation(360, 100);
        registerStudent.addActionListener(this);
        panel.add(registerStudent);

        registerProfessor = new JButton("Professor");
        registerProfessor.setFont(new Font("Arial", Font.PLAIN, 16));
        registerProfessor.setSize(200, 60);
        registerProfessor.setLocation(360, 200);
        registerProfessor.addActionListener(this);
        panel.add(registerProfessor);

        registerServiceStaff = new JButton("Service Staff");
        registerServiceStaff.setFont(new Font("Arial", Font.PLAIN, 16));
        registerServiceStaff.setSize(200, 60);
        registerServiceStaff.setLocation(360, 300);
        registerServiceStaff.addActionListener(this);
        panel.add(registerServiceStaff);

    }
    
    private void consultMenu() {
        
        JLabel title;
        
        title = new JLabel("Consult");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(360, 40);
        panel.add(title);

        consultStudent = new JButton("Students");
        consultStudent.setFont(new Font("Arial", Font.PLAIN, 16));
        consultStudent.setSize(200, 60);
        consultStudent.setLocation(360, 100);
        consultStudent.addActionListener(this);
        panel.add(consultStudent);

        consultProfessor = new JButton("Professors");
        consultProfessor.setFont(new Font("Arial", Font.PLAIN, 16));
        consultProfessor.setSize(200, 60);
        consultProfessor.setLocation(360, 200);
        consultProfessor.addActionListener(this);
        panel.add(consultProfessor);

        consultServiceStaff = new JButton("Service Staff");
        consultServiceStaff.setFont(new Font("Arial", Font.PLAIN, 16));
        consultServiceStaff.setSize(200, 60);
        consultServiceStaff.setLocation(360, 300);
        consultServiceStaff.addActionListener(this);
        panel.add(consultServiceStaff);

    }
    
    private void updateMenu() {
        
        JLabel title;
        
        title = new JLabel("Update");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(360, 40);
        panel.add(title);

        updateMaritalStatus = new JButton("Marital Status");
        updateMaritalStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        updateMaritalStatus.setSize(200, 60);
        updateMaritalStatus.setLocation(360, 100);
        updateMaritalStatus.addActionListener(this);
        panel.add(updateMaritalStatus);

        updateOffice = new JButton("Office");
        updateOffice.setFont(new Font("Arial", Font.PLAIN, 16));
        updateOffice.setSize(200, 60);
        updateOffice.setLocation(360, 200);
        updateOffice.addActionListener(this);
        panel.add(updateOffice);

        updateCourse = new JButton("Course");
        updateCourse.setFont(new Font("Arial", Font.PLAIN, 16));
        updateCourse.setSize(200, 60);
        updateCourse.setLocation(360, 300);
        updateCourse.addActionListener(this);
        panel.add(updateCourse);
        
        updateDepartment = new JButton("Department");
        updateDepartment.setFont(new Font("Arial", Font.PLAIN, 16));
        updateDepartment.setSize(200, 60);
        updateDepartment.setLocation(360, 400);
        updateDepartment.addActionListener(this);
        panel.add(updateDepartment);

        updateSection = new JButton("Section");
        updateSection.setFont(new Font("Arial", Font.PLAIN, 16));
        updateSection.setSize(200, 60);
        updateSection.setLocation(360, 500);
        updateSection.addActionListener(this);
        panel.add(updateSection);

    }

    @Override
    public void actionPerformed(ActionEvent e) {    
        try {
            if (e.getSource() == register) {
                clearPanel();
                registerMenu();
            } else if (e.getSource() == consult) {
                clearPanel();
                consultMenu();
            } else if (e.getSource() == update) {
                clearPanel();
                updateMenu();
            
            } 
        } catch (Exception error) {
            System.out.println(error);
        }
    }

}

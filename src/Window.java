import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classes.Person;
import classes.Professor;
import classes.ServiceStaff;
import classes.Student;

public class Window extends JFrame implements ActionListener {
    
    private ArrayList<Person> persons = new ArrayList<Person>();

    private JPanel panel;

    private JButton register;
    private JButton consult;
    private JButton update;
    private JButton registerStudent;
    private JButton registerProfessor;
    private JButton registerServiceStaff;
    private JButton consultStudents;
    private JButton consultProfessors;
    private JButton consultServiceStaff;
    private JButton updateMaritalStatus;
    private JButton updateOffice;
    private JButton updateCourse;
    private JButton updateDepartment;
    private JButton updateSection;
    private JButton home;
    private JButton registerStudentSubmit;
    private JButton registerProfessorSubmit;
    private JButton registerServiceStaffSubmit;
    private JButton updateMaritalStatusSubmit;
    private JButton updateOfficeNumberSubmit;
    private JButton updateCourseSubmit;
    private JButton updateDepartmentSubmit;
    private JButton updateSectionSubmit;

    private JLabel id;
    private JTextField tid;
    private JLabel name;
    private JTextField tname;
    private JLabel lastName;
    private JTextField tlastName;
    private JLabel maritalStatus;
    private JTextField tmaritalStatus;
    private JLabel course;
    private JTextField tcourse;
    private JLabel incomeYear;
    private JTextField tincomeYear;
    private JLabel officeNumber;
    private JTextField tofficeNumber;
    private JLabel department;
    private JTextField tdepartment;
    private JLabel section;
    private JTextField tsection;
    private JLabel person;
    private JComboBox<String> cperson;

    private JTextArea tout;

    public Window() {
        setSize(900, 800);
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
        
        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(200, 60);
        home.setLocation(360, 400);
        home.addActionListener(this);
        panel.add(home);

    }
    
    private void consultMenu() {
        
        JLabel title;
        
        title = new JLabel("Consult");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(360, 40);
        panel.add(title);

        consultStudents = new JButton("Students");
        consultStudents.setFont(new Font("Arial", Font.PLAIN, 16));
        consultStudents.setSize(200, 60);
        consultStudents.setLocation(360, 100);
        consultStudents.addActionListener(this);
        panel.add(consultStudents);

        consultProfessors = new JButton("Professors");
        consultProfessors.setFont(new Font("Arial", Font.PLAIN, 16));
        consultProfessors.setSize(200, 60);
        consultProfessors.setLocation(360, 200);
        consultProfessors.addActionListener(this);
        panel.add(consultProfessors);

        consultServiceStaff = new JButton("Service Staff");
        consultServiceStaff.setFont(new Font("Arial", Font.PLAIN, 16));
        consultServiceStaff.setSize(200, 60);
        consultServiceStaff.setLocation(360, 300);
        consultServiceStaff.addActionListener(this);
        panel.add(consultServiceStaff);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(200, 60);
        home.setLocation(360, 400);
        home.addActionListener(this);
        panel.add(home);

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

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(200, 60);
        home.setLocation(360, 600);
        home.addActionListener(this);
        panel.add(home);

    }

    private void registerStudent() {
        
        JLabel title;

        title = new JLabel("Register Student");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        id = new JLabel("Enter id");
        id.setFont(new Font("Arial", Font.PLAIN, 16));
        id.setSize(140, 20);
        id.setLocation(100, 100);
        panel.add(id);
  
        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 14));
        tid.setSize(190, 20);
        tid.setLocation(100, 130);
        panel.add(tid);

        name = new JLabel("Enter name");
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setSize(140, 20);
        name.setLocation(100, 200);
        panel.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 14));
        tname.setSize(190, 20);
        tname.setLocation(100, 230);
        panel.add(tname);

        lastName = new JLabel("Enter lastName");
        lastName.setFont(new Font("Arial", Font.PLAIN, 16));
        lastName.setSize(140, 20);
        lastName.setLocation(100, 300);
        panel.add(lastName);
  
        tlastName = new JTextField();
        tlastName.setFont(new Font("Arial", Font.PLAIN, 14));
        tlastName.setSize(190, 20);
        tlastName.setLocation(100, 330);
        panel.add(tlastName);

        maritalStatus = new JLabel("Enter marital status");
        maritalStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        maritalStatus.setSize(140, 20);
        maritalStatus.setLocation(100, 400);
        panel.add(maritalStatus);
  
        tmaritalStatus = new JTextField();
        tmaritalStatus.setFont(new Font("Arial", Font.PLAIN, 14));
        tmaritalStatus.setSize(190, 20);
        tmaritalStatus.setLocation(100, 430);
        panel.add(tmaritalStatus);

        course = new JLabel("Enter course");
        course.setFont(new Font("Arial", Font.PLAIN, 16));
        course.setSize(140, 20);
        course.setLocation(100, 500);
        panel.add(course);
  
        tcourse = new JTextField();
        tcourse.setFont(new Font("Arial", Font.PLAIN, 14));
        tcourse.setSize(190, 20);
        tcourse.setLocation(100, 530);
        panel.add(tcourse);

        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(400, 400);
        tout.setLocation(360, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        registerStudentSubmit = new JButton("Submit");
        registerStudentSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        registerStudentSubmit.setSize(100, 30);
        registerStudentSubmit.setLocation(100, 600);
        registerStudentSubmit.addActionListener(this);
        panel.add(registerStudentSubmit);
        
        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 640);
        home.addActionListener(this);
        panel.add(home);
    }

    private void registerProfessor() {
        
        JLabel title;

        title = new JLabel("Register Professor");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        id = new JLabel("Enter id");
        id.setFont(new Font("Arial", Font.PLAIN, 16));
        id.setSize(140, 20);
        id.setLocation(100, 100);
        panel.add(id);
  
        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 14));
        tid.setSize(190, 20);
        tid.setLocation(100, 130);
        panel.add(tid);

        name = new JLabel("Enter name");
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setSize(140, 20);
        name.setLocation(100, 180);
        panel.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 14));
        tname.setSize(190, 20);
        tname.setLocation(100, 210);
        panel.add(tname);

        lastName = new JLabel("Enter lastName");
        lastName.setFont(new Font("Arial", Font.PLAIN, 16));
        lastName.setSize(140, 20);
        lastName.setLocation(100, 260);
        panel.add(lastName);
  
        tlastName = new JTextField();
        tlastName.setFont(new Font("Arial", Font.PLAIN, 14));
        tlastName.setSize(190, 20);
        tlastName.setLocation(100, 290);
        panel.add(tlastName);

        maritalStatus = new JLabel("Enter marital status");
        maritalStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        maritalStatus.setSize(140, 20);
        maritalStatus.setLocation(100, 340);
        panel.add(maritalStatus);
  
        tmaritalStatus = new JTextField();
        tmaritalStatus.setFont(new Font("Arial", Font.PLAIN, 14));
        tmaritalStatus.setSize(190, 20);
        tmaritalStatus.setLocation(100, 370);
        panel.add(tmaritalStatus);

        incomeYear = new JLabel("Enter income year");
        incomeYear.setFont(new Font("Arial", Font.PLAIN, 16));
        incomeYear.setSize(140, 20);
        incomeYear.setLocation(100, 420);
        panel.add(incomeYear);
  
        tincomeYear = new JTextField();
        tincomeYear.setFont(new Font("Arial", Font.PLAIN, 14));
        tincomeYear.setSize(190, 20);
        tincomeYear.setLocation(100, 450);
        panel.add(tincomeYear);
        
        officeNumber = new JLabel("Enter office number");
        officeNumber.setFont(new Font("Arial", Font.PLAIN, 16));
        officeNumber.setSize(140, 20);
        officeNumber.setLocation(100, 500);
        panel.add(officeNumber);
  
        tofficeNumber = new JTextField();
        tofficeNumber.setFont(new Font("Arial", Font.PLAIN, 14));
        tofficeNumber.setSize(190, 20);
        tofficeNumber.setLocation(100, 530);
        panel.add(tofficeNumber);

        department = new JLabel("Enter department");
        department.setFont(new Font("Arial", Font.PLAIN, 16));
        department.setSize(140, 20);
        department.setLocation(100, 580);
        panel.add(department);
  
        tdepartment = new JTextField();
        tdepartment.setFont(new Font("Arial", Font.PLAIN, 14));
        tdepartment.setSize(190, 20);
        tdepartment.setLocation(100, 610);
        panel.add(tdepartment);

        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(400, 400);
        tout.setLocation(360, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        registerProfessorSubmit = new JButton("Submit");
        registerProfessorSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        registerProfessorSubmit.setSize(100, 30);
        registerProfessorSubmit.setLocation(100, 660);
        registerProfessorSubmit.addActionListener(this);
        panel.add(registerProfessorSubmit);
        
        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
    }

    private void registerServiceStaff() {
        
        JLabel title;

        title = new JLabel("Register Service Staff");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        id = new JLabel("Enter id");
        id.setFont(new Font("Arial", Font.PLAIN, 16));
        id.setSize(140, 20);
        id.setLocation(100, 100);
        panel.add(id);
  
        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 14));
        tid.setSize(190, 20);
        tid.setLocation(100, 130);
        panel.add(tid);

        name = new JLabel("Enter name");
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setSize(140, 20);
        name.setLocation(100, 180);
        panel.add(name);
  
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 14));
        tname.setSize(190, 20);
        tname.setLocation(100, 210);
        panel.add(tname);

        lastName = new JLabel("Enter lastName");
        lastName.setFont(new Font("Arial", Font.PLAIN, 16));
        lastName.setSize(140, 20);
        lastName.setLocation(100, 260);
        panel.add(lastName);
  
        tlastName = new JTextField();
        tlastName.setFont(new Font("Arial", Font.PLAIN, 14));
        tlastName.setSize(190, 20);
        tlastName.setLocation(100, 290);
        panel.add(tlastName);

        maritalStatus = new JLabel("Enter marital status");
        maritalStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        maritalStatus.setSize(140, 20);
        maritalStatus.setLocation(100, 340);
        panel.add(maritalStatus);
  
        tmaritalStatus = new JTextField();
        tmaritalStatus.setFont(new Font("Arial", Font.PLAIN, 14));
        tmaritalStatus.setSize(190, 20);
        tmaritalStatus.setLocation(100, 370);
        panel.add(tmaritalStatus);

        incomeYear = new JLabel("Enter income year");
        incomeYear.setFont(new Font("Arial", Font.PLAIN, 16));
        incomeYear.setSize(140, 20);
        incomeYear.setLocation(100, 420);
        panel.add(incomeYear);
  
        tincomeYear = new JTextField();
        tincomeYear.setFont(new Font("Arial", Font.PLAIN, 14));
        tincomeYear.setSize(190, 20);
        tincomeYear.setLocation(100, 450);
        panel.add(tincomeYear);
        
        officeNumber = new JLabel("Enter office number");
        officeNumber.setFont(new Font("Arial", Font.PLAIN, 16));
        officeNumber.setSize(140, 20);
        officeNumber.setLocation(100, 500);
        panel.add(officeNumber);
  
        tofficeNumber = new JTextField();
        tofficeNumber.setFont(new Font("Arial", Font.PLAIN, 14));
        tofficeNumber.setSize(190, 20);
        tofficeNumber.setLocation(100, 530);
        panel.add(tofficeNumber);

        section = new JLabel("Enter section");
        section.setFont(new Font("Arial", Font.PLAIN, 16));
        section.setSize(140, 20);
        section.setLocation(100, 580);
        panel.add(section);
  
        tsection = new JTextField();
        tsection.setFont(new Font("Arial", Font.PLAIN, 14));
        tsection.setSize(190, 20);
        tsection.setLocation(100, 610);
        panel.add(tsection);

        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(400, 400);
        tout.setLocation(360, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        registerServiceStaffSubmit = new JButton("Submit");
        registerServiceStaffSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        registerServiceStaffSubmit.setSize(100, 30);
        registerServiceStaffSubmit.setLocation(100, 660);
        registerServiceStaffSubmit.addActionListener(this);
        panel.add(registerServiceStaffSubmit);
        
        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
    }

    private void consultStudents() {
        
        JLabel title;

        String data;

        title = new JLabel("Students");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);

        data = "";

        for (Person person : persons) {
            data += person.toString() + "\n";
        }

        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(600, 560);
        tout.setLocation(150, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        tout.setText(data);
        tout.setEditable(false);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);

    }
    
    private void consultProfessors() {
        
        JLabel title;

        title = new JLabel("Professors");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);

        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(600, 560);
        tout.setLocation(150, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
        
    }
    
    private void consultServiceStaff() {

        JLabel title;

        title = new JLabel("Service Staff");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
        
        tout = new JTextArea();
        tout.setBorder(BorderFactory.createCompoundBorder(
        tout.getBorder(), 
        BorderFactory.createEmptyBorder(20, 20, 5, 20)));
        tout.setFont(new Font("Arial", Font.PLAIN, 16));
        tout.setSize(600, 560);
        tout.setLocation(150, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        panel.add(tout);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);

    }

    private void updateMaritalStatus() {
        
        JLabel title;

        title = new JLabel("Update Marital Status");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
    
        id = new JLabel("Enter id");
        id.setFont(new Font("Arial", Font.PLAIN, 16));
        id.setSize(140, 20);
        id.setLocation(100, 100);
        panel.add(id);
  
        tid = new JTextField();
        tid.setFont(new Font("Arial", Font.PLAIN, 14));
        tid.setSize(190, 20);
        tid.setLocation(100, 130);
        panel.add(tid);

        maritalStatus= new JLabel("Enter marital status");
        maritalStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        maritalStatus.setSize(140, 20);
        maritalStatus.setLocation(100, 200);
        panel.add(maritalStatus);
  
        tmaritalStatus= new JTextField();
        tmaritalStatus.setFont(new Font("Arial", Font.PLAIN, 14));
        tmaritalStatus.setSize(190, 20);
        tmaritalStatus.setLocation(100, 230);
        panel.add(tmaritalStatus);

        updateMaritalStatusSubmit = new JButton("Submit");
        updateMaritalStatusSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        updateMaritalStatusSubmit.setSize(100, 30);
        updateMaritalStatusSubmit.setLocation(100, 660);
        updateMaritalStatusSubmit.addActionListener(this);
        panel.add(updateMaritalStatusSubmit);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
        
    }
    
    private void updateOffice() {
        
        JLabel title;

        title = new JLabel("Update Office Number");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
    
        person = new JLabel("Select person");
        person.setFont(new Font("Arial", Font.PLAIN, 16));
        person.setSize(180, 20);
        person.setLocation(100, 100);
        panel.add(person);

        cperson = new JComboBox<String>();
        cperson.setFont(new Font("Arial", Font.PLAIN, 15));
        cperson.setSize(160, 20);
        cperson.setLocation(100, 130);
        panel.add(cperson);

        officeNumber = new JLabel("Enter office number");
        officeNumber.setFont(new Font("Arial", Font.PLAIN, 16));
        officeNumber.setSize(140, 20);
        officeNumber.setLocation(100, 200);
        panel.add(officeNumber);
  
        tofficeNumber = new JTextField();
        tofficeNumber.setFont(new Font("Arial", Font.PLAIN, 14));
        tofficeNumber.setSize(190, 20);
        tofficeNumber.setLocation(100, 230);
        panel.add(tofficeNumber);

        updateOfficeNumberSubmit = new JButton("Submit");
        updateOfficeNumberSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        updateOfficeNumberSubmit.setSize(100, 30);
        updateOfficeNumberSubmit.setLocation(100, 660);
        updateOfficeNumberSubmit.addActionListener(this);
        panel.add(updateOfficeNumberSubmit);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
        
    }

    private void updateCourse() {
        
        JLabel title;

        title = new JLabel("Update Course");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
    
        person = new JLabel("Select person");
        person.setFont(new Font("Arial", Font.PLAIN, 16));
        person.setSize(180, 20);
        person.setLocation(100, 100);
        panel.add(person);

        cperson = new JComboBox<String>();
        cperson.setFont(new Font("Arial", Font.PLAIN, 15));
        cperson.setSize(160, 20);
        cperson.setLocation(100, 130);
        panel.add(cperson);

        course = new JLabel("Enter course");
        course.setFont(new Font("Arial", Font.PLAIN, 16));
        course.setSize(140, 20);
        course.setLocation(100, 200);
        panel.add(course);
  
        tcourse = new JTextField();
        tcourse.setFont(new Font("Arial", Font.PLAIN, 14));
        tcourse.setSize(190, 20);
        tcourse.setLocation(100, 230);
        panel.add(tcourse);

        updateCourseSubmit = new JButton("Submit");
        updateCourseSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        updateCourseSubmit.setSize(100, 30);
        updateCourseSubmit.setLocation(100, 660);
        updateCourseSubmit.addActionListener(this);
        panel.add(updateCourseSubmit);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
        
    }
    
    private void updateDepartment() {
        
        JLabel title;

        title = new JLabel("Update Department");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
    
        person = new JLabel("Select person");
        person.setFont(new Font("Arial", Font.PLAIN, 16));
        person.setSize(180, 20);
        person.setLocation(100, 100);
        panel.add(person);

        cperson = new JComboBox<String>();
        cperson.setFont(new Font("Arial", Font.PLAIN, 15));
        cperson.setSize(160, 20);
        cperson.setLocation(100, 130);
        panel.add(cperson);

        department = new JLabel("Enter department");
        department.setFont(new Font("Arial", Font.PLAIN, 16));
        department.setSize(140, 20);
        department.setLocation(100, 200);
        panel.add(department);
  
        tdepartment = new JTextField();
        tdepartment.setFont(new Font("Arial", Font.PLAIN, 14));
        tdepartment.setSize(190, 20);
        tdepartment.setLocation(100, 230);
        panel.add(tdepartment);

        updateDepartmentSubmit = new JButton("Submit");
        updateDepartmentSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        updateDepartmentSubmit.setSize(100, 30);
        updateDepartmentSubmit.setLocation(100, 660);
        updateDepartmentSubmit.addActionListener(this);
        panel.add(updateDepartmentSubmit);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
        
    }

    private void updateSection() {
        
        JLabel title;

        title = new JLabel("Update Section");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(400, 40);
        title.setLocation(379, 40);
        panel.add(title);
    
        person = new JLabel("Select person");
        person.setFont(new Font("Arial", Font.PLAIN, 16));
        person.setSize(180, 20);
        person.setLocation(100, 100);
        panel.add(person);

        cperson = new JComboBox<String>();
        cperson.setFont(new Font("Arial", Font.PLAIN, 15));
        cperson.setSize(160, 20);
        cperson.setLocation(100, 130);
        panel.add(cperson);

        section = new JLabel("Enter section");
        section.setFont(new Font("Arial", Font.PLAIN, 16));
        section.setSize(140, 20);
        section.setLocation(100, 200);
        panel.add(section);
  
        tsection = new JTextField();
        tsection.setFont(new Font("Arial", Font.PLAIN, 14));
        tsection.setSize(190, 20);
        tsection.setLocation(100, 230);
        panel.add(tsection);

        updateSectionSubmit = new JButton("Submit");
        updateSectionSubmit.setFont(new Font("Arial", Font.PLAIN, 16));
        updateSectionSubmit.setSize(100, 30);
        updateSectionSubmit.setLocation(100, 660);
        updateSectionSubmit.addActionListener(this);
        panel.add(updateSectionSubmit);

        home = new JButton("Home");
        home.setFont(new Font("Arial", Font.PLAIN, 16));
        home.setSize(100, 30);
        home.setLocation(100, 700);
        home.addActionListener(this);
        panel.add(home);
        
    }

    private void registerStudentSubmit() {

        System.out.println("registerStudentSubmit called");

        Student student;
        
        String idValue              = tid.getText();        
        String nameValue            = tname.getText();        
        String lastNameValue        = tlastName.getText();        
        String maritalStatusValue   = tmaritalStatus.getText();        
        String courseValue          = tcourse.getText();
        
        student = new Student(
            nameValue,
            lastNameValue,
            idValue,
            maritalStatusValue,
            courseValue
        );

        persons.add(student);

        tout.setText(
            "Student " +
            nameValue +
            " " +
            lastNameValue +
            " registered successfully :)"
        );
        
        tout.setEditable(false);
    }

    private void registerProfessorSubmit() {

        Professor professor;
        
        String idValue              = tid.getText();        
        String nameValue            = tname.getText();        
        String lastNameValue        = tlastName.getText();        
        String maritalStatusValue   = tmaritalStatus.getText();        
        int incomeYearValue         = Integer.parseInt(tincomeYear.getText());
        int officeNumberValue       = Integer.parseInt(tofficeNumber.getText());
        String departmentValue      = tdepartment.getText();
        
        professor = new Professor(
            nameValue,
            lastNameValue,
            idValue,
            maritalStatusValue,
            incomeYearValue,
            officeNumberValue,
            departmentValue
        );

        persons.add(professor);

        tout.setText(
            "Professor " +
            nameValue +
            " " +
            lastNameValue +
            " registered successfully :)"
        );
        
        tout.setEditable(false);
    }
    
    private void registerServiceStaffSubmit() {

        ServiceStaff serviceStaff;
        
        String idValue              = tid.getText();        
        String nameValue            = tname.getText();        
        String lastNameValue        = tlastName.getText();        
        String maritalStatusValue   = tmaritalStatus.getText();        
        int    incomeYearValue      = Integer.parseInt(tincomeYear.getText());
        int    officeNumberValue    = Integer.parseInt(tofficeNumber.getText());
        String sectionValue         = tsection.getText();
        
        serviceStaff = new ServiceStaff(
            nameValue,
            lastNameValue,
            idValue,
            maritalStatusValue,
            incomeYearValue,
            officeNumberValue,
            sectionValue
        );

        persons.add(serviceStaff);

        tout.setText(
            "Service staff " +
            nameValue +
            " " +
            lastNameValue +
            " registered successfully :)"
        );
        
        tout.setEditable(false);
    }

    private void updateMaritalStatusSubmit() {
        
        String idValue = tid.getText();
        String maritalStatusValue = tmaritalStatus.getText();

        for (Person person : persons) {
            
            if (person.getId().equals(idValue)) {
                person.setMaritalStatus(maritalStatusValue);
            }
        }

        tout.setText("Marital status updated successfully");
        
        tout.setEditable(false);

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
            } else if(e.getSource() == home) {
                clearPanel();
                menu();
            } else if(e.getSource() == registerStudent) {
                clearPanel();
                registerStudent();
            } else if(e.getSource() == registerProfessor) {
                clearPanel();
                registerProfessor();
            } else if(e.getSource() == registerServiceStaff) {
                clearPanel();
                registerServiceStaff();
            } else if(e.getSource() == consultStudents) {
                clearPanel();
                consultStudents();
            } else if(e.getSource() == consultProfessors) {
                clearPanel();
                consultProfessors();
            } else if(e.getSource() == consultServiceStaff) {
                clearPanel();
                consultServiceStaff();
            } else if(e.getSource() == updateMaritalStatus) {
                clearPanel();
                updateMaritalStatus();
            } else if(e.getSource() == updateOffice) {
                clearPanel();
                updateOffice();
            } else if(e.getSource() == updateCourse) {
                clearPanel();
                updateCourse();
            } else if(e.getSource() == updateDepartment) {
                clearPanel();
                updateDepartment();
            } else if(e.getSource() == updateSection) {
                clearPanel();
                updateSection();
            } else if(e.getSource() == registerStudentSubmit) {
                registerStudentSubmit();
            } else if(e.getSource() == registerProfessorSubmit) {
                registerProfessorSubmit();
            } else if(e.getSource() == registerServiceStaffSubmit) {
                registerServiceStaffSubmit();
            } else if(e.getSource() == updateMaritalStatusSubmit) {
                updateMaritalStatusSubmit();
            }
        } catch (Exception error) {
            System.out.println(error);
        }
    }

}

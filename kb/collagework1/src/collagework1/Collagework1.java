
package collagework1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Collagework1 {

    public class kb extends JFrame
    implements ActionListener
    {
          private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel mno;
    private JTextField tmno;
    private JLabel crs;
    private JTextField tcrs;
    private JLabel sem;
    private JTextField tsem;
    private JLabel add;
    private JTextArea tadd;
    private JButton sub;
    private JButton reset;
     private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    }
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
       // constructor, to initialize the components
    // with default values.
    public kb()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
 
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(150, 30);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
 
        mno = new JLabel("Mobile");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 150);
        c.add(mno);
 
        tmno = new JTextField();
        tmno.setFont(new Font("Arial", Font.PLAIN, 15));
        tmno.setSize(150, 20);
        tmno.setLocation(200, 150);
        c.add(tmno);
 
        sem = new JLabel("Semester");
        sem.setFont(new Font("Arial", Font.PLAIN, 20));
        sem.setSize(100, 20);
        sem.setLocation(100, 200);
        c.add(sem);
 
        tsem = new JTextField();
        tsem.setFont(new Font("Arial", Font.PLAIN, 15));
        tsem.setSize(75, 20);
        tsem.setLocation(200, 200);
        c.add(tsem);
 
        crs = new JLabel("Course");
        crs.setFont(new Font("Arial", Font.PLAIN, 20));
        crs.setSize(100, 20);
        crs.setLocation(100, 250);
        c.add(crs);
       
        tcrs = new JTextField();
        tcrs.setFont(new Font("Arial", Font.PLAIN, 15));
        tcrs.setSize(75, 20);
        tcrs.setLocation(200, 250);
        c.add(tcrs);
 
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
        setVisible(true);
    }
       // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub)
        {
           
        }
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
        }
    }
    
 
    public static void main(String[] args) throues {
         kb f = new kb();
    }
    


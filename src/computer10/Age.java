package computer10;
import java.time.LocalDate;
import java.time.Period;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Age {
   public static void main(String[] args) {
      JLabel name = new JLabel("Name:");
      JTextField name_input = new JTextField(10);
      JLabel address = new JLabel("Adress:");
      JTextField address_input = new JTextField(5);
      JLabel tel_no = new JLabel("Tel. No:");
      JTextField tel_no_input = new JTextField(5);
      
      JLabel birth_month_label = new JLabel("Month of your birthday in numbers");
      JTextField birth_month_input = new JTextField(2);
      JLabel birth_day_label = new JLabel("Day of your birthday in numbers");
      JTextField birth_day_input = new JTextField(2);
      JLabel birth_year_label = new JLabel("Year of your birthday in numbers");
      JTextField birth_year_input = new JTextField(2);

      JPanel myPanel = new JPanel();
      Box box = Box.createVerticalBox();
      box.add(name);
      box.add(name_input);
      box.add(address);
      box.add(address_input);
      box.add(tel_no);
      box.add(tel_no_input);
      myPanel.add(box);
      
      JPanel myPanel1 = new JPanel();
      Box box1 = Box.createVerticalBox();
      box1.add(birth_day_label);
      box1.add(birth_day_input);
      box1.add(birth_month_label);
      box1.add(birth_month_input);
      box1.add(birth_year_label);
      box1.add(birth_year_input);
      myPanel1.add(box1);
      
      
      

      JOptionPane.showConfirmDialog(null, myPanel, 
               "Please Enter Your Infos", JOptionPane.OK_CANCEL_OPTION);
      int result1 = JOptionPane.showConfirmDialog(null, myPanel1, 
               "Please Enter Your Birthday", JOptionPane.OK_CANCEL_OPTION);
      if (result1 == JOptionPane.OK_OPTION) {
        LocalDate dob = LocalDate.of(Integer.parseInt(birth_year_input.getText()), Integer.parseInt(birth_month_input.getText()), Integer.parseInt(birth_day_input.getText()));
        Period period = Period.between(dob, LocalDate.now());
        
        JOptionPane.showMessageDialog(
                null, 
                "Name: "+name_input.getText()+"\n\n"+
                "Adress: "+address_input.getText()+"\n\n"+
                "Tel. No: "+tel_no_input.getText()+"\n\n"+
                "Age: "+period.getYears()+" Years\n"+period.getMonths()+" Months\n"+period.getDays()+" Days"
        );
      }
   }
}
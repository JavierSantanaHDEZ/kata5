package kata5;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MoneyDialog extends JPanel{
    public MoneyDialog(){
        super();
        add(createTextEdit());
        add(new CurrencyDialog());
    }

    private JTextField createTextEdit() {
        return new JTextField(10);
        
    }
    
}

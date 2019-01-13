public class backup {
    import javax.swing.*;
import java.awt.*;

    public class backup extends JFrame { // this class gets the data inputs

        public backup() {
        /*String numOfClasses = (JOptionPane.showInputDialog("How many classes do you have?"));
        int n = Integer.parseInt(numOfClasses); */

            setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

            String[][] mods = new String[5][27];
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= 27; j+=3) {
                    mods[i][j] = JOptionPane.showInputDialog("Input the name of your class.");
                    new JCheckBox("" + j);
                    new JCheckBox("" + (j+1));
                    new JCheckBox("" + (j+2));

                }

                //mods[1][i] = JOptionPane.showInputDialog("What class do you have mod " + i + " ?");
            }
        }

        public static void main(String[] args) {
            JFrame frame = new backup();
            frame.setTitle("Schedule");
            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
}

/* Mini Motivations
 * inspiring you to kick some academic butt
 * 
 * Carrie Nguyen
 * 6/2/17
 */

package tTalks;

import javax.swing.*;
import java.awt.event.*;      
import java.util.Random;

public class MiniMotivations implements ActionListener {
	String[] labelText = {"I hear dead people telling me to do things, and I choose to believe them because of their accumulated wisdom.", 
			"Be your own ME Inc. Take charge of your skills and propel yourself forward.",
			"Stop being an academic ding dong.",
			"Just like Shaq, our greatest weaknesses won't ever end up being our greatest strength, but we can take steps to strengthen them.", 
			"A rising tide floats all boats.",
			"I need my tacos rolled, my gas pumped, my Target carts pushed, and my coffee barista-ed. Are you going to really be the person to do that?",
			"I ran over my cat again."};
	Random rand = new Random();
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton button;

    public MiniMotivations(){
        /* Create and set up the frame */
        frame = new JFrame("Mini Motivations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Create a content pane */
        contentPane = new JPanel();

	/* Create and add label */
		//NEEDS LINE BREAKS//
	    	//NEEDS OPENING IMAGE//
	label = new JLabel("Hello.");
        contentPane.add(label);

	/* Create and add button */
        button = new JButton("Start");
    	button.setActionCommand("Start");
    	button.addActionListener(this);
    	contentPane.add(button);

	/* Add content pane to frame */
        frame.setContentPane(contentPane);

        /* Size and then display the frame. */
        frame.pack();
        frame.setVisible(true);
    }
    
    
    /**
     * Handle button click action event
     * pre: none
     * post: Clicked button has different text and label
     * displays message depending on when the button was clicked.
     */
    public void actionPerformed(ActionEvent event) {
        String eventName = event.getActionCommand();
        
        if (eventName.equals("Start")) {
        	label.setText("");
        	button.setText("Hear some inspiration.");
        	button.setActionCommand("Hear some inspiration.");
        } else {
        	String random = (labelText[new Random().nextInt(labelText.length)]);
        	label.setText(random);
        	button.setText("Hear more inspiration.");
        	button.setActionCommand("Hear more inspiration.");
        }
    }


    /**
     * Create and show the GUI.
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        MiniMotivations greeting = new MiniMotivations();
    }
     

    public static void main(String[] args) {
        /* Methods that create and show a GUI should be 
           run from an event-dispatching thread */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}

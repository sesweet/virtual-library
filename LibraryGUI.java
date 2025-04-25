package virtuallibrary;

/*
 * Project: Virtual Library
 * Author: Jared Sanders
 * Date: April 25, 2025
 * Description: This class provides a minimal graphical user interface for the virtual library system.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGUI {
	
	private JFrame frame;
    private Library library;

    // Default constructor
    // Initializes the GUI and links it to a library instance
    public LibraryGUI(Library library) {
        this.library = library;
        initialize();
    }
    
    // Sets up the main GUI window
    private void initialize() {
        frame = new JFrame("Virtual Library");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton viewBooksButton = new JButton("View Books");
        frame.getContentPane().add(viewBooksButton, BorderLayout.CENTER);
        
        // Placeholder for action listener
        viewBooksButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action code will go here
            }
        });

        frame.setVisible(true);
    }

    // Returns the main application frame
    public JFrame getFrame() {
        return frame;
    }
}



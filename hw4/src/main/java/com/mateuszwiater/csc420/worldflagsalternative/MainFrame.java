package com.mateuszwiater.csc420.worldflagsalternative;

import net.miginfocom.swing.MigLayout;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.util.List;

/**
 * The main window of the program.
 */
class MainFrame extends JFrame {

    /**
     * The constructor.
     *
     * @param minSize the smallest dimensions the flag panel can become.
     * @param flags the list of supported flags.
     */
    MainFrame(final Dimension minSize, final List<Flag> flags) {
        // Set the window parameters
        setTitle("World Flags Alternative");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new MigLayout("","[grow,fill]","[grow,fill]"));

        // Create the flag and selection panels
        final FlagPanel flagPanel = new FlagPanel(minSize);
        final SelectionPanel selectionPanel = new SelectionPanel(flagPanel, flags);

        // Add the components to the window
        add(flagPanel);
        add(selectionPanel);

        // Set the windows minimum size
        pack();
        setMinimumSize(getPreferredSize());
    }
}

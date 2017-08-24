import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * 
 * An event handling application that asks for a person's name and occupation.
 *
 */
public class MainFrame extends JFrame {

	private DetailsPanel detailsPanel;

	public MainFrame(String title) {
		super(title);
		// Sets layout manager
		setLayout(new BorderLayout());
		// Creates Swing Component
		JTextArea textArea = new JTextArea();
		detailsPanel = new DetailsPanel();
		detailsPanel.addDetailListener(new DetailListener() {
			public void detailEventOccurred(DetailEvent event) {
				String text = event.getText();
				textArea.append(text);
			}
		});
		// Adds Swing Components to content pane
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(detailsPanel, BorderLayout.WEST);
	}
}

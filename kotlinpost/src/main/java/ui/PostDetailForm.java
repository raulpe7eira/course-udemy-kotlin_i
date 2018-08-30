package ui;

import business.PostBusiness;
import entity.PostEntity;

import javax.swing.*;
import java.awt.*;

class PostDetailForm extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JLabel descriptionLabel;

    PostDetailForm(int id) throws HeadlessException {
        super("Post > detail #" + id);

        this.initComponents();

        this.setContentPane(mainPanel);
        this.setSize(500, 250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.load(id);
    }

    private void initComponents() {
        titleLabel = new JLabel();
        titleLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
        titleLabel.setBackground(Color.LIGHT_GRAY);
        titleLabel.setOpaque(true);

        descriptionLabel = new JLabel();
        descriptionLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
        descriptionLabel.setBackground(Color.LIGHT_GRAY);
        descriptionLabel.setOpaque(true);
        descriptionLabel.setVerticalAlignment(SwingConstants.TOP);

        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5,5,5));
        mainPanel.setLayout(new GridBagLayout());

        mainPanel.add(new JLabel("Title:"), new GridBagConstraints(
                0, 0, 1, 1, 1, 0,
                GridBagConstraints.NORTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 3, 0), 0, 0
        ));
        mainPanel.add(titleLabel, new GridBagConstraints(
                0, 1, 1, 1, 1, 0,
                GridBagConstraints.NORTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 5, 0), 0, 0
        ));

        mainPanel.add(new JLabel("Description:"), new GridBagConstraints(
                0, 2, 1, 1, 1, 0,
                GridBagConstraints.NORTHEAST, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 3, 0), 0, 0
        ));
        mainPanel.add(descriptionLabel, new GridBagConstraints(
                0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTHEAST, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0
        ));
    }

    private void load(int id) {
        PostEntity entity = new PostBusiness().getSinglePost(id);

        this.titleLabel.setText(entity.getTitle());
        this.descriptionLabel.setText("<html>" + entity.getBody() + "</html>");
    }
}

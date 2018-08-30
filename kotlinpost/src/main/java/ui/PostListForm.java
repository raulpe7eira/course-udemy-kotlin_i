package ui;

import business.PostBusiness;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PostListForm extends JFrame {
    private JPanel mainPanel;
    private JTable postTable;

    public PostListForm() throws HeadlessException {
        super("Post > all list");

        this.initComponents();
        this.initListeners();

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(550, 550);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.load();
    }

    private void initComponents() {
        postTable = new JTable();

        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5,5,5));
        mainPanel.setLayout(new GridBagLayout());

        mainPanel.add(new JScrollPane(postTable), new GridBagConstraints(
                0, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0
        ));
    }

    private void initListeners() {
        postTable.getSelectionModel().addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) {
                Object value = postTable.getValueAt(postTable.getSelectedRow(), 0);
                new PostDetailForm(Integer.parseInt(value.toString()));
            }
        });
    }

    private void load() {
        Object[][] data = new PostBusiness().getAllPosts().stream().map(postEntity ->
                new Object[]{postEntity.getId(), postEntity.getTitle()}
        ).toArray(Object[][]::new);

        Object[] columnNames = {"ID", "Title"};

        this.postTable.setModel(new DefaultTableModel(data, columnNames));
    }
}

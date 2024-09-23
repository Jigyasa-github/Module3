package Module3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class RegistrationForm extends JFrame {
    private JTextField nameField;
    private JTextField contactField;
    private JTextArea addressField;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JButton registerButton, deleteButton, updateButton, resetButton, exitButton;
    private JTable userTable;
    private DefaultTableModel tableModel;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding

        // Registration Panel
        JPanel registrationPanel = new JPanel();
        registrationPanel.setLayout(new GridBagLayout());
        GridBagConstraints regGbc = new GridBagConstraints();
        regGbc.insets = new Insets(5, 5, 5, 5);
        
        // Name
        regGbc.gridx = 0; regGbc.gridy = 0; regGbc.anchor = GridBagConstraints.EAST;
        registrationPanel.add(new JLabel("Name:"), regGbc);
        regGbc.gridx = 1; regGbc.anchor = GridBagConstraints.WEST;
        nameField = new JTextField(20);
        registrationPanel.add(nameField, regGbc);

        // Gender
        regGbc.gridx = 0; regGbc.gridy = 1; regGbc.anchor = GridBagConstraints.EAST;
        registrationPanel.add(new JLabel("Gender:"), regGbc);
        regGbc.gridx = 1; regGbc.anchor = GridBagConstraints.WEST;
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        registrationPanel.add(genderPanel, regGbc);

        // Address
        regGbc.gridx = 0; regGbc.gridy = 2; regGbc.anchor = GridBagConstraints.NORTHEAST;
        registrationPanel.add(new JLabel("Address:"), regGbc);
        regGbc.gridx = 1; regGbc.anchor = GridBagConstraints.WEST;
        addressField = new JTextArea(3, 20);
        addressField.setLineWrap(true);
        addressField.setWrapStyleWord(true);
        registrationPanel.add(new JScrollPane(addressField), regGbc);

        // Contact
        regGbc.gridx = 0; regGbc.gridy = 3; regGbc.anchor = GridBagConstraints.EAST;
        registrationPanel.add(new JLabel("Contact:"), regGbc);
        regGbc.gridx = 1; regGbc.anchor = GridBagConstraints.WEST;
        contactField = new JTextField(15);
        registrationPanel.add(contactField, regGbc);

        // Buttons
        regGbc.gridx = 0; regGbc.gridy = 4; regGbc.gridwidth = 2; regGbc.anchor = GridBagConstraints.CENTER;

        registerButton = new JButton("Register");
        registrationPanel.add(registerButton, regGbc);
        
        regGbc.gridy = 5; // Move to next row
        deleteButton = new JButton("Delete");
        registrationPanel.add(deleteButton, regGbc);
        
        regGbc.gridy = 6; // Move to next row
        updateButton = new JButton("Update");
        registrationPanel.add(updateButton, regGbc);
        
        regGbc.gridy = 7; // Move to next row
        resetButton = new JButton("Reset");
        registrationPanel.add(resetButton, regGbc);
        
        regGbc.gridy = 8; // Move to next row
        exitButton = new JButton("Exit");
        registrationPanel.add(exitButton, regGbc);

        // User Table Panel
        String[] columnNames = {"Name", "Gender", "Address", "Contact"};
        tableModel = new DefaultTableModel(columnNames, 0);
        userTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(userTable);

        // Adding panels to the main frame
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0.5; gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        add(registrationPanel, gbc);
        
        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 1.0; gbc.weighty = 1.0;
        add(tableScrollPane, gbc);
        
        // Action Listeners for Buttons
        registerButton.addActionListener(e -> registerUser());
        deleteButton.addActionListener(e -> deleteUser());
        updateButton.addActionListener(e -> updateUser());
        resetButton.addActionListener(e -> resetFields());
        exitButton.addActionListener(e -> System.exit(0));
    }

    private void registerUser() {
        String name = nameField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String address = addressField.getText();
        String contact = contactField.getText();

        // Add user to the table
        tableModel.addRow(new Object[]{name, gender, address, contact});

        // Clear fields
        resetFields();
    }

    private void deleteUser() {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Select a row to delete.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void updateUser() {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            String name = nameField.getText();
            String gender = maleRadio.isSelected() ? "Male" : "Female";
            String address = addressField.getText();
            String contact = contactField.getText();

            tableModel.setValueAt(name, selectedRow, 0);
            tableModel.setValueAt(gender, selectedRow, 1);
            tableModel.setValueAt(address, selectedRow, 2);
            tableModel.setValueAt(contact, selectedRow, 3);

            resetFields();
        } else {
            JOptionPane.showMessageDialog(this, "Select a row to update.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void resetFields() {
        nameField.setText("");
        contactField.setText("");
        addressField.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationForm().setVisible(true);
        });
    }
}

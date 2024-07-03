// package AAU;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends JFrame {
    private GridBagConstraints constraints;
    private GridBagLayout layout;

    private JPanel mainPanel;
    private JPanel searchPanel;
    private JPanel translationPanel;
    private JPanel descriptionPanel;
    private JPanel favoritePanel;
    private JTextArea resultArea;
    private JTextArea descriptionArea;
    private JTextField searchField;
    private JList<String> suggestionList;
    private DefaultListModel<String> listModel;
    private JButton searchButton;
    private JButton clearButton;
    private JButton favoriteButton;
    private JButton backButton;
    private JButton removeFavoriteButton;

    private Translation translation;
    private boolean isEnglishToSpanish;
    private List<String> favoriteWords;
    private JScrollPane listScrollPane;

    //Constructor 
    public Main() {

        translation = new Translation();
        isEnglishToSpanish = true; // Default translation mode
        favoriteWords = new ArrayList<>();

        setTitle("English<>Español Dictionary App");
        ImageIcon appIcon = new ImageIcon("app_Icon.png");
        setIconImage(appIcon.getImage());
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Add menu
        JMenu appMenu = new JMenu("App-Menu");
        menuBar.add(appMenu);

        JMenuItem englishToSpanishItem = new JMenuItem("English to Español");
        JMenuItem spanishToEnglishItem = new JMenuItem("Español to English");
        JMenuItem showFavoritesItem = new JMenuItem("Favorites");
        JMenuItem aboutMenuItem = new JMenuItem("About App");
        JMenuItem exitMenuItem = new JMenuItem("Exit App");
        appMenu.add(englishToSpanishItem);
        appMenu.add(spanishToEnglishItem);
        appMenu.add(showFavoritesItem);
        appMenu.add(aboutMenuItem);
        appMenu.add(exitMenuItem);

        englishToSpanishItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isEnglishToSpanish = true;
                setTitle("Dictionary App - English to Español");
                updateSuggestions();
            }
        });

        spanishToEnglishItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isEnglishToSpanish = false;
                setTitle("Dictionary App - Español to English");
                updateSuggestions();
            }
        });

        showFavoritesItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder favorites = new StringBuilder("Favorites Words:\n");
                if (favoriteWords.isEmpty()) {
                    favorites.append("No Saved words!");
                } else {
                    for (String word : favoriteWords) {
                        favorites.append(word).append("\n");
                    }
                }
                JOptionPane.showMessageDialog(Main.this, favorites.toString(), "Favorite",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        aboutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this,
                        "This V1.0 Dictionary App is Developed by AAU Cs Section 1 Group * Students\n Contact us: group1@aau.edu.et", "About",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        searchPanel = new JPanel();
        searchPanel.setLayout(new BorderLayout());

        searchField = new JTextField();
        searchField.setToolTipText("Search here");
        searchField.setFont(new Font("Arial", Font.PLAIN, 18));
        searchPanel.add(searchField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        ImageIcon searchIcon = new ImageIcon( new ImageIcon("search_icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        ImageIcon clearIcon = new ImageIcon( new ImageIcon("clear_icon.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        ImageIcon addfavourite = new ImageIcon( new ImageIcon("favorites_icon.png").getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH));
        favoriteButton = new JButton(addfavourite);
        ImageIcon removeFavoriteIcon = new ImageIcon( new ImageIcon("trash.png").getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH));
        removeFavoriteButton = new JButton(removeFavoriteIcon);
        removeFavoriteButton.setFont(new Font("Arial", Font.PLAIN, 16));
        removeFavoriteButton.setToolTipText("Remove from favorites");

        favoriteButton.setToolTipText("Save to favourites");
        favoriteButton.setFont(new Font("Arial", Font.PLAIN, 16));
        JButton searchButton = new JButton(searchIcon);
        searchButton.setToolTipText("Search");
        buttonPanel.add(searchButton);

        clearButton = new JButton(clearIcon);
        clearButton.setToolTipText("Clear");
        buttonPanel.add(clearButton);

        searchPanel.add(buttonPanel, BorderLayout.EAST);

        add(searchPanel, BorderLayout.NORTH);

        listModel = new DefaultListModel<>();
        suggestionList = new JList<>(listModel);
        suggestionList.setFont(new Font("Arial", Font.PLAIN, 16));
        suggestionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        suggestionList.setVisibleRowCount(10);
        listScrollPane = new JScrollPane(suggestionList);
        add(listScrollPane, BorderLayout.CENTER);
        mainPanel = new JPanel();
        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        mainPanel.setLayout(layout);

        translationPanel = new JPanel(new BorderLayout());
        descriptionPanel = new JPanel(new BorderLayout());
        favoritePanel = new JPanel();

        descriptionArea = new JTextArea();
        descriptionArea.setEditable(false);
        descriptionArea.setLineWrap(true);
        descriptionArea.setWrapStyleWord(true);
        descriptionArea.setVisible(false);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setVisible(false);

        descriptionPanel.add(new JScrollPane(descriptionArea), BorderLayout.CENTER);
        translationPanel.add(new JScrollPane(resultArea), BorderLayout.CENTER);
        favoritePanel.add(favoriteButton);
        favoritePanel.add(removeFavoriteButton);

        // Adding panels to the contentPane
        addComponents(mainPanel, translationPanel, 0, 0, 1, 1, 2, 2);
        addComponents(mainPanel, descriptionPanel, 1, 0, 1, 1, 4, 4);
        addComponents(mainPanel, favoritePanel, 2, 0, 1, 1, 1.0, 0.1);

        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                updateSuggestions();
                listScrollPane.setVisible(true);
            }
            public void keyPressed(KeyEvent a){
                if(a.getKeyCode()== KeyEvent.VK_ENTER){
                    searchWord(searchField.getText());
                    removeSuggestionList();
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchWord(searchField.getText());
                removeSuggestionList();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchField.setText("");
                resultArea.setText("");
                descriptionArea.setText("");
                listModel.clear();
                updateSuggestions();
                revertLayout();
                resultArea.setVisible(false);
                descriptionArea.setVisible(false);
            }
        });

        favoriteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedWord = searchField.getText();
                if (selectedWord != null && !selectedWord.trim().isEmpty()) {
                    if (favoriteWords.contains(selectedWord)) {
                        JOptionPane.showMessageDialog(Main.this, selectedWord + " is already in favorites.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        favoriteWords.add(selectedWord);
                        JOptionPane.showMessageDialog(Main.this, selectedWord + " is added to favorites.");
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Please select a word to add to favorites.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        removeFavoriteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedWord = searchField.getText();
                if (selectedWord != null && !selectedWord.trim().isEmpty()) {
                    if (favoriteWords.contains(selectedWord)) {
                        favoriteWords.remove(selectedWord);
                        JOptionPane.showMessageDialog(Main.this, selectedWord + " is removed from favorites.");
                    } else {
                        JOptionPane.showMessageDialog(Main.this, " This word is not in favorites lists!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Please select a word to remove from favorites!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        suggestionList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedWord = suggestionList.getSelectedValue();
                if (selectedWord != null) {
                    searchField.setText(selectedWord);
                    searchWord(selectedWord);
                    add(mainPanel, BorderLayout.CENTER);
                    listScrollPane.setVisible(false);
                    addBackButton();
                }
            }
        });

        updateSuggestions();
    }

    void addComponents(JPanel parent, Component component, int row, int col, int width, int height, double weightx, double weighty) {
        constraints.gridx = col;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        constraints.fill = GridBagConstraints.BOTH; // Ensure the component fills the cell
        constraints.weightx = weightx; // Allow horizontal expansion
        constraints.weighty = weighty; // Allow vertical expansion
        layout.setConstraints(component, constraints);
        parent.add(component);
    }

    private void updateSuggestions() {
        String text = searchField.getText().toLowerCase();
        listModel.clear();
        String[] words;
        if (isEnglishToSpanish) {
            words = translation.getEnglishWords();
        } else {
            words = translation.getSpanishWords();
        }

        List<String> suggestions = new ArrayList<>();
        for (String word : words) {
            if (word.toLowerCase().startsWith(text)) {
                suggestions.add(word);
            }
        }

        Collections.sort(suggestions);

        for (int i = 0; i < Math.min(suggestions.size(), 10); i++) {
            listModel.addElement(suggestions.get(i));
        }
    }

    private void searchWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            return;
        }

        if (isEnglishToSpanish) {
            String translatedWord = translation.getEnglishToSpanish(word);
            String description = translation.getEnglishDescription(word);
            resultArea.setText("Meaning: " + (translatedWord != null ? translatedWord: "The word is not found in the dictionary. Try another word!"));
            descriptionArea.setText("Description: " + (description != null ? description: "Description not found, Since the word is not in the dictionary. Try another word!"));
        } else {
            String translatedWord = translation.getSpanishToEnglish(word);
            String description = translation.getSpanishDescription(word);
            resultArea.setText("Meaning: " + (translatedWord != null ? translatedWord: "The word is not found in the dictionary. Try another word!"));
            descriptionArea.setText("Description: " + (description != null ? description: "Description not found, since the word is not in the dictionary. Try another word!"));
        }

        resultArea.setVisible(true);
        descriptionArea.setVisible(true);
    }

    private void removeSuggestionList() {
        remove(listScrollPane);
        add(mainPanel, BorderLayout.CENTER);
        revalidate(); //
        repaint();
        addBackButton();
    }

    private void addBackButton() {
        if (backButton == null) {
            backButton = new JButton("Back");
            backButton.setFont(new Font("Arial", Font.PLAIN, 16));
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    revertLayout();
                }
            });
        }
        add(backButton, BorderLayout.SOUTH);
        revalidate();
        repaint();
    }

    private void revertLayout() {
        remove(mainPanel);
        remove(backButton);
        add(listScrollPane, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        Main run = new Main();
        run.setVisible(true);
    }
}

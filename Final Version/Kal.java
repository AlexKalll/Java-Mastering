searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    // User has pressed the backspace key
                    String text = searchField.getText();
                    if (text.isEmpty()) {
                        // If the search field is already empty, do nothing
                        updateSuggestions();
                        return;
                    }
                    
                    // Remove the last character from the search field
                    searchField.setText(text.substring(0, text.length() - 1));
                    
                    // Clear the suggestion list and hide the meaning and description areas
                    //listModel.clear();
                    resultArea.setVisible(false);
                    descriptionArea.setVisible(false);
                    
                    // Update the suggestions
                    updateSuggestions();
                }
            }
        });
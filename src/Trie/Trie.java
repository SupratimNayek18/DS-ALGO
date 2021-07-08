package Trie;

public class Trie {
    private TrieNode root;

    Trie(){
        root = new TrieNode();
        System.out.println("The Trie has been created");
    }
    
    void insert(String word){
        TrieNode current = root;
        for(int i = 0; i < word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }
            current.endOfString = true;
            System.out.println("Successfully inserted "+word+" in Trie");   
    }

    boolean search(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if(node == null){
                System.out.println("Word "+word+" does not exist in Trie");
                return false;
            }
            current = node;
        }
        if(current.endOfString==true){
            System.out.println("Word "+word+" exists in Trie");
            return true;
        }else{
            System.out.println("Word "+word+" does not exist in Trie or maybe a substring");
            return false;
        }
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
  
        if (currentNode.children.size() > 1) {
          delete(currentNode, word, index+1);
          return false;
        }
        if (index == word.length() -1) {
          if (currentNode.children.size()>=1) {
            currentNode.endOfString = false;
            return false;
          } else {
            parentNode.children.remove(ch);
            return true;
          }
        }
        if (currentNode.endOfString == true) {
          delete(currentNode, word, index+1);
          return false;
        }
        canThisNodeBeDeleted = delete(currentNode, word, index+1);
        if (canThisNodeBeDeleted == true) {
          parentNode.children.remove(ch);
          return true;
        } else {
          return false;
        }
      }
  
      public void delete(String word) {
        if (search(word) == true) {
          delete(root, word, 0);
        }
      }
}

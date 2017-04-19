import java.util.HashMap;

public class Q40_URLSearchEngine {

	public class TrieNode{
		public HashMap<Character, TrieNode> childrenNode;
		
		public TrieNode(){
			this.childrenNode = new HashMap<Character, TrieNode>();
		}
		
		public boolean hasChildNode(char c){
			return this.childrenNode.containsKey(c);
		}
		
		public void makeChildNode(char c){
			this.childrenNode.put(c, new TrieNode());
		}
		
		public TrieNode getChildNode(char c){
			return this.childrenNode.get(c);
		}
	}
	
	public class Trie{
		
		private TrieNode root;
		private final char EndMarker = '\0';
		
		public Trie(){
			this.root = new TrieNode();
		}
		
		public boolean checkPresentAndAdd(String word){
			
			TrieNode currentNode = this.root;
			boolean isNewWord = false;
			
			for(int i = 0; i < word.length(); i++){
				char c = word.charAt(i);
				
				if(!currentNode.hasChildNode(c)){
					isNewWord = true;
					currentNode.makeChildNode(c); //adds a new child to the childrenNode hashmap
				}
				
				currentNode = currentNode.getChildNode(c);
			}
			
			if(!currentNode.hasChildNode(EndMarker)){
				isNewWord = true;
				currentNode.makeChildNode(EndMarker);
			}
			
			return isNewWord;
			
		}
		
	}

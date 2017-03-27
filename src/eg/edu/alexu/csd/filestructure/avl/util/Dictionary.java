package eg.edu.alexu.csd.filestructure.avl.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import eg.edu.alexu.csd.filestructure.avl.tree.AVLTree;

public class Dictionary implements IDictionary {

	private AVLTree<String> tree;

	public Dictionary() {
		this.tree = new AVLTree<>();
	}
	@Override
	public void load(final File file) {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = bufferedReader.readLine()) != null) {
		    	tree.insert(line);
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean insert(final String word) {
		if (exists(word)) {
			return false;
		}
		tree.insert(word);
		return true;
	}

	@Override
	public boolean exists(final String word) {
		return tree.search(word);
	}

	@Override
	public boolean delete(final String word) {
		return this.tree.delete(word);
	}

	@Override
	public int size() {
		return this.tree.size();
	}

	@Override
	public int height() {
		return tree.height();
	}
}

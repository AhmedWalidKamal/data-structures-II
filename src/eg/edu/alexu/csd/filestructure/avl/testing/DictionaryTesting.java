package eg.edu.alexu.csd.filestructure.avl.testing;
import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import eg.edu.alexu.csd.filestructure.avl.util.Dictionary;

public class DictionaryTesting {

	@Test
    public void loadFromFileTest() {
		Dictionary dictionary = new Dictionary();
        dictionary.load(new File("test.txt"));
        Assert.assertEquals(dictionary.height(), 18);
        Assert.assertEquals(dictionary.size(), 354985);
        Assert.assertTrue(dictionary.exists("abcoulomb"));
        Assert.assertFalse(dictionary.exists("existence is not for the feint hearted."));
    }

	@Test
    public void deletionTest() {
		Dictionary dictionary = new Dictionary();
        dictionary.load(new File("test.txt"));
        Assert.assertTrue(dictionary.exists("abcoulomb"));
        Assert.assertEquals(dictionary.size(), 354985);
        dictionary.delete("abcoulomb");
        Assert.assertFalse(dictionary.exists("abcoulomb"));
        Assert.assertEquals(dictionary.size(), 354984);
        dictionary.delete("zymosans"); // valid deletion
        dictionary.delete("zymotechnics"); // valid deletion
        dictionary.delete("sslag,aslgoqw"); // invalid deletion
        Assert.assertEquals(dictionary.size(), 354982);
    }

	@Test
    public void insertionTest() {
		Dictionary dictionary = new Dictionary();
        dictionary.load(new File("test.txt"));
        dictionary.insert("this is a new word!");
        Assert.assertTrue(dictionary.exists("this is a new word!"));
        Assert.assertEquals(dictionary.height(), 18);
        Assert.assertEquals(dictionary.size(), 354986);
    }
}

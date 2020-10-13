package ee.agri.alkor.impl.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.apache.velocity.runtime.resource.loader.FileResourceLoader;

/**
 * Apache fileresourceloader override
 * @author Tiit
 */
public class FileLoader extends FileResourceLoader {
	private InputStream findTemplate(String path, String template) {
		try {
			File file = new File(path, template);
			if(file.canRead()) {
				return new BufferedInputStream(new FileInputStream(file.getAbsolutePath()));
			} else {
				System.out.println("Could not locate file: \"" + file.getPath() + "\"");
			}
			return null;
		} catch (FileNotFoundException fnfe) {}
		return null;
	}
}
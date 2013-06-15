package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.yaml.snakeyaml.Yaml;

public class YamlUtil {

	public static List loadYaml(String nameFile) {
		final Yaml yaml = new Yaml();
		Reader reader = null;
		try {
			reader = new FileReader("conf/" + nameFile);
			return (List) yaml.load(reader);
		} catch (final FileNotFoundException fnfe) {
			System.err.println("We had a problem reading the YAML from the file because we couldn't find the file."
					+ fnfe);
		}
		finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (final IOException ioe) {
					System.err.println("We got the following exception trying to clean up the reader: " + ioe);
				}
			}
		}
		return null;

	}

}

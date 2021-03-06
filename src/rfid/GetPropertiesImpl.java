package rfid;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * GetProperties.
 * 
 * This class is used to read the config.properties file. The
 * config.properties file must be located next to the .jar file
 */
public class GetPropertiesImpl {
	private String host;
	private int port;

	/**
	 * Set Properties values.
	 * 
	 * @throws IOException
	 */
	public void setPropValues() throws IOException {
		Properties prop = new Properties();

		FileInputStream file;

		// The config.properties file must be located next to the executable .jar file.
		String path = "./config.properties";
		file = new FileInputStream(path);

		try {
			prop.load(file);

			host = prop.getProperty("host");
			port = Integer.parseInt(prop.getProperty("port"));
		} catch (Exception ex) {
			// @TODO: Handle error.
		}

		file.close();
	}

	/**
	 * Get host.
	 * 
	 * @return String
	 */
	public String getHostProperty() {
		return this.host;
	}

	/**
	 * Get port.
	 * 
	 * @return int
	 */
	public int getPortProperty() {
		return this.port;
	}
}

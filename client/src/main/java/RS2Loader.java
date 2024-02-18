import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.math.BigInteger;
import java.net.URL;
import java.util.Properties;

import javax.swing.*;

/**
 * RS2Loader class extends Applet to handle the loading properties, managing cryptographic elements,
 * and handling UI components related to the applet's functionality.
 */
public class RS2Loader extends Applet {

    private static final long serialVersionUID = 1L;

    /**
     * Properties object containing various settings and configurations.
     */
    public static Properties properties = new Properties();

    /**
     * JFrame representing the main applet frame.
     */
    public JFrame appletFrame;

    /**
     * JPanel containing the applet's main panel.
     */
    public JPanel appletPanel = new JPanel();

    /**
     * Boolean flag for various configurations.
     */
    public static boolean ENABLE_LARGE_FRAME = false;

    /**
     * Main method to initialize and run the applet.
     *
     * @param strings Command-line arguments.
     */
    public static void main(String[] strings) {
        RS2Loader loader = new RS2Loader();
        loader.doFrame();
    }

    /**
     * Initialization method to load the applet.
     */
    public void init() {
        loadApplet();
    }

    /**
     * Load applet with required parameters and client drawing.
     */
    void loadApplet() {
        setParms();
        drawClient();
    }

    /**
     * Frame handling method for the applet.
     */
    public void doFrame() {
        setParms();
        openFrame();
        drawClient();
    }

    /**
     * Set the required parameters for the applet.
     */
    void setParms() {
        properties.put("cabbase", "g.cab");
        properties.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
        properties.put("colourid", "0");
        properties.put("worldid", "16");
        properties.put("lobbyid", "15");
        properties.put("lobbyaddress", ClientConfig.HOST_ADDRESS);
        properties.put("demoid", "0");
        properties.put("demoaddress", "");
        properties.put("modewhere", "1");
        properties.put("modewhat", "0");
        properties.put("lang", "0");
        properties.put("objecttag", "0");
        properties.put("js", "1");
        properties.put("game", "0");
        properties.put("affid", "0");
        properties.put("advert", "1");
        properties.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
        properties.put("country", "0");
        properties.put("haveie6", "0");
        properties.put("havefirefox", "1");
        properties.put("cookieprefix", "");
        properties.put("cookiehost", ClientConfig.HOST_ADDRESS);
        properties.put("cachesubdirid", "0");
        properties.put("crashurl", "");
        properties.put("unsignedurl", "");
        properties.put("sitesettings_member", "1");
        properties.put("frombilling", "false");
        properties.put("sskey", "");
        properties.put("force64mb", "false");
        properties.put("worldflags", "8");
    }

    /**
     * Open the applet frame with specified configurations.
     */
    void openFrame() {
        appletFrame = new JFrame("RuneScape");
        appletFrame.setLayout(new BorderLayout());
        appletPanel.setLayout(new BorderLayout());
        appletPanel.add(this);
        if (ENABLE_LARGE_FRAME) {
            appletPanel.setPreferredSize(new Dimension(1450, 795));
        } else {
            appletPanel.setPreferredSize(new Dimension(765, 503));
        }
        appletFrame.getContentPane().add(appletPanel, "Center");
        appletFrame.pack();
        appletFrame.setVisible(true);
        appletFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        appletFrame.setLocationRelativeTo(null);
    }

    /**
     * Draw the client within the applet.
     */
    void drawClient() {
        try {
            Static166.anApplet1 = this;
            client clnt = new client();
            clnt.init();
            clnt.start();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Retrieve a parameter value by its key.
     *
     * @param string The key for the desired parameter.
     * @return The value of the parameter.
     */
    public String getParameter(String string) {
        return (String) properties.get(string);
    }

    /**
     * Retrieve the document base URL.
     *
     * @return The URL of the code base.
     */
    public URL getDocumentBase() {
        return getCodeBase();
    }

    /**
     * Retrieve the document base URL.
     *
     * @return The URL of the code base.
     */
    public URL getCodeBase() {
        try {
            return new URL("http://" + ClientConfig.HOST_ADDRESS);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

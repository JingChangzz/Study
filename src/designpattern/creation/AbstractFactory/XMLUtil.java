package designpattern.creation.AbstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class XMLUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
            Document doc = documentBuilder.parse(new File("src/designpattern/creation/AbstractFactory/config_abstractFactory.xml"));

            NodeList nodeList = doc.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            String className = classNode.getNodeValue();

            Class c = Class.forName(className);

            Object object = c.newInstance();

            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}

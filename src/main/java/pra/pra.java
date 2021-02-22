package pra;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class pra {
    public static void main(String[] args) {
        try{
            SAXReader reader = new SAXReader();
            Document doc = reader.read("./emplist.xml");

            Element root = doc.getRootElement();
            String name = root.getName();

            List<Element> list = root.elements("emp");
            System.out.println("共有"+list.size()+"个<emp标签>");
            for (Element empEle : list){
                Element nameEle = empEle.element("name");
                String enmae = nameEle.getText();

                Element ageEle = empEle.element("age");
                int age = Integer.parseInt(
                        ageEle.getText()
                );

                String gender = empEle.elementText("gender");

                int salary = Integer.parseInt(
                        empEle.elementText("salary")
                );

                int id = Integer.parseInt(
                        empEle.attributeValue("id")
                );

                System.out.println(id+","+enmae+","+gender+","+age+","+salary);

            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

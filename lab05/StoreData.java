/**
 * Created by Khadija on 3/29/2017.
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StoreData {
    public static void main(String[] args) {
        //creating configuration object
        Configuration cfg = new Configuration();
        cfg.configure("config.cfg.xml");//populates the data of the configuration file
        //creating seession factory object
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory factory = cfg.buildSessionFactory(serviceRegistry);
        //creating session object
        Session session = factory.openSession();
        //creating transaction object
        Transaction t = session.beginTransaction();

        String csvFile = "/Users/Khadija/Documents/khadija/semester 6/Software Construction/Lab/GeoLiteCity-Location1.csv";

        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                CitySearch C = new CitySearch();

                String[] country = line.split(cvsSplitBy);  // use comma as separator

                C.setId(Integer.valueOf(country[0].toString()));
                C.setName(country[1].toString());
                C.setLat(Double.valueOf(country[5].toString()));
                C.setLon(Double.valueOf(country[6].toString()));
                session.persist(C);//persisting the object


            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        t.commit();//transaction is commited
        session.close();
    }
}


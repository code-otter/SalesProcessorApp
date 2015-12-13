
package fr.codeotter.salesservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.codeotter.salesservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.codeotter.salesservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllSalesRequest }
     * 
     */
    public AllSalesRequest createAllSalesRequest() {
        return new AllSalesRequest();
    }

    /**
     * Create an instance of {@link AllSalesResponse }
     * 
     */
    public AllSalesResponse createAllSalesResponse() {
        return new AllSalesResponse();
    }

    /**
     * Create an instance of {@link Sale }
     * 
     */
    public Sale createSale() {
        return new Sale();
    }

}

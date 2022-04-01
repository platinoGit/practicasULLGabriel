
package com.mycompany.project.plexus.cxf.contractfirst;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.project.plexus.cxf.contractfirst package. 
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

    private final static QName _ResultCode_QNAME = new QName("http://contractfirst.cxf.plexus.project.mycompany.com", "resultCode");
    private final static QName _TestOrder_QNAME = new QName("http://contractfirst.cxf.plexus.project.mycompany.com", "TestOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.project.plexus.cxf.contractfirst
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestOrder }
     * 
     */
    public TestOrder createTestOrder() {
        return new TestOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://contractfirst.cxf.plexus.project.mycompany.com", name = "resultCode")
    public JAXBElement<String> createResultCode(String value) {
        return new JAXBElement<String>(_ResultCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://contractfirst.cxf.plexus.project.mycompany.com", name = "TestOrder")
    public JAXBElement<TestOrder> createTestOrder(TestOrder value) {
        return new JAXBElement<TestOrder>(_TestOrder_QNAME, TestOrder.class, null, value);
    }

}

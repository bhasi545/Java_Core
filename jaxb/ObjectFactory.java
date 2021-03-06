//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.02 at 03:57:48 PM EDT 
//


package jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Players_QNAME = new QName("", "players");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TeamType }
     * 
     */
    public TeamType createTeamType() {
        return new TeamType();
    }

    /**
     * Create an instance of {@link PlayerType }
     * 
     */
    public PlayerType createPlayerType() {
        return new PlayerType();
    }

    /**
     * Create an instance of {@link StreetAttrType }
     * 
     */
    public StreetAttrType createStreetAttrType() {
        return new StreetAttrType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link PinType }
     * 
     */
    public PinType createPinType() {
        return new PinType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "players")
    public JAXBElement<TeamType> createPlayers(TeamType value) {
        return new JAXBElement<TeamType>(_Players_QNAME, TeamType.class, null, value);
    }

}

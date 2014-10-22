//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.21 at 12:20:44 ip. EEST 
//


package dtBookTools.binded;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for frontmatter element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="frontmatter">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}doctitle"/>
 *           &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}covertitle" minOccurs="0"/>
 *           &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}docauthor" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}level"/>
 *             &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}level1"/>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;attGroup ref="{http://www.daisy.org/z3986/2005/dtbook/}attlist.frontmatter"/>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doctitle",
    "covertitle",
    "docauthor",
    "levelOrLevel1"
})
@XmlRootElement(name = "frontmatter")
public class Frontmatter {

    @XmlElement(namespace = "http://www.daisy.org/z3986/2005/dtbook/", required = true)
    protected Doctitle doctitle;
    @XmlElement(namespace = "http://www.daisy.org/z3986/2005/dtbook/")
    protected Covertitle covertitle;
    @XmlElement(namespace = "http://www.daisy.org/z3986/2005/dtbook/", required = true)
    protected List<Docauthor> docauthor;
    @XmlElements({
        @XmlElement(name = "level1", namespace = "http://www.daisy.org/z3986/2005/dtbook/", required = true, type = Level1 .class),
        @XmlElement(name = "level", namespace = "http://www.daisy.org/z3986/2005/dtbook/", required = true, type = Level.class)
    })
    protected List<Object> levelOrLevel1;
    @XmlAttribute
    protected String smilref;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String showin;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute
    protected String title;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;

    /**
     * Gets the value of the doctitle property.
     * 
     * @return
     *     possible object is
     *     {@link Doctitle }
     *     
     */
    public Doctitle getDoctitle() {
        return doctitle;
    }

    /**
     * Sets the value of the doctitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Doctitle }
     *     
     */
    public void setDoctitle(Doctitle value) {
        this.doctitle = value;
    }

    /**
     * Gets the value of the covertitle property.
     * 
     * @return
     *     possible object is
     *     {@link Covertitle }
     *     
     */
    public Covertitle getCovertitle() {
        return covertitle;
    }

    /**
     * Sets the value of the covertitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Covertitle }
     *     
     */
    public void setCovertitle(Covertitle value) {
        this.covertitle = value;
    }

    /**
     * Gets the value of the docauthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docauthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocauthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Docauthor }
     * 
     * 
     */
    public List<Docauthor> getDocauthor() {
        if (docauthor == null) {
            docauthor = new ArrayList<Docauthor>();
        }
        return this.docauthor;
    }

    /**
     * Gets the value of the levelOrLevel1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelOrLevel1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelOrLevel1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Level1 }
     * {@link Level }
     * 
     * 
     */
    public List<Object> getLevelOrLevel1() {
        if (levelOrLevel1 == null) {
            levelOrLevel1 = new ArrayList<Object>();
        }
        return this.levelOrLevel1;
    }

    /**
     * Gets the value of the smilref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmilref() {
        return smilref;
    }

    /**
     * Sets the value of the smilref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmilref(String value) {
        this.smilref = value;
    }

    /**
     * Gets the value of the showin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowin() {
        return showin;
    }

    /**
     * Sets the value of the showin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowin(String value) {
        this.showin = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

}

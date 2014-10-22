//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.21 at 12:20:44 ip. EEST 
//


package dtBookTools.binded;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for book element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="book">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}frontmatter" minOccurs="0"/>
 *           &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}bodymatter" minOccurs="0"/>
 *           &lt;element ref="{http://www.daisy.org/z3986/2005/dtbook/}rearmatter" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attGroup ref="{http://www.daisy.org/z3986/2005/dtbook/}attlist.book"/>
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
    "frontmatter",
    "bodymatter",
    "rearmatter"
})
@XmlRootElement(name = "book")
public class Book {

    @XmlElement(namespace = "http://www.daisy.org/z3986/2005/dtbook/")
    protected Frontmatter frontmatter;
    @XmlElement(namespace = "http://www.daisy.org/z3986/2005/dtbook/")
    protected Bodymatter bodymatter;
    @XmlElement(namespace = "http://www.daisy.org/z3986/2005/dtbook/")
    protected Rearmatter rearmatter;
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
     * Gets the value of the frontmatter property.
     * 
     * @return
     *     possible object is
     *     {@link Frontmatter }
     *     
     */
    public Frontmatter getFrontmatter() {
        return frontmatter;
    }

    /**
     * Sets the value of the frontmatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frontmatter }
     *     
     */
    public void setFrontmatter(Frontmatter value) {
        this.frontmatter = value;
    }

    /**
     * Gets the value of the bodymatter property.
     * 
     * @return
     *     possible object is
     *     {@link Bodymatter }
     *     
     */
    public Bodymatter getBodymatter() {
        return bodymatter;
    }

    /**
     * Sets the value of the bodymatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bodymatter }
     *     
     */
    public void setBodymatter(Bodymatter value) {
        this.bodymatter = value;
    }

    /**
     * Gets the value of the rearmatter property.
     * 
     * @return
     *     possible object is
     *     {@link Rearmatter }
     *     
     */
    public Rearmatter getRearmatter() {
        return rearmatter;
    }

    /**
     * Sets the value of the rearmatter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rearmatter }
     *     
     */
    public void setRearmatter(Rearmatter value) {
        this.rearmatter = value;
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

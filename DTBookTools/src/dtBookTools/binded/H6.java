//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.21 at 12:20:44 ip. EEST 
//


package dtBookTools.binded;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for h6 element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="h6">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;group ref="{http://www.daisy.org/z3986/2005/dtbook/}inline" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;attGroup ref="{http://www.daisy.org/z3986/2005/dtbook/}attlist.h6"/>
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
    "content"
})
@XmlRootElement(name = "h6")
public class H6 {

    @XmlElementRefs({
        @XmlElementRef(name = "span", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "noteref", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Noteref.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Abbr.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "br", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "cite", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Cite.class),
        @XmlElementRef(name = "strong", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Strong.class),
        @XmlElementRef(name = "samp", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Samp.class),
        @XmlElementRef(name = "sub", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "sent", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Sent.class),
        @XmlElementRef(name = "code", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Code.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Dfn.class),
        @XmlElementRef(name = "annoref", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Annoref.class),
        @XmlElementRef(name = "w", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = W.class),
        @XmlElementRef(name = "pagenum", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Pagenum.class),
        @XmlElementRef(name = "kbd", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Kbd.class),
        @XmlElementRef(name = "a", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = A.class),
        @XmlElementRef(name = "em", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Em.class),
        @XmlElementRef(name = "q", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "prodnote", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "imggroup", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "acronym", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = Acronym.class),
        @XmlElementRef(name = "sup", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class),
        @XmlElementRef(name = "img", namespace = "http://www.daisy.org/z3986/2005/dtbook/", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Object> content;
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
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Noteref }
     * {@link Abbr }
     * {@link Strong }
     * {@link Samp }
     * {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * {@link Sent }
     * {@link Annoref }
     * {@link Pagenum }
     * {@link A }
     * {@link JAXBElement }{@code <}{@link Q }{@code >}
     * {@link JAXBElement }{@code <}{@link Prodnote }{@code >}
     * {@link JAXBElement }{@code <}{@link Img }{@code >}
     * {@link JAXBElement }{@code <}{@link Span }{@code >}
     * {@link JAXBElement }{@code <}{@link Bdo }{@code >}
     * {@link JAXBElement }{@code <}{@link Br }{@code >}
     * {@link Cite }
     * {@link Code }
     * {@link Dfn }
     * {@link W }
     * {@link Kbd }
     * {@link Em }
     * {@link JAXBElement }{@code <}{@link Imggroup }{@code >}
     * {@link Acronym }
     * {@link JAXBElement }{@code <}{@link Sup }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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

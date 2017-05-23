package ee.agri.alkor.xtee.impl;

import java.io.IOException;
import java.lang.reflect.Array;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;
import org.xml.sax.Attributes;
import org.apache.axis.Constants;
import org.apache.axis.components.logger.LogFactory;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.utils.Messages;
import org.apache.axis.wsdl.fromJava.Types;
import org.apache.commons.logging.Log;

/**
 * An StringArraySerializer handles serializing of string arrays.
 * Axis ArraySerializer doesn't produce <item>
 * tags in response.
 *
 *
 * @author isuisalu
 */
public class StringArraySerializer implements Serializer
{
    QName xmlType = null;
    Class javaType = null;
    QName componentType = null;
    QName componentQName = null;

    /**
     * Constructor
     *
     */
    public StringArraySerializer(Class javaType, QName xmlType) {
        this.javaType = javaType;
        this.xmlType = xmlType;
    }

    /**
     * Constructor
     * Special constructor that takes the component type of the array.
     */
    public StringArraySerializer(Class javaType, QName xmlType, QName componentType) {
        this(javaType, xmlType);
        this.componentType = componentType;
    }

    /**
     * Constructor
     * Special constructor that takes the component type and QName of the array.
     */
    public StringArraySerializer(Class javaType, QName xmlType, QName componentType, QName componentQName) {
        this(javaType, xmlType, componentType);
        this.componentQName = componentQName;
    }

    protected static Log log =
        LogFactory.getLog(StringArraySerializer.class.getName());

    /**
     * Serialize an element that is an array.
     * @param name is the element name
     * @param attributes are the attributes...serialize is free to add more.
     * @param value is the value
     * @param context is the SerializationContext
     */
    public void serialize(QName name, Attributes attributes,
                          Object value, SerializationContext context)
        throws IOException
    {
        if (value == null)
            throw new IOException(Messages.getMessage("cantDoNullArray00"));
 
        int len = Array.getLength(value);
        StringBuffer sb = new StringBuffer()
        	.append("<").append(name.getLocalPart())
        	.append(" xsi:type=\"SOAP-ENC:Array\" SOAP-ENC:arrayType=\"xsd:string[")
        	.append(Integer.toString(len)).append("]\" SOAP-ENC:offset=\"[0]\"")
        	.append(" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\">");
        
        for (int index = 0; index < len; index++) {
            Object aValue = Array.get(value, index);
            sb.append("<item xsi:type=\"xsd:string\">")
            .append(aValue.toString()).append("</item>");
        }
        sb.append("</").append(name.getLocalPart()).append(">");
        context.writeString(sb.toString());

    }

    public String getMechanismType() { return Constants.AXIS_SAX; }



    /**
     * Return XML schema for the specified type, suitable for insertion into
     * the &lt;types&gt; element of a WSDL document, or underneath an
     * &lt;element&gt; or &lt;attribute&gt; declaration.
     *
     * @param javaType the Java Class we're writing out schema for
     * @param types the Java2WSDL Types object which holds the context
     *              for the WSDL being generated.
     * @return a type element containing a schema simpleType/complexType
     * @see org.apache.axis.wsdl.fromJava.Types
     */
    public Element writeSchema(Class javaType, Types types) throws Exception {
        return null;
    }
}

package org.openprovenance.prov.core.xml;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.openprovenance.prov.model.NamespacePrefixMapper;
import org.openprovenance.prov.model.QualifiedName;

@JsonPropertyOrder({ "specificEntity", "generalEntity","bundle"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface XML_MentionOf extends HasKind {

    @REF_Qualified_Name
    @JacksonXmlProperty( namespace = NamespacePrefixMapper.PROV_NS)
    public org.openprovenance.prov.model.QualifiedName getGeneralEntity();

    @REF_Qualified_Name
    @JacksonXmlProperty( namespace = NamespacePrefixMapper.PROV_NS)
    public QualifiedName getSpecificEntity();

    @REF_Qualified_Name
    @JacksonXmlProperty( namespace = NamespacePrefixMapper.PROV_NS)
    public QualifiedName getBundle();

}

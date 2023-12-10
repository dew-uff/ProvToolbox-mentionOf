package org.openprovenance.prov.core.jsonld11;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openprovenance.prov.core.jsonld11.serialization.deserial.CustomQualifiedNameDeserializer;
import org.openprovenance.prov.model.QualifiedName;

@JsonPropertyOrder({ "specificEntity", "generalEntity", "bundle"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public interface JLD_MentionOf extends HasKind {


    @JsonDeserialize(using = CustomQualifiedNameDeserializer.class)
    public QualifiedName getGeneralEntity();

    @JsonDeserialize(using = CustomQualifiedNameDeserializer.class)
    public QualifiedName getSpecificEntity();

    @JsonDeserialize(using = CustomQualifiedNameDeserializer.class)
    public QualifiedName getBundle();

}

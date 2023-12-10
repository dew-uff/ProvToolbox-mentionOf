package org.openprovenance.prov.vanilla;

import org.openprovenance.apache.commons.lang.builder.*;
import org.openprovenance.prov.model.QualifiedName;


public class MentionOf implements org.openprovenance.prov.model.MentionOf, Equals, HashCode, ToString {

    private final QualifiedName QUALIFIED_NAME_XSD_STRING = ProvFactory.getFactory().getName().XSD_STRING;

    protected QualifiedName specificEntity;
    protected QualifiedName generalEntity;

    protected QualifiedName bundle;


    static final ProvUtilities u=new ProvUtilities();



    private MentionOf() {}



    public MentionOf(QualifiedName specificEntity,
                     QualifiedName generalEntity,
                     QualifiedName bundle) {
        this.specificEntity = specificEntity;
        this.generalEntity = generalEntity;
        this.bundle = bundle;
    }



    @Override
    public void setSpecificEntity(QualifiedName aid) {
        this.specificEntity =aid;
    }

    @Override
    public void setGeneralEntity(QualifiedName eid) {
        this.generalEntity =eid;
    }

    @Override
    public void setBundle(QualifiedName bid) {
        this.bundle =bid;
    }

    @Override
    public QualifiedName getGeneralEntity() {
        return generalEntity;
    }

    @Override
    public QualifiedName getSpecificEntity() {
        return specificEntity;
    }

    @Override
    public QualifiedName getBundle() {
        return bundle;
    }

    @Override
    public Kind getKind() {
        return Kind.PROV_MENTION;
    }


    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MentionOf)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final MentionOf that = ((MentionOf) object);
        equalsBuilder.append(this.getSpecificEntity(), that.getSpecificEntity());
        equalsBuilder.append(this.getGeneralEntity(),  that.getGeneralEntity());
        equalsBuilder.append(this.getBundle(),  that.getBundle());
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getSpecificEntity());
        hashCodeBuilder.append(this.getGeneralEntity());
        hashCodeBuilder.append(this.getBundle());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {



        {
            QualifiedName theSpecificEntity;
            theSpecificEntity = this.getSpecificEntity();
            toStringBuilder.append("specificEntity", theSpecificEntity);
        }

        {
            QualifiedName theGeneralEntity;
            theGeneralEntity = this.getGeneralEntity();
            toStringBuilder.append("generalEntity", theGeneralEntity);
        }

        {
            QualifiedName theBundleEntity;
            theBundleEntity = this.getBundle();
            toStringBuilder.append("bundle", theBundleEntity);
        }




    }

    @Override
    public String toString() {
        final ToStringBuilder toStringBuilder = new ToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }


}

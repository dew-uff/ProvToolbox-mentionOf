package org.openprovenance.prov.model.builder;

import org.openprovenance.prov.model.ModelConstructor;
import org.openprovenance.prov.model.ModelConstructorExtension;
import org.openprovenance.prov.model.ProvFactory;
import org.openprovenance.prov.model.QualifiedName;

public class MentionOfBuilder extends GenericBuilder<MentionOfBuilder>{
    protected final ModelConstructorExtension mce;
    protected QualifiedName specificEntity;
    protected QualifiedName generalEntity;
    protected QualifiedName bundle;


    public MentionOfBuilder(Builder builder, ModelConstructor mc, ModelConstructorExtension mce, ProvFactory pf) {
        super(builder,mc,pf);
        this.mce=mce;
    }
    public MentionOfBuilder specificEntity(QualifiedName specificEntity) {
        this.specificEntity=specificEntity;
        return this;
    }
    public MentionOfBuilder specificEntity(String prefix, String local) {
        this.specificEntity = qn(prefix,local);
        return this;
    }
    public MentionOfBuilder specificEntity(String knownAs) {
        QualifiedName qn=parent.knownAs.get(knownAs);
        if (qn==null) throw new NullPointerException("specificEntity cannot find knownAs " + knownAs + " in " + parent.knownAs.keySet());
        this.specificEntity =qn;
        return this;
    }
    public MentionOfBuilder generalEntity(QualifiedName generalEntity) {
        this.generalEntity=generalEntity;
        return this;
    }
    public MentionOfBuilder generalEntity(String knownAs) {
        QualifiedName qn=parent.knownAs.get(knownAs);
        if (qn==null) throw new NullPointerException("generalEntity cannot find knownAs " + knownAs + " in " + parent.knownAs);
        this.generalEntity=qn;
        return this;
    }
    public MentionOfBuilder generalEntity(String prefix, String local) {
        this.generalEntity = qn(prefix,local);
        return this;
    }
    public MentionOfBuilder bundle(QualifiedName bundle) {
        this.bundle=bundle;
        return this;
    }
    public MentionOfBuilder bundle(String knownAs) {
        QualifiedName qn=parent.knownAs.get(knownAs);
        if (qn==null) throw new NullPointerException("bundle cannot find knownAs " + knownAs + " in " + parent.knownAs);
        this.bundle=qn;
        return this;
    }
    public MentionOfBuilder bundle(String prefix, String local) {
        this.bundle = qn(prefix,local);
        return this;
    }

    public Builder build() {
        parent.statements.add(mc.newMentionOf(specificEntity, generalEntity,bundle));
        return parent;
    }

}

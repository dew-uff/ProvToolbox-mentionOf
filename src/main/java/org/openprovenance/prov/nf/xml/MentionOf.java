package org.openprovenance.prov.nf.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.openprovenance.prov.model.StatementOrBundle.Kind;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


@JacksonXmlRootElement(localName="mentionOf")
public class MentionOf implements Statement {
	public List<String> id;
	public List<String> specificEntity;
	public List<String> generalEntity;
	public List<String> bundle;
	public List<Attr> attr;
	

	@Override
	public Kind getKind() {
		return Kind.PROV_MENTION;
	}
	
	@Override
	public void normalize() {
		Collections.sort(id);
		Collections.sort(specificEntity);
		Collections.sort(generalEntity);
		Collections.sort(bundle);
		Collections.sort(attr);			
		
	}
	
	@Override
	public List<Attr> getAttr() {
		return attr;
	}
	
	@Override
	public LinkedList<List<String>> paramsAsListsofStrings() {
		LinkedList<List<String>> l1=new LinkedList<List<String>>();
		l1.add(id);
		l1.add(specificEntity);
		l1.add(generalEntity);
		l1.add(bundle);
		return l1;
	}	
}

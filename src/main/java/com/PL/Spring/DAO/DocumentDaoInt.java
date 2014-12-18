package com.PL.Spring.DAO;

import java.util.List;
import java.util.Set;

import com.PL.Spring.Entities.Document;

public interface DocumentDaoInt {
	
	void addDocument(Document doc);
	void editDocument(Document doc);
	void deleteLDocument(Long docID,Long moduleId);
	Document findDocument(Long docID);
	Document findDocumentByTitle(String nomdoc);
	List<Document> getAllDocuments();
	//List<Document> getAllDocumentsByProfessor();

}
